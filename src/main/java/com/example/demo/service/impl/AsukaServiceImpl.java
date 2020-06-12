package com.example.demo.service.impl;

import com.example.demo.service.AsukaService;
import com.example.demo.mapper.AsukaMapper;
import com.example.demo.model.Asuka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;






@Service
public class AsukaServiceImpl implements AsukaService {
	@Autowired
	private AsukaMapper asukaMapper;
	
	@Override
	public Asuka getInfo(Integer id){
		return asukaMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<Asuka> getData(Asuka entity){
		return asukaMapper.selectByParams(entity);
	}

	
	@Override
	public void saveAsuka(Asuka entity){
			asukaMapper.insertSelective(entity);
	}
	
	@Override
	public void updateAsuka(Asuka entity){
		asukaMapper.updateByPrimaryKeySelective(entity);
	}

	
}
