package com.hzjc.hz2004.vo;

import java.lang.reflect.*;

import org.apache.commons.beanutils.*;
import com.hzjc.hz2004.po.*;

/**
 * Ǩ������������Ϣ��ȡ������Ϣ
 * <p>Title: hz2004</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) GNT 2004</p>
 * <p>Company: </p>
 * @author bini_min@hotmail.com
 * @version 1.0
 */

public class VoQrspspxxHqFhxx {

  //��������������Ϣ
  private Long spywid; //����ҵ��ID
  private String splx; //��������
  private String slrq; //��������
  private String xm; //����
  private Long ryid; //��ԱID
  private String xb; //�Ա�
  private String gmsfhm; //�������ݺ���
  private String csrq; //��������
  private String mz;//����
  private String jhny; //�������
  private String yjrclx; //�����˲�����
  private String yrdwjcyrysj; //���˵�λ����ҵ��Աʱ��
  private String lxdh; //��ϵ�绰
  private String byxx; //��ҵѧУ
  private String whcd; //�Ļ��̶�
  private String bysj; //��ҵʱ��
  private String zyzl; //רҵ����
  private String byzsh; //��ҵ֤���
  private String zyjszc; //רҵ����ְ��
  private String jszsh; //����֤���
  private String jsfzjg; //������֤����
  private String fmzlmc; //����ר������
  private String fmzlh; //����ר����
  private String zlfzjg; //ר����֤����
  private String hb; //����
  private String qrhhb; //Ǩ��󻧱�
  private String zzssxq; //סַʡ������
  private String zzxz; //סַ��ַ
  private String hkszddjjg; //�������ڵصǼǻ���
  private String qrdqx; //Ǩ�������
  private String qrdpcs; //Ǩ����ɳ���
  private String qrdjwzrq; //Ǩ��ؾ���������
  private String qrdxzjd; //Ǩ�������ֵ�
  private String qrdjwh; //Ǩ��ؾ�ίԱ��
  private String qrdjlx; //Ǩ��ؽ�·��
  private String qrdmlph; //Ǩ�����¥�ƺ�
  private String qrdz; //Ǩ���ַ
  private String qrdhkdjjg; //Ǩ��ػ��ڵǼǻ���
  private Long qrdhhid; //Ǩ��ػ���ID
  private String qrdhlx; //Ǩ��ػ�����
  private String rlhbz; //��������־
  private String sqqrly; //����Ǩ������
  private String bz; //��ע
  private Long djrid; //�Ǽ���ID
  private String djsj; //�Ǽ�ʱ��
  private Long xydzid; //��һ����ID
  private String spjg; //�������
  private String lsbz; //��ʵ��־
  private Long rynbid; //��Ա�ڲ�ID
  private Long hjywid; //����ҵ��ID

  private String sqrgmsfhm; //�����˹������ݺ���
  private Long spmbid; //����ģ��ID
  private String sqrxm; //����������
  private String sqrzzssxq; //������סַʡ������
  private String sqrzzxz; //������סַ��ַ
  private String sqrhkdjjg; //�����˻��ڵǼǻ���
  private String ysqrgx; //�������˹�ϵ

  private String spsm; //����˵��

  //������ˮ��Ϣ
  private Long splsid; //������ˮID
  //private Long spywid; //����ҵ��ID
  //private String splx;//��������
  private Long dzid; //����ID
  private String czjg; //�������
  private String czyj; //�������
  private Long czrid; //������ID
  private String czsj; //����ʱ��

  //����������Ϣ
  //private Long dzid; //����ID
  private String dzmc; //��������
  private String ms; //����
  private String qybz; //���ñ�־

  //��һ����_����������Ϣ
  private String xydz_dzmc; //��������
  private String xydz_ms; //����
  private String xydz_qybz; //���ñ�־
  private String nyzyrklhczyydm;
  public VoQrspspxxHqFhxx() {
  }

