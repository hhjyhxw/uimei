package zhumeng.com.uimei.model.dbo;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 微信支付记录对账Entity
 * @author mwy
 * @version 2018-03-07
 */
public class TWxPayRecord implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Date tradetime;		// 交易时间
	private String openid;		// 公众账号ID
	private String mchid;		// 商户号
	private String submch;		// 子商户号
	private String deviceid;		// 设备号
	private String wxorder;		// 微信订单号
	private String yworder;		// 商户订单号
	private String useopenid;		// 用户标识
	private String tradetype;		// 交易类型
	private String tradestatus;		// 交易状态
	private String bank;		// 付款银行
	private String currency;		// 货币种类
	private BigDecimal totalmoney;		// 总金额
	private String redpacketmoney;		// 企业红包金额
	private String wxrefund;		// 微信退款单号
	private String bzrefund;		// 商户退款单号
	private BigDecimal refundmoney;		// 退款金额
	private String redpacketrefund;		// 企业红包退款金额
	private String refundtype;		// 退款类型
	private String refundstatus;		// 退款状态
	private String productname;		// 商品名称
	private String bzdatapacket;		// 商户数据包
	private BigDecimal fee;		// 手续费
	private BigDecimal rate;		// 费率
	private String checkFlag;		// 是否对账0否1是
	private String checkResult;		// 对账结果1平0用户都2平台多
	private Date checkDate;		// 对账时间
	private String exptionFlag;		// 异常处理状态1正常，0未处理2已处理
	private String result;		// 处理结果
	private Date beginTradetime;		// 开始 交易时间
	private Date endTradetime;		// 结束 交易时间
	
	public TWxPayRecord() {
		super();
	}

	public TWxPayRecord(Integer id){
	}

	public Date getTradetime() {
		return tradetime;
	}

	public void setTradetime(Date tradetime) {
		this.tradetime = tradetime;
	}
	
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	public String getMchid() {
		return mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}
	
	public String getSubmch() {
		return submch;
	}

	public void setSubmch(String submch) {
		this.submch = submch;
	}
	
	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	
	public String getWxorder() {
		return wxorder;
	}

	public void setWxorder(String wxorder) {
		this.wxorder = wxorder;
	}
	
	public String getYworder() {
		return yworder;
	}

	public void setYworder(String yworder) {
		this.yworder = yworder;
	}
	
	public String getUseopenid() {
		return useopenid;
	}

	public void setUseopenid(String useopenid) {
		this.useopenid = useopenid;
	}
	
	public String getTradetype() {
		return tradetype;
	}

	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}
	
	public String getTradestatus() {
		return tradestatus;
	}

	public void setTradestatus(String tradestatus) {
		this.tradestatus = tradestatus;
	}
	
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public BigDecimal getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(BigDecimal totalmoney) {
		this.totalmoney = totalmoney;
	}
	
	public String getRedpacketmoney() {
		return redpacketmoney;
	}

	public void setRedpacketmoney(String redpacketmoney) {
		this.redpacketmoney = redpacketmoney;
	}
	
	public String getWxrefund() {
		return wxrefund;
	}

	public void setWxrefund(String wxrefund) {
		this.wxrefund = wxrefund;
	}
	
	public String getBzrefund() {
		return bzrefund;
	}

	public void setBzrefund(String bzrefund) {
		this.bzrefund = bzrefund;
	}
	
	public BigDecimal getRefundmoney() {
		return refundmoney;
	}

	public void setRefundmoney(BigDecimal refundmoney) {
		this.refundmoney = refundmoney;
	}
	
	public String getRedpacketrefund() {
		return redpacketrefund;
	}

	public void setRedpacketrefund(String redpacketrefund) {
		this.redpacketrefund = redpacketrefund;
	}
	
	public String getRefundtype() {
		return refundtype;
	}

	public void setRefundtype(String refundtype) {
		this.refundtype = refundtype;
	}
	
	public String getRefundstatus() {
		return refundstatus;
	}

	public void setRefundstatus(String refundstatus) {
		this.refundstatus = refundstatus;
	}
	
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public String getBzdatapacket() {
		return bzdatapacket;
	}

	public void setBzdatapacket(String bzdatapacket) {
		this.bzdatapacket = bzdatapacket;
	}
	
	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	
	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}
	
	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	
	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	
	public String getExptionFlag() {
		return exptionFlag;
	}

	public void setExptionFlag(String exptionFlag) {
		this.exptionFlag = exptionFlag;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public Date getBeginTradetime() {
		return beginTradetime;
	}

	public void setBeginTradetime(Date beginTradetime) {
		this.beginTradetime = beginTradetime;
	}
	
	public Date getEndTradetime() {
		return endTradetime;
	}

	public void setEndTradetime(Date endTradetime) {
		this.endTradetime = endTradetime;
	}
		
}