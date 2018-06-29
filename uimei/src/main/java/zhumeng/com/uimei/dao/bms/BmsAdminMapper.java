package zhumeng.com.uimei.dao.bms;

import java.util.List;

import zhumeng.com.uimei.dao.BaseDao;
import zhumeng.com.uimei.model.bms.BmsAdmin;

public interface BmsAdminMapper extends BaseDao<BmsAdmin>{
    int deleteByPrimaryKey(Integer id);

    int insert(BmsAdmin record);

    int insertSelective(BmsAdmin record);

    BmsAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmsAdmin record);

    int updateByPrimaryKey(BmsAdmin record);
    
    int deleteByPrimaryKey(Long id);

    public List<BmsAdmin> findForConditions(BmsAdmin record);
    
    Integer findCountByAccount(BmsAdmin record);
}