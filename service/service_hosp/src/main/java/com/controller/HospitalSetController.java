package com.controller;

import com.service.HospitalSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    // 注入service
    @Autowired
    private HospitalSetService hospitalSetService;

}
