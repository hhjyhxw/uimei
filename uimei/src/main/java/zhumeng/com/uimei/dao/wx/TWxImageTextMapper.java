package zhumeng.com.uimei.dao.wx;

import java.util.List;

import zhumeng.com.uimei.model.dbo.wx.TWxImageText;

public interface TWxImageTextMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TWxImageText record);

    int insertSelective(TWxImageText record);

    TWxImageText selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxImageText record);

    int updateByPrimaryKey(TWxImageText record);
    
    List<TWxImageText> findForList(TWxImageText record);
	   
	List<TWxImageText> findByPage(TWxImageText record);
	   
	int updateUnDefault();
}