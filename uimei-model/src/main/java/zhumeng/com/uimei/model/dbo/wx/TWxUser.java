package zhumeng.com.uimei.model.dbo.wx;

import java.io.Serializable;
import java.util.Date;

import zhumeng.com.uimei.model.dbo.BaseModel;

public class TWxUser extends BaseModel implements Serializable{
	
	private static final long serialVersionUID = 1L;

    private Long id;
    private String openid;		// openid
	private String xcOpenid;		// 小程序openid
	private String unionid;		// unionid
	private String nick;		// 昵称
	private String pic;		// 图标url
	private String sex;		// 性别1男2女
	private String subscribeFlag;		// 是否关注，1是0否
	private Date subscribeDate;		// 关注时间
	private Date unsubscribeDate;		// 取消时间
	private String lastIp;		// 最后登录ip
	private Date lastDate;		// 最后登录时间
	private String name;		// 姓名
	private String telphone;		// 手机
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getXcOpenid() {
        return xcOpenid;
    }

    public void setXcOpenid(String xcOpenid) {
        this.xcOpenid = xcOpenid == null ? null : xcOpenid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSubscribeFlag() {
        return subscribeFlag;
    }

    public void setSubscribeFlag(String subscribeFlag) {
        this.subscribeFlag = subscribeFlag == null ? null : subscribeFlag.trim();
    }

    public Date getSubscribeDate() {
        return subscribeDate;
    }

    public void setSubscribeDate(Date subscribeDate) {
        this.subscribeDate = subscribeDate;
    }

    public Date getUnsubscribeDate() {
        return unsubscribeDate;
    }

    public void setUnsubscribeDate(Date unsubscribeDate) {
        this.unsubscribeDate = unsubscribeDate;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }
}