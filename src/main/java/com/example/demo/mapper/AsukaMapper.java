package com.example.demo.mapper;

import com.example.demo.model.Asuka;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * 
 * @author 
 * @date 2020-06-13 05:02:36
 */
@Mapper
public interface AsukaMapper{

    //查询实例
    Asuka selectByPrimaryKey(Integer id);

    //根据参数查询列表
    List<Asuka> selectByParams(Asuka entity);

    void insertSelective(Asuka entity);

    void updateByPrimaryKeySelective(Asuka entity);

    void deleteByPrimaryKey(Integer id);

    void insertBatch(List<Asuka> entities);
	
}