  public VoQrspspxxHqFhxx(PoHJSP_HJSPSQB poHjspsqxx, PoHJSP_HJSPLSB poHjsplsxx,
                          PoXT_SPDZB poSpdzxx, PoXT_SPDZB poXyspdzxx) {
    try {
      if (poHjspsqxx != null) {
        BeanUtils.copyProperties(this, poHjspsqxx);
      }
      if (poHjsplsxx != null) {
        BeanUtils.copyProperties(this, poHjsplsxx);
      }
      if (poSpdzxx != null) {
        BeanUtils.copyProperties(this, poSpdzxx);
      }
      if (poXyspdzxx != null) {
        this.setXydz_dzmc(poXyspdzxx.getDzmc());
        this.setXydz_ms(poXyspdzxx.getMs());
        this.setXydz_qybz(poXyspdzxx.getQybz());
      }
    }
    catch (InvocationTargetException ex) {
    }
    catch (IllegalAccessException ex) {
    }

  }

  public String getBysj() {
    return bysj;
  }

  public void setBysj(String bysj) {
    this.bysj = bysj;
  }

  public String getByxx() {
    return byxx;
  }

  public void setByxx(String byxx) {
    this.byxx = byxx;
  }

  public String getByzsh() {
    return byzsh;
  }

  public void setByzsh(String byzsh) {
    this.byzsh = byzsh;
  }

  public String getBz() {
    return bz;
  }

  public void setBz(String bz) {
    this.bz = bz;
  }

  public String getCsrq() {
    return csrq;
  }

  public void setCsrq(String csrq) {
    this.csrq = csrq;
  }

  public String getMz() {
    return mz;
  }

  public void setMz(String mz) {
    this.mz = mz;
  }

  public String getCzjg() {
    return czjg;
  }

  public void setCzjg(String czjg) {
    this.czjg = czjg;
  }

  public Long getCzrid() {
    return czrid;
  }

  public void setCzrid(Long czrid) {
    this.czrid = czrid;
  }

  public String getCzsj() {
    return czsj;
  }

  public void setCzsj(String czsj) {
    this.czsj = czsj;
  }

  public String getCzyj() {
    return czyj;
  }

  public void setCzyj(String czyj) {
    this.czyj = czyj;
  }

  public Long getDjrid() {
    return djrid;
  }

  public void setDjsj(String djsj) {
    this.djsj = djsj;
  }

  public String getDjsj() {
    return djsj;
  }

  public void setDjrid(Long djrid) {
    this.djrid = djrid;
  }

  public Long getDzid() {
    return dzid;
  }

  public void setDzid(Long dzid) {
    this.dzid = dzid;
  }

  public String getDzmc() {
    return dzmc;
  }

  public void setDzmc(String dzmc) {
    this.dzmc = dzmc;
  }

  public String getFmzlh() {
    return fmzlh;
  }

  public void setFmzlh(String fmzlh) {
    this.fmzlh = fmzlh;
  }

  public String getFmzlmc() {
    return fmzlmc;
  }

  public void setFmzlmc(String fmzlmc) {
    this.fmzlmc = fmzlmc;
  }

  public String getGmsfhm() {
    return gmsfhm;
  }

  public void setGmsfhm(String gmsfhm) {
    this.gmsfhm = gmsfhm;
  }

  public String getHb() {
    return hb;
  }

  public void setHb(String hb) {
    this.hb = hb;
  }

  public Long getHjywid() {
    return hjywid;
  }

  public void setHjywid(Long hjywid) {
    this.hjywid = hjywid;
  }

  public String getHkszddjjg() {
    return hkszddjjg;
  }

  public void setHkszddjjg(String hkszddjjg) {
    this.hkszddjjg = hkszddjjg;
  }

  public String getJhny() {
    return jhny;
  }

  public void setJhny(String jhny) {
    this.jhny = jhny;
  }

  public String getJsfzjg() {
    return jsfzjg;
  }

  public void setJsfzjg(String jsfzjg) {
    this.jsfzjg = jsfzjg;
  }

