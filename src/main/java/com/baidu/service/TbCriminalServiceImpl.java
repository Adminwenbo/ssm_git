package com.baidu.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.entity.TbCriminal;
import com.baidu.mapper.TbCriminalMapper;
@Service
public class TbCriminalServiceImpl implements TbCriminalService {

	@Resource
	private TbCriminalMapper tbCriminalMapper;
	@Override
	public List<Map<String, Object>> selectList(String name) {
		// TODO Auto-generated method stub
		return tbCriminalMapper.selectList(name);
	}

	@Override
	public int insertSelective(TbCriminal record) {
		// TODO Auto-generated method stub
		return tbCriminalMapper.insertSelective(record);
	}

	@Override
	public TbCriminal selectByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return tbCriminalMapper.selectByPrimaryKey(cid);
	}

	@Override
	public int updateByPrimaryKeySelective(TbCriminal record) {
		// TODO Auto-generated method stub
		return tbCriminalMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return tbCriminalMapper.deleteByPrimaryKey(cid);
	}

}
