package zhumeng.com.uimei.dao.bms;

import java.util.List;

import zhumeng.com.uimei.dao.BaseDao;
import zhumeng.com.uimei.model.bms.BmsRole;

public interface BmsRoleMapper extends BaseDao<BmsRole>{
    int deleteByPrimaryKey(Integer id);

    int insert(BmsRole record);

    int insertSelective(BmsRole record);

    BmsRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmsRole record);

    int updateByPrimaryKey(BmsRole record);
    
    
    List<BmsRole> selectByAdmin(Integer adminId);
    
    List<BmsRole> selectAll();
    
    int selectCountByName(String roleName);
}