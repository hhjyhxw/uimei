package zhumeng.com.uimei.model.dbo.wx;

import java.io.Serializable;
import java.util.Date;

import zhumeng.com.uimei.model.dbo.BaseModel;

public class TWxReply extends BaseModel implements Serializable{
    private Long id;
    private static final long serialVersionUID = 1L;
	private Long appId;		// 微信号id
	private String msgKey;		// 关键字
	private String msgType;		// 类型,1文字2图文
	private String replyMsg;		// 内容图文时，查找图文表
	private String msgEvent;		// 1点击菜单，2输入文本,3订阅关注，4 无法识别的默认回复
	
	 private Date createTime;
	 private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey == null ? null : msgKey.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getMsgEvent() {
        return msgEvent;
    }

    public void setMsgEvent(String msgEvent) {
        this.msgEvent = msgEvent == null ? null : msgEvent.trim();
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg == null ? null : replyMsg.trim();
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}