  public String getJszsh() {
    return jszsh;
  }

  public void setJszsh(String jszsh) {
    this.jszsh = jszsh;
  }

  public String getLsbz() {
    return lsbz;
  }

  public void setLsbz(String lsbz) {
    this.lsbz = lsbz;
  }

  public String getLxdh() {
    return lxdh;
  }

  public void setLxdh(String lxdh) {
    this.lxdh = lxdh;
  }

  public String getMs() {
    return ms;
  }

  public void setMs(String ms) {
    this.ms = ms;
  }

  public Long getQrdhhid() {
    return qrdhhid;
  }

  public void setQrdhhid(Long qrdhhid) {
    this.qrdhhid = qrdhhid;
  }

  public String getQrdhkdjjg() {
    return qrdhkdjjg;
  }

  public void setQrdhkdjjg(String qrdhkdjjg) {
    this.qrdhkdjjg = qrdhkdjjg;
  }

  public String getQrdhlx() {
    return qrdhlx;
  }

  public void setQrdhlx(String qrdhlx) {
    this.qrdhlx = qrdhlx;
  }

  public String getQrdjlx() {
    return qrdjlx;
  }

  public void setQrdjlx(String qrdjlx) {
    this.qrdjlx = qrdjlx;
  }

  public String getQrdjwh() {
    return qrdjwh;
  }

  public void setQrdjwh(String qrdjwh) {
    this.qrdjwh = qrdjwh;
  }

  public String getQrdjwzrq() {
    return qrdjwzrq;
  }

  public void setQrdjwzrq(String qrdjwzrq) {
    this.qrdjwzrq = qrdjwzrq;
  }

  public String getQrdmlph() {
    return qrdmlph;
  }

  public void setQrdmlph(String qrdmlph) {
    this.qrdmlph = qrdmlph;
  }

  public String getQrdpcs() {
    return qrdpcs;
  }

  public void setQrdpcs(String qrdpcs) {
    this.qrdpcs = qrdpcs;
  }

  public String getQrdqx() {
    return qrdqx;
  }

  public void setQrdqx(String qrdqx) {
    this.qrdqx = qrdqx;
  }

  public String getQrdxzjd() {
    return qrdxzjd;
  }

  public void setQrdxzjd(String qrdxzjd) {
    this.qrdxzjd = qrdxzjd;
  }

  public String getQrdz() {
    return qrdz;
  }

  public void setQrdz(String qrdz) {
    this.qrdz = qrdz;
  }

  public String getQybz() {
    return qybz;
  }

  public void setQybz(String qybz) {
    this.qybz = qybz;
  }

  public String getRlhbz() {
    return rlhbz;
  }

  public void setRlhbz(String rlhbz) {
    this.rlhbz = rlhbz;
  }

  public Long getRyid() {
    return ryid;
  }

  public void setRyid(Long ryid) {
    this.ryid = ryid;
  }

  public Long getRynbid() {
    return rynbid;
  }

  public void setRynbid(Long rynbid) {
    this.rynbid = rynbid;
  }

  public String getSlrq() {
    return slrq;
  }

  public void setSlrq(String slrq) {
    this.slrq = slrq;
  }

  public String getSpjg() {
    return spjg;
  }

  public void setSpjg(String spjg) {
    this.spjg = spjg;
  }

  public Long getSplsid() {
    return splsid;
  }

  public void setSplsid(Long splsid) {
    this.splsid = splsid;
  }

  public String getSplx() {
    return splx;
  }

  public void setSplx(String splx) {
    this.splx = splx;
  }

  public Long getSpywid() {
    return spywid;
  }

  public void setSpywid(Long spywid) {
    this.spywid = spywid;
  }

  public String getSqqrly() {
    return sqqrly;
  }

  public void setSqqrly(String sqqrly) {
    this.sqqrly = sqqrly;
  }

  public String getWhcd() {
    return whcd;
  }

  public void setWhcd(String whcd) {
    this.whcd = whcd;
  }

