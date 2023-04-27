package com.preBook.controller;


//import com.preBook.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.preBook.mapper.HospitalSetMapper;
import com.preBook.service.HospitalSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

//    1.
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospital(){
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
