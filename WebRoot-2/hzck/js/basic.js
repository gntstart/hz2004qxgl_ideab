function processException(e){
	switch (typeof(e)){
		case "string":{
			if (e!="abort"){
				if (e)
					alert(e);
				else
					alert(constErrUnknown);
			}
			break;
		}

		case "object":{
			alert(e.description+"\n"+constErrType+":"+(e.number & 0xFFFF));
			break;
		}
	}
}

function trimStr(sInString){
	sInString = sInString.replace( /^\s+/g, "" );// strip leading
	sInString = xreplace(sInString,"??", "" );
  return sInString.replace( /\s+$/g, "" );// strip trailing

}
function xreplace(checkMe,toberep,repwith){

var temp = checkMe;

var i = temp.indexOf(toberep);

while(i > -1)

{

temp = temp.replace(toberep, repwith);

i = temp.indexOf(toberep);

}

return temp;

}

function getValidStr(str) {
	str+="";
	if (str=="undefined" || str=="null")
		return "";
	else
		return str;
}

function encode(strIn)
{
	var intLen=strIn.length;
	var strOut="";
	var strTemp;
	var strFlag="";

	for(var i=0;i<intLen;i++)
	{
		strTemp=strIn.charCodeAt(i);
		if (strTemp>255)
		{
			if (strFlag=="")
			{
				strFlag="#";
				strOut=strOut+"[#"+strTemp.toString(16);
			}
			else if (strFlag=="~")
			{
				strFlag="#";
				strOut=strOut+"#"+strTemp.toString(16);
			}
			else if (strFlag=="#")
			{
				strOut=strOut+strTemp.toString(16);
			}
		}
		else
		{
			if (strTemp < 48 || (strTemp > 57 && strTemp < 65) || (strTemp > 90 && strTemp < 97) || strTemp > 122)
			{
				var tmp=strTemp.toString(16);
				if (tmp.length==1) tmp = "0"+tmp;
				if (strFlag=="")
				{
					strFlag="~";
					strOut=strOut+"[~"+tmp;
				}
				else if (strFlag=="#")
				{
					strFlag="~";
					strOut=strOut+"~"+tmp;
				}
				else if (strFlag=="~")
				{
					strOut=strOut+tmp;
				}
			}
			else
			{
				if (strFlag=="#" || strFlag=="~")
				{
					strFlag="";
					strOut=strOut+"]"+strIn.charAt(i);
				}
				else
				{
					strOut=strOut+strIn.charAt(i);
				}
			}
		}
	}
	return (strOut);
}

function decode(strIn)
{
	var intLen=strIn.length;
	var strOut="";
	var strTemp;
	var strFlag="";

	for(var i=0;i<intLen;i++)
	{
		strTemp=strIn.charAt(i);
		if (strTemp=="[")
		{
			i++;
			strTemp=strIn.charAt(i);
		}
		if (strTemp=="]")
		{
			strFlag="";
			continue;
		}
		if (strTemp=="~")
		{
			i++;
			strFlag="~";
		}
		if (strTemp=="#")
		{
			i++;
			strFlag="#";
		}
		switch (strFlag)
		{
			case "~":{
				strTemp=strIn.substring(i,i+2);
				strTemp=parseInt(strTemp,16);
				if (strTemp==218)
					strTemp=String.fromCharCode(13, 10);
				else
					strTemp=String.fromCharCode(strTemp);
				strOut=strOut+strTemp;
				i++;
				break;
			}
			case "#":{
				strTemp=strIn.substring(i,i+4);
				strTemp=parseInt(strTemp,16);
				i+=3;
				strTemp=String.fromCharCode(strTemp);
				strOut=strOut+strTemp;
				break;
			}
			case "":{
				strOut=strOut+strTemp;
				break;
			}
		}

	}
	return (strOut);
}

function getEncodeStr(str) {
	return encode(getValidStr(str));
}

function getDecodeStr(str) {
	return ((str)?decode(getValidStr(str)):"");
}

function compareText(str1, str2){
	str1=getValidStr(str1);
	str2=getValidStr(str2);
	if (str1==str2) return true;
	if (str1=="" || str2=="") return false;
	return (str1.toLowerCase()==str2.toLowerCase());
}

function isTrue(value){
	return (value==true || (typeof(value)=="number" && value!=0) ||
		compareText(value, "true") || compareText(value, "T") ||
		compareText(value, "yes") || compareText(value, "on"));
}

function getStringValue(value){
	if (typeof(value)=="string" || typeof(value)=="object")
		return "\""+getValidStr(value)+"\"";
	else if (typeof(value)=="date")
		return "\""+(new Date(value))+"\"";
	else if (getValidStr(value)=="")
		return "\"\"";
	else
		return value;
}

function getInt(value){
	var result=parseInt(value);
	if (isNaN(result)) result=0;
	return result;
}

function getFloat(value){
	var result=parseFloat(value);
	if (isNaN(result)) result=0;
	return result;
}

function formatFloat(value, decimalLength){
	var text=getValidStr(Math.round(getFloat(value)*Math.pow(10, decimalLength)));
	var len=text.length;
	return text.substr(0, len-decimalLength)+"."+text.substr(len-decimalLength, decimalLength);
}

