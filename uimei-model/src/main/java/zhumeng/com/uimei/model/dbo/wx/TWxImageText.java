package zhumeng.com.uimei.model.dbo.wx;

import java.io.Serializable;
import java.util.Date;

import zhumeng.com.uimei.model.dbo.BaseModel;


public class TWxImageText extends BaseModel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Long appId;		// 微信号id
	private String title;		// 标题
	private String picUrl;		// 图片地址
	private TWxImageText parent;		// 父类id，跟为0
	private String vistUrl;		// 访问URL	
	private Date createTime;		// 创建时间
	private String description; 	//图文描述
	private String wxPicUrl; 	//新增的图片素材的图片URL
	private String mediaId; 	//新增的永久素材的media_id
    private Long parentId;
    private String defaults; 	//默认素材 1默 认素材  0非默认
	private Date modifyTime;
	
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getVistUrl() {
        return vistUrl;
    }

    public void setVistUrl(String vistUrl) {
        this.vistUrl = vistUrl == null ? null : vistUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getWxPicUrl() {
        return wxPicUrl;
    }

    public void setWxPicUrl(String wxPicUrl) {
        this.wxPicUrl = wxPicUrl == null ? null : wxPicUrl.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

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

	public TWxImageText getParent() {
		return parent;
	}

	public void setParent(TWxImageText parent) {
		this.parent = parent;
	}

	public String getDefaults() {
		return defaults;
	}

	public void setDefaults(String defaults) {
		this.defaults = defaults;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
    
}