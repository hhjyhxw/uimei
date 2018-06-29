package zhumeng.com.uimei.dao.bms;

import java.util.List;

import zhumeng.com.uimei.model.bms.BmsAdminRole;

public interface BmsAdminRoleMapper {
    int insert(BmsAdminRole record);

    int insertSelective(BmsAdminRole record);
    
	int deleleByAdmin(Integer adminId);
	
	
	int batchInsert(List<BmsAdminRole> list);
	
}