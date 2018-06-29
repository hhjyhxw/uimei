package zhumeng.com.uimei.dao.wx;

import java.util.List;

import zhumeng.com.uimei.model.dbo.wx.TWxApp;

public interface TWxAppMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(TWxApp record);

    int insertSelective(TWxApp record);

    TWxApp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxApp record);

    int updateByPrimaryKey(TWxApp record);
    
    List<TWxApp> findForList(TWxApp record);
	   
   	List<TWxApp> findByPage(TWxApp record);
}