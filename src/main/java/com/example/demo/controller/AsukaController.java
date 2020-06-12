package com.example.demo.controller;

import com.example.demo.model.Asuka;
import com.example.demo.service.AsukaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 
 * @author 
 * @date 2020-06-13 05:05:55
 */
@RestController
@RequestMapping("/asuka")
public class AsukaController {
    @Autowired
    private AsukaService asukaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public List<Asuka> list(Asuka params){
        return asukaService.getData(params);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Asuka info(@PathVariable("id") Integer id){
        return asukaService.getInfo(id);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public void save(@RequestBody Asuka asuka){
			asukaService.saveAsuka(asuka);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public void update(@RequestBody Asuka asuka){
			asukaService.updateAsuka(asuka);
    }
}
