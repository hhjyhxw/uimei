package zhumeng.com.uimei.service.wx;

import javax.servlet.http.HttpServletRequest;

import zhumeng.com.uimei.model.dbo.wx.TWxImageText;
import zhumeng.com.uimei.service.BaseService;

public interface TWxImageTextService extends BaseService<TWxImageText>{

	
	void saveWeixinMaterial(String[] titles, String[] newsImages,
			String[] descriptions, String[] urls, Long[] id,
			HttpServletRequest request);

	void updateDefaults(Long id);

}
