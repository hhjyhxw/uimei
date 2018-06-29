package zhumeng.com.uimei.model.dbo.wx;

import java.io.Serializable;
import java.util.Date;

import zhumeng.com.uimei.model.dbo.BaseModel;

public class TWxApp extends BaseModel implements Serializable{
    private Long id;

	private static final long serialVersionUID = 1L;
	private String wecharNumber;		// 微信公众号ID
	private String accountNumber;		// 微信原账号   原始ID
	private String url;		// 地址连接
	private String token;		// token值
	private String appid;		// appid
	private String appsecret;		// appsecret
	private String encodingaeskey;		// encodingaeskey
	private String partner;		// partner商户号
	private String paysignkey;		// 商户签名
	private String domainName;		// 域名

	private Date createTime;
	private Date modifyTime;
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWecharNumber() {
        return wecharNumber;
    }

    public void setWecharNumber(String wecharNumber) {
        this.wecharNumber = wecharNumber == null ? null : wecharNumber.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey == null ? null : encodingaeskey.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public String getPaysignkey() {
        return paysignkey;
    }

    public void setPaysignkey(String paysignkey) {
        this.paysignkey = paysignkey == null ? null : paysignkey.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
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