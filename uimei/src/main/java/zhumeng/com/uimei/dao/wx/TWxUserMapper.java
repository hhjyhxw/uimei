package zhumeng.com.uimei.dao.wx;

import zhumeng.com.uimei.model.dbo.wx.TWxUser;

public interface TWxUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TWxUser record);

    int insertSelective(TWxUser record);

    TWxUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxUser record);

    int updateByPrimaryKey(TWxUser record);
}