  public String getXb() {
    return xb;
  }

  public void setXb(String xb) {
    this.xb = xb;
  }

  public String getXm() {
    return xm;
  }

  public void setXydz_dzmc(String xydz_dzmc) {
    this.xydz_dzmc = xydz_dzmc;
  }

  public String getXydz_dzmc() {
    return xydz_dzmc;
  }

  public void setXm(String xm) {
    this.xm = xm;
  }

  public String getXydz_ms() {
    return xydz_ms;
  }

  public void setXydz_ms(String xydz_ms) {
    this.xydz_ms = xydz_ms;
  }

  public String getXydz_qybz() {
    return xydz_qybz;
  }

  public void setXydz_qybz(String xydz_qybz) {
    this.xydz_qybz = xydz_qybz;
  }

  public Long getXydzid() {
    return xydzid;
  }

  public void setXydzid(Long xydzid) {
    this.xydzid = xydzid;
  }

  public String getYjrclx() {
    return yjrclx;
  }

  public void setYjrclx(String yjrclx) {
    this.yjrclx = yjrclx;
  }

  public String getYrdwjcyrysj() {
    return yrdwjcyrysj;
  }

  public void setYrdwjcyrysj(String yrdwjcyrysj) {
    this.yrdwjcyrysj = yrdwjcyrysj;
  }

  public String getZlfzjg() {
    return zlfzjg;
  }

  public void setZlfzjg(String zlfzjg) {
    this.zlfzjg = zlfzjg;
  }

  public String getZyjszc() {
    return zyjszc;
  }

  public void setZyjszc(String zyjszc) {
    this.zyjszc = zyjszc;
  }

  public String getZyzl() {
    return zyzl;
  }

  public void setZyzl(String zyzl) {
    this.zyzl = zyzl;
  }

  public String getZzssxq() {
    return zzssxq;
  }

  public void setZzssxq(String zzssxq) {
    this.zzssxq = zzssxq;
  }

  public String getZzxz() {
    return zzxz;
  }

  public void setZzxz(String zzxz) {
    this.zzxz = zzxz;
  }

  public Long getSpmbid() {
    return spmbid;
  }

  public void setSpmbid(Long spmbid) {
    this.spmbid = spmbid;
  }

  public String getSqrgmsfhm() {
    return sqrgmsfhm;
  }

  public void setSqrgmsfhm(String sqrgmsfhm) {
    this.sqrgmsfhm = sqrgmsfhm;
  }

  public String getSqrhkdjjg() {
    return sqrhkdjjg;
  }

  public void setSqrhkdjjg(String sqrhkdjjg) {
    this.sqrhkdjjg = sqrhkdjjg;
  }

  public String getSqrxm() {
    return sqrxm;
  }

  public void setSqrxm(String sqrxm) {
    this.sqrxm = sqrxm;
  }

  public String getSqrzzssxq() {
    return sqrzzssxq;
  }

  public void setSqrzzssxq(String sqrzzssxq) {
    this.sqrzzssxq = sqrzzssxq;
  }

  public String getSqrzzxz() {
    return sqrzzxz;
  }

  public void setSqrzzxz(String sqrzzxz) {
    this.sqrzzxz = sqrzzxz;
  }

  public String getYsqrgx() {
    return ysqrgx;
  }

  public void setYsqrgx(String ysqrgx) {
    this.ysqrgx = ysqrgx;
  }

  public String getSpsm() {
    return spsm;
  }

  public void setSpsm(String spsm) {
    this.spsm = spsm;
  }

  public String getQrhhb() {
    return qrhhb;
  }

  public String getNyzyrklhczyydm() {
    return nyzyrklhczyydm;
  }

  public void setQrhhb(String qrhhb) {
    this.qrhhb = qrhhb;
  }

  public void setNyzyrklhczyydm(String nyzyrklhczyydm) {
    this.nyzyrklhczyydm = nyzyrklhczyydm;
  }

}