function formatDateTime(date, mode){
	function getDateString(date){
		var years=date.getFullYear();
		var months=date.getMonth()+1;
		var days=date.getDate();
		
		if (months<10) months="0"+months;
		if (days<10) days="0"+days;
		
		return years+"/"+months+"/"+days;
	}
	function getHourString(date){
		var hours=date.getHours();
		
		if (hours<10) hours="0"+hours;
		
		return hours+":00:00";
	}

	function getTimeString(date){
		var hours=date.getHours();
		var minutes=date.getMinutes();
		var seconds=date.getSeconds();
		
		if (hours<10) hours="0"+hours;
		if (minutes<10) minutes="0"+minutes;
		if (seconds<10) seconds="0"+seconds;
		return hours+":"+minutes+":"+seconds;
	}
	
	if (typeof(date)=="object" && !isNaN(date)){
		if (!mode) mode="datetime";
		switch (mode){
			case "date":{
				return getDateString(date);
				break;
			}
			case "time":{
				return getTimeString(date);
				break;
			}
			case "datetime":{
				return getDateString(date)+" "+getTimeString(date);
				break;
			}
			case "datehour":{
				return getDateString(date)+" "+getHourString(date);
				break;
			}
			default:{
				return getDateString(date)+" "+getTimeString(date);
				break;
			}
		}
	}
	else
		return "";
}

function getTypedValue(value, dataType){
	var result="";
	switch (dataType){
		case "float":{
			result=parseFloat(value);
			break;
		}
		case "int":{
			result=Math.round(parseFloat(value));
			break;
		}
		case "date":;
		case "datetime":;
		case "time":{
			result=new Date(value);
			break;
		}
		case "bool":{
			result=isTrue(value);
			break;
		}
		default:{
			result=getValidStr(value);
			break;
		}
	}
	return result;
}

function Vector(){
	this.firstUnit=null;
	this.lastUnit=null;
	this.length=0;
}

function Vector_clear(vector){
	var unit=vector.firstUnit;
	var _unit;
	while (unit){
		_unit=unit;
		unit=unit.nextUnit;
		if (_unit.data) delete _unit.data;
		delete _unit;
	}
	vector.firstUnit=null;
	vector.lastUnit=null;
	vector.length=0;
}

function Vector_insert(vector, mode, unit, newUnit){
	var u1, u2;
	switch (mode){
		case "begin":{
			u1=null;
			u2=vector.firstUnit;
			break;
		}
		case "before":{
			u1=(unit)?unit.prevUnit:null;
			u2=unit;
			break;
		}
		case "after":{
			u1=unit;
			u2=(unit)?unit.nextUnit:null;
			break;
		}
		default:{
			u1=vector.lastUnit;
			u2=null;
			break;
		}
	}

	newUnit.prevUnit=u1;
	newUnit.nextUnit=u2;
	if (u1) u1.nextUnit=newUnit; else vector.firstUnit=newUnit;
	if (u2) u2.prevUnit=newUnit; else vector.lastUnit=newUnit;
	vector.length++;
}

function Vector_insertArray(vector, mode, unit, subArray){
	if (!subArray || !subArray.firstUnit) return;

	var u1, u2;
	switch (mode){
		case "begin":{
			u1=null;
			u2=vector.firstUnit;
			break;
		}
		case "before":{
			u1=(unit)?unit.prevUnit:null;
			u2=unit;
			break;
		}
		case "after":{
			u1=unit;
			u2=(unit)?unit.nextUnit:null;
			break;
		}
		default:{
			u1=vector.lastUnit;
			u2=null;
			break;
		}
	}

	subArray.firstUnit.prevUnit=u1;
	subArray.lastUnit.nextUnit=u2;
	if (u1) u1.nextUnit=subArray.firstUnit; else vector.firstUnit=subArray.firstUnit;
	if (u2) u2.prevUnit=subArray.lastUnit; else vector.lastUnit=subArray.lastUnit;
	vector.length+=subArray.length;
}

function Vector_delete(vector, unit){
	var u1, u2;
	u1=unit.prevUnit;
	u2=unit.nextUnit;
	if (u1) u1.nextUnit=u2; else vector.firstUnit=u2;
	if (u2) u2.prevUnit=u1; else vector.lastUnit=u1;
	delete unit;
	vector.length--;
}

function Vector_ex_insert(vector, data){
	var found=false;
	var _unit=vector.firstUnit;
	while (_unit){
		if (_unit.data==data){
			found=true;
			break;
		}
		_unit=_unit.nextUnit;
	}

	var newUnit=new Object();
	newUnit.data=data;
	if (!found) vector_insert(vector, "end", null, newUnit);
}

function Vector_ex_delete(vector, data){
	var _unit=vector.firstUnit;
	while (_unit){
		if (_unit.data==data){
			vector_delete(vector, _unit);
			break;
		}
		_unit=_unit.nextUnit;
	}
}

function setClientProperty(name, value){
	Response.Write("<INPUT TYPE=hidden id=\"_client_property_"+name+"\" value=\""+getEncodeStr(value)+"\">\n");
}

function getClientProperty(name){
	var value;
	eval("value=getDecodeStr(_client_property_"+name+".value);");
	return value;
} 