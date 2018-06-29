package zhumeng.com.uimei.service.wx.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhumeng.com.uimei.dao.wx.TWxAppMapper;
import zhumeng.com.uimei.model.dbo.wx.TWxApp;
import zhumeng.com.uimei.service.wx.TWxAppService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TWxAppServiceImpl implements TWxAppService{

	@Autowired 
	private TWxAppMapper wxAppMapper;
	
	@Override
	public void save(TWxApp t) throws Exception {
		// TODO Auto-generated method stub
		wxAppMapper.insert(t);
	}

	@Override
	public void update(TWxApp t) throws Exception {
		// TODO Auto-generated method stub
		wxAppMapper.updateByPrimaryKey(t);
	}

	@Override
	public List<TWxApp> findList(TWxApp t) throws Exception {
		// TODO Auto-generated method stub
		return wxAppMapper.findForList(t);
	}

	@Override
	public Integer findCount(TWxApp t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		wxAppMapper.deleteByPrimaryKey(id);
	}

	@Override
	public TWxApp findByKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return wxAppMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<TWxApp> findByPage(int pageNo, int pageSize, TWxApp t)
			throws Exception {
		PageHelper.startPage(pageNo, pageSize);
		return new PageInfo<TWxApp>(wxAppMapper.findByPage(t));
	}

}
