package com.baidu.service;

import java.util.List;
import java.util.Map;

import com.baidu.entity.TbCriminal;

public interface TbCriminalService {

	//查询
    List<Map<String, Object>> selectList(String name);
    //增加
    int insertSelective(TbCriminal record);
    
    //修改
    TbCriminal selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(TbCriminal record);
    
    int deleteByPrimaryKey(Integer cid);
}
