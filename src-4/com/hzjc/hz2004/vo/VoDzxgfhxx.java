package com.hzjc.hz2004.vo;

import com.hzjc.wsstruts.vo.DefaultVO;

/**
 * ��ַ�޸ķ�����Ϣ
 * <p>Title: hz2004</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) GNT 2004</p>
 * <p>Company: </p>
 * @author bini_min@hotmail.com
 * @version 1.0
 */
public class VoDzxgfhxx
    extends DefaultVO {

  /**
   * �ţ�¥�����ڲ�ID
   */
  private Long mlpnbid;
  private Long old_mlpnbid; //�ϵ���¥���ڲ�ID

  public Long getMlpnbid() {
    return mlpnbid;
  }

  public void setMlpnbid(Long mlpnbid) {
    this.mlpnbid = mlpnbid;
  }

  public Long getOld_mlpnbid() {
    return old_mlpnbid;
  }

  public void setOld_mlpnbid(Long old_mlpnbid) {
    this.old_mlpnbid = old_mlpnbid;
  }
}