package com.hzjc.hz2004.vo;

import com.hzjc.wsstruts.vo.DefaultVO;

/**
 * 户籍删除返回信息
 * <p>Title: hz2004</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) GNT 2004</p>
 * <p>Company: </p>
 * @author bini_min@hotmail.com
 * @version 1.0
 */
public class VoHjscfhxx
    extends DefaultVO {

  private Long hjscid; //户籍删除ID
  private Long rynbid; //人员内部ID
  private Long ryid; //人员ID
  private Long hhnbid; //户号内部ID
  private Long old_rynbid;
  private String xm; //姓名
  private String gmsfhm; //公民身份号码
  private String yhzgx; //与户主关系

  public String getGmsfhm() {
    return gmsfhm;
  }

  public void setGmsfhm(String gmsfhm) {
    this.gmsfhm = gmsfhm;
  }

  public String getXm() {
    return xm;
  }

  public void setXm(String xm) {
    this.xm = xm;
  }

  public Long getHjscid() {
    return hjscid;
  }

  public void setHjscid(Long hjscid) {
    this.hjscid = hjscid;
  }

  public Long getRynbid() {
    return rynbid;
  }

  public void setRynbid(Long rynbid) {
    this.rynbid = rynbid;
  }

  public Long getOld_rynbid() {
    return old_rynbid;
  }

  public void setOld_rynbid(Long old_rynbid) {
    this.old_rynbid = old_rynbid;
  }

  public Long getRyid() {
    return ryid;
  }

  public void setRyid(Long ryid) {
    this.ryid = ryid;
  }

  public Long getHhnbid() {
    return hhnbid;
  }

  public void setHhnbid(Long hhnbid) {
    this.hhnbid = hhnbid;
  }

  public String getYhzgx() {
    return yhzgx;
  }

  public void setYhzgx(String yhzgx) {
    this.yhzgx = yhzgx;
  }

}
