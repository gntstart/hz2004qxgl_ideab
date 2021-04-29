package com.hzjc.hz2004.vo;

import java.lang.reflect.*;

import org.apache.commons.beanutils.*;
import com.hzjc.hz2004.po.*;
import com.hzjc.wsstruts.vo.*;

public class VoHJXX_CZRKJBXXB
    extends DefaultVO {

  /**
   *
   */
  public VoHJXX_CZRKJBXXB() {
  }

  /**
   *
   * @param po
   */
  public VoHJXX_CZRKJBXXB(PoHJXX_CZRKJBXXB po) {
    try {
      if (po != null) {
        BeanUtils.copyProperties(this, po);
      }
    }
    catch (InvocationTargetException ex) {
    }
    catch (IllegalAccessException ex) {
    }

  }

  /**
   *
   * @return
   */
  public String toString() {
    StringBuffer strBuf = new StringBuffer();
    strBuf.append("常住人口基本信息：[")
        .append(" 姓名=").append(getXm())
        .append(" 公民身份号码=").append(getGmsfhm())
        .append(" 出生日期=").append(getCsrq())
        .append("]");
    return strBuf.toString();
  }

  private Long zpid;
  private Long rynbid;
  private Long ryid;
  private Long hhnbid;
  private Long mlpnbid;
  private String gmsfhm;
  private String xm;
  private String cym;
  private String xmpy;
  private String cympy;
  private String xb;
  private String mz;
  private String csrq;
  private String cssj;
  private String csdgjdq;
  private String csdssxq;
  private String csdxz;
  private String jhryxm;
  private String jhrygmsfhm;
  private String jhryjhgx;
  private String jhrexm;
  private String jhregmsfhm;
  private String jhrejhgx;
  private String fqxm;
  private String fqgmsfhm;
  private String mqxm;
  private String mqgmsfhm;
  private String poxm;
  private String pogmsfhm;
  private String jggjdq;
  private String jgssxq;
  private String zjxy;
  private String whcd;
  private String hyzk;
  private String byzk;
  private String sg;
  private String xx;
  private String zy;
  private String zylb;
  private String fwcs;
  private String xxjb;
  private String rylb;
  private String hb;
  private String yhzgx;
  private String ryzt;
  private Long lxdbid;
  private String bz;
  private Long jlbz;
  private String qysj;
  private String jssj;


  private String xmx;
  private String xmm;
  private String jgxz;
  private String jhryzjzl;
  private String jhryzjhm;
  private String jhrywwx;
  private String jhrywwm;
  private String jhrylxdh;
  private String jhrezjzl;
  private String jhrezjhm;
  private String jhrewwx;
  private String jhrewwm;
  private String jhrelxdh;
  private String fqzjzl;
  private String fqzjhm;
  private String fqwwx;
  private String fqwwm;
  private String mqzjzl;
  private String mqzjhm;
  private String mqwwx;
  private String mqwwm;
  private String pozjzl;
  private String pozjhm;
  private String powwx;
  private String powwm;

  private String yhkxzmc;
  private String yhkxzsj;

  private String bzdz;
  private String bzdzid;
  private String bzdzx;
  private String bzdzy;
  private String bzdzst;
  private String csfldm;
  private String nyzyrklhczyydm;
  private String lzd_cxfldm;

  public String getBzdzst() {
  return bzdzst;
 }
 public void setBzdzst(String bzdzst) {
   this.bzdzst = bzdzst;
 }

  public String getBzdzy() {
  return bzdzy;
 }
 public void setBzdzy(String bzdzy) {
   this.bzdzy = bzdzy;
 }

  public String getBzdzx() {
  return bzdzx;
 }
 public void setBzdzx(String bzdzx) {
   this.bzdzx = bzdzx;
 }

  public void setBzdz(String bzdz) {
    this.bzdz = bzdz;
  }

  public String getBzdz() {
    return bzdz;
  }

  public void setBzdzid(String bzdzid) {
    this.bzdzid = bzdzid;
  }

  public String getBzdzid() {
    return bzdzid;
  }

  public void setYhkxzmc(String yhkxzmc) {
  this.yhkxzmc = yhkxzmc;
}

public String getYhkxzmc() {
  return yhkxzmc;
}

public void setYhkxzsj(String yhkxzsj) {
  this.yhkxzsj = yhkxzsj;
}

public String getYhkxzsj() {
  return yhkxzsj;
  }

  public void setZpid(Long zpid) {
    this.zpid = zpid;
  }

  public Long getZpid() {
    return zpid;
  }

  public void setRynbid(Long rynbid) {
    this.rynbid = rynbid;
  }

  public Long getRynbid() {
    return rynbid;
  }

  public void setRyid(Long ryid) {
    this.ryid = ryid;
  }

  public Long getRyid() {
    return ryid;
  }

  public void setHhnbid(Long hhnbid) {
    this.hhnbid = hhnbid;
  }

  public Long getHhnbid() {
    return hhnbid;
  }

  public void setMlpnbid(Long mlpnbid) {
    this.mlpnbid = mlpnbid;
  }

  public Long getMlpnbid() {
    return mlpnbid;
  }

  public void setGmsfhm(String gmsfhm) {
    this.gmsfhm = gmsfhm;
  }

  public String getGmsfhm() {
    return gmsfhm;
  }

  public void setXm(String xm) {
    this.xm = xm;
  }

  public String getXm() {
    return xm;
  }

  public void setCym(String cym) {
    this.cym = cym;
  }

  public String getCym() {
    return cym;
  }

  public void setXmpy(String xmpy) {
    this.xmpy = xmpy;
  }

  public String getXmpy() {
    return xmpy;
  }

  public void setCympy(String cympy) {
    this.cympy = cympy;
  }

  public String getCympy() {
    return cympy;
  }

  public void setXb(String xb) {
    this.xb = xb;
  }

  public String getXb() {
    return xb;
  }

  public void setMz(String mz) {
    this.mz = mz;
  }

  public String getMz() {
    return mz;
  }

  public void setCsrq(String csrq) {
    this.csrq = csrq;
  }

  public String getCsrq() {
    return csrq;
  }

  public void setCssj(String cssj) {
    this.cssj = cssj;
  }

  public String getCssj() {
    return cssj;
  }

  public void setCsdgjdq(String csdgjdq) {
    this.csdgjdq = csdgjdq;
  }

  public String getCsdgjdq() {
    return csdgjdq;
  }

  public void setCsdssxq(String csdssxq) {
    this.csdssxq = csdssxq;
  }

  public String getCsdssxq() {
    return csdssxq;
  }

  public void setCsdxz(String csdxz) {
    this.csdxz = csdxz;
  }

  public String getCsdxz() {
    return csdxz;
  }

  public void setJhryxm(String jhryxm) {
    this.jhryxm = jhryxm;
  }

  public String getJhryxm() {
    return jhryxm;
  }

  public void setJhrygmsfhm(String jhrygmsfhm) {
    this.jhrygmsfhm = jhrygmsfhm;
  }

  public String getJhrygmsfhm() {
    return jhrygmsfhm;
  }

  public void setJhryjhgx(String jhryjhgx) {
    this.jhryjhgx = jhryjhgx;
  }

  public String getJhryjhgx() {
    return jhryjhgx;
  }

  public void setJhrexm(String jhrexm) {
    this.jhrexm = jhrexm;
  }

  public String getJhrexm() {
    return jhrexm;
  }

  public void setJhregmsfhm(String jhregmsfhm) {
    this.jhregmsfhm = jhregmsfhm;
  }

  public String getJhregmsfhm() {
    return jhregmsfhm;
  }

  public void setJhrejhgx(String jhrejhgx) {
    this.jhrejhgx = jhrejhgx;
  }

  public String getJhrejhgx() {
    return jhrejhgx;
  }

  public void setFqxm(String fqxm) {
    this.fqxm = fqxm;
  }

  public String getFqxm() {
    return fqxm;
  }

  public void setFqgmsfhm(String fqgmsfhm) {
    this.fqgmsfhm = fqgmsfhm;
  }

  public String getFqgmsfhm() {
    return fqgmsfhm;
  }

  public void setMqxm(String mqxm) {
    this.mqxm = mqxm;
  }

  public String getMqxm() {
    return mqxm;
  }

  public void setMqgmsfhm(String mqgmsfhm) {
    this.mqgmsfhm = mqgmsfhm;
  }

  public String getMqgmsfhm() {
    return mqgmsfhm;
  }

  public void setPoxm(String poxm) {
    this.poxm = poxm;
  }

  public String getPoxm() {
    return poxm;
  }

  public void setPogmsfhm(String pogmsfhm) {
    this.pogmsfhm = pogmsfhm;
  }

  public String getPogmsfhm() {
    return pogmsfhm;
  }

  public void setJggjdq(String jggjdq) {
    this.jggjdq = jggjdq;
  }

  public String getJggjdq() {
    return jggjdq;
  }

  public void setJgssxq(String jgssxq) {
    this.jgssxq = jgssxq;
  }

  public String getJgssxq() {
    return jgssxq;
  }

  public void setZjxy(String zjxy) {
    this.zjxy = zjxy;
  }

  public String getZjxy() {
    return zjxy;
  }

  public void setWhcd(String whcd) {
    this.whcd = whcd;
  }

  public String getWhcd() {
    return whcd;
  }

  public void setHyzk(String hyzk) {
    this.hyzk = hyzk;
  }

  public String getHyzk() {
    return hyzk;
  }

  public void setByzk(String byzk) {
    this.byzk = byzk;
  }

  public String getByzk() {
    return byzk;
  }

  public void setSg(String sg) {
    this.sg = sg;
  }

  public String getSg() {
    return sg;
  }

  public void setXx(String xx) {
    this.xx = xx;
  }

  public String getXx() {
    return xx;
  }

  public void setZy(String zy) {
    this.zy = zy;
  }

  public String getZy() {
    return zy;
  }

  public void setZylb(String zylb) {
    this.zylb = zylb;
  }

  public String getZylb() {
    return zylb;
  }

  public void setFwcs(String fwcs) {
    this.fwcs = fwcs;
  }

  public String getFwcs() {
    return fwcs;
  }

  public void setXxjb(String xxjb) {
    this.xxjb = xxjb;
  }

  public String getXxjb() {
    return xxjb;
  }

  public void setRylb(String rylb) {
    this.rylb = rylb;
  }

  public String getRylb() {
    return rylb;
  }

  public void setHb(String hb) {
    this.hb = hb;
  }

  public String getHb() {
    return hb;
  }

  public void setYhzgx(String yhzgx) {
    this.yhzgx = yhzgx;
  }

  public String getYhzgx() {
    return yhzgx;
  }

  public void setRyzt(String ryzt) {
    this.ryzt = ryzt;
  }

  public String getRyzt() {
    return ryzt;
  }

  public void setLxdbid(Long lxdbid) {
    this.lxdbid = lxdbid;
  }

  public Long getLxdbid() {
    return lxdbid;
  }

  public void setBz(String bz) {
    this.bz = bz;
  }

  public String getBz() {
    return bz;
  }

  public void setJlbz(Long jlbz) {
    this.jlbz = jlbz;
  }

  public Long getJlbz() {
    return jlbz;
  }

  public void setQysj(String qysj) {
    this.qysj = qysj;
  }

  public String getQysj() {
    return qysj;
  }

  public void setJssj(String jssj) {
    this.jssj = jssj;
  }

  public String getJssj() {
    return jssj;
  }


  public String getXmx() {
          return xmx;
  }
  public void setXmx(String xmx) {
          this.xmx = xmx;
  }
  public String getXmm() {
          return xmm;
  }
  public void setXmm(String xmm) {
          this.xmm = xmm;
  }
  public String getJgxz() {
          return jgxz;
  }
  public void setJgxz(String jgxz) {
          this.jgxz = jgxz;
  }
  public String getJhryzjzl() {
          return jhryzjzl;
  }
  public void setJhryzjzl(String jhryzjzl) {
          this.jhryzjzl = jhryzjzl;
  }
  public String getJhryzjhm() {
          return jhryzjhm;
  }
  public void setJhryzjhm(String jhryzjhm) {
          this.jhryzjhm = jhryzjhm;
  }
  public String getJhrywwx() {
          return jhrywwx;
  }
  public void setJhrywwx(String jhrywwx) {
          this.jhrywwx = jhrywwx;
  }
  public String getJhrywwm() {
          return jhrywwm;
  }
  public void setJhrywwm(String jhrywwm) {
          this.jhrywwm = jhrywwm;
  }
  public String getJhrylxdh() {
          return jhrylxdh;
  }
  public void setJhrylxdh(String jhrylxdh) {
          this.jhrylxdh = jhrylxdh;
  }
  public String getJhrezjzl() {
          return jhrezjzl;
  }
  public void setJhrezjzl(String jhrezjzl) {
          this.jhrezjzl = jhrezjzl;
  }
  public String getJhrezjhm() {
          return jhrezjhm;
  }
  public void setJhrezjhm(String jhrezjhm) {
          this.jhrezjhm = jhrezjhm;
  }
  public String getJhrewwx() {
          return jhrewwx;
  }
  public void setJhrewwx(String jhrewwx) {
          this.jhrewwx = jhrewwx;
  }
  public String getJhrewwm() {
          return jhrewwm;
  }
  public void setJhrewwm(String jhrewwm) {
          this.jhrewwm = jhrewwm;
  }
  public String getJhrelxdh() {
          return jhrelxdh;
  }
  public void setJhrelxdh(String jhrelxdh) {
          this.jhrelxdh = jhrelxdh;
  }
  public String getFqzjzl() {
          return fqzjzl;
  }
  public void setFqzjzl(String fqzjzl) {
          this.fqzjzl = fqzjzl;
  }
  public String getFqzjhm() {
          return fqzjhm;
  }
  public void setFqzjhm(String fqzjhm) {
          this.fqzjhm = fqzjhm;
  }
  public String getFqwwx() {
          return fqwwx;
  }
  public void setFqwwx(String fqwwx) {
          this.fqwwx = fqwwx;
  }
  public String getFqwwm() {
          return fqwwm;
  }
  public void setFqwwm(String fqwwm) {
          this.fqwwm = fqwwm;
  }
  public String getMqzjzl() {
          return mqzjzl;
  }
  public void setMqzjzl(String mqzjzl) {
          this.mqzjzl = mqzjzl;
  }
  public String getMqzjhm() {
          return mqzjhm;
  }
  public void setMqzjhm(String mqzjhm) {
          this.mqzjhm = mqzjhm;
  }
  public String getMqwwx() {
          return mqwwx;
  }
  public void setMqwwx(String mqwwx) {
          this.mqwwx = mqwwx;
  }
  public String getMqwwm() {
          return mqwwm;
  }
  public void setMqwwm(String mqwwm) {
          this.mqwwm = mqwwm;
  }
  public String getPozjzl() {
          return pozjzl;
  }
  public void setPozjzl(String pozjzl) {
          this.pozjzl = pozjzl;
  }
  public String getPozjhm() {
          return pozjhm;
  }
  public void setPozjhm(String pozjhm) {
          this.pozjhm = pozjhm;
  }
  public String getPowwx() {
          return powwx;
  }
  public void setPowwx(String powwx) {
          this.powwx = powwx;
  }
  public String getPowwm() {
          return powwm;
  }

  public String getCsfldm() {
    return csfldm;
  }

  public String getLzd_cxfldm() {
    return lzd_cxfldm;
  }

  public String getNyzyrklhczyydm() {
    return nyzyrklhczyydm;
  }

  public void setPowwm(String powwm) {
          this.powwm = powwm;
  }

  public void setCsfldm(String csfldm) {
    this.csfldm = csfldm;
  }

  public void setLzd_cxfldm(String lzd_cxfldm) {
    this.lzd_cxfldm = lzd_cxfldm;
  }

  public void setNyzyrklhczyydm(String nyzyrklhczyydm) {
    this.nyzyrklhczyydm = nyzyrklhczyydm;
  }

}
