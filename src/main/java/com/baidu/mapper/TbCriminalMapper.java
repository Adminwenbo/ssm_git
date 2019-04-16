package com.baidu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baidu.entity.TbCriminal;

public interface TbCriminalMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(TbCriminal record);

    int insertSelective(TbCriminal record);

    TbCriminal selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(TbCriminal record);

    int updateByPrimaryKey(TbCriminal record);
    //查询
    List<Map<String, Object>> selectList(@Param("name")String name);
    
    
}