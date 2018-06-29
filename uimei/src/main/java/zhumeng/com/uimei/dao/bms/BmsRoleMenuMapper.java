package zhumeng.com.uimei.dao.bms;

import java.util.List;

import zhumeng.com.uimei.model.bms.BmsRoleMenu;

public interface BmsRoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BmsRoleMenu record);

    int insertSelective(BmsRoleMenu record);

    BmsRoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmsRoleMenu record);

    int updateByPrimaryKey(BmsRoleMenu record);
    
    void delete(BmsRoleMenu roleMenu);
    
    void batchInsert(List<BmsRoleMenu> list);
}