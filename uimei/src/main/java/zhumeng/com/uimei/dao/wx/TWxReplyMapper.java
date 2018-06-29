package zhumeng.com.uimei.dao.wx;

import zhumeng.com.uimei.model.dbo.wx.TWxReply;

public interface TWxReplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TWxReply record);

    int insertSelective(TWxReply record);

    TWxReply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxReply record);

    int updateByPrimaryKeyWithBLOBs(TWxReply record);

    int updateByPrimaryKey(TWxReply record);
}