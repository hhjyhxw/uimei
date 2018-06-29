package zhumeng.com.uimei.model.dbo.wx;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import zhumeng.com.uimei.model.dbo.BaseModel;


public class TWxMenu extends BaseModel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private Long appId;// 微信号id
	private String xcxAppid;		// 小程序id
	private String name;		// 菜单名
	private String url;		// url
	private Integer menuLevel;		// 菜单级别1,2
	private Long orderNo;		// 排序
	private String menuType;		// 菜单类型,1视图2事件, （2018/01/10t添加 3 扫码 4、跳转小程序 
	private TWxMenu parent;		// 父类，0跟
	private String isUse;		// 状态0停用1正常
	//1视图2事件3扫码（显示结果）或者跳转链接 4跳转小程序,5扫码，有提示框，可以接受开发者推送的消息
	//view、click、scancode_push，miniprogram,scancode_waitmsg
	private String pagepath;		// 小程序页面路径
	
	private List<TWxMenu> childrenList;//子节点集合

    private Long parentId;
    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse == null ? null : isUse.trim();
    }

    public String getPagepath() {
        return pagepath;
    }

    public void setPagepath(String pagepath) {
        this.pagepath = pagepath == null ? null : pagepath.trim();
    }

    public String getXcxAppid() {
        return xcxAppid;
    }

    public void setXcxAppid(String xcxAppid) {
        this.xcxAppid = xcxAppid == null ? null : xcxAppid.trim();
    }

	public TWxMenu getParent() {
		return parent;
	}

	public void setParent(TWxMenu parent) {
		this.parent = parent;
	}

	public List<TWxMenu> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<TWxMenu> childrenList) {
		this.childrenList = childrenList;
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