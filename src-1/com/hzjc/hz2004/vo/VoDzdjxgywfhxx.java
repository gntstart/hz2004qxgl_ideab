package com.hzjc.hz2004.vo;

import com.hzjc.wsstruts.vo.DefaultVO;

/**
 * 地址冻结修改业务返回信息
 * <p>Title: hz2004</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) GNT 2004</p>
 * <p>Company: </p>
 * @author bini_min@hotmail.com
 * @version 1.0
 */
public class VoDzdjxgywfhxx
    extends DefaultVO {

  /**
   * 户籍业务ID
   */
  private Long hjywid;

  /**
   * 地址冻结修改返回信息
   */
  private VoDzdjxgfhxx voDzdjxgfhxx[];

  public Long getHjywid() {
    return hjywid;
  }

  public void setHjywid(Long hjywid) {
    this.hjywid = hjywid;
  }

  public VoDzdjxgfhxx[] getVoDzdjxgfhxx() {
    return voDzdjxgfhxx;
  }

  public void setVoDzdjxgfhxx(VoDzdjxgfhxx[] voDzdjxgfhxx) {
    this.voDzdjxgfhxx = voDzdjxgfhxx;
  }
}
