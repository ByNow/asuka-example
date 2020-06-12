package com.example.demo.service;

import com.example.demo.model.Asuka;

import java.util.List;

/**
 * 
 *
 * @author 
 * @date 2020-06-13 05:02:36
 */
public interface AsukaService {

    //获取列表数据
    List<Asuka> getData(Asuka entity);

    //获取实例数据
	Asuka getInfo(Integer id);

    //新增
    void saveAsuka(Asuka entity);

    //修改
    void updateAsuka(Asuka entity);


}
