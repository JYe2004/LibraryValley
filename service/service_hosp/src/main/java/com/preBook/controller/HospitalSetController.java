package com.preBook.controller;


//import com.preBook.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.preBook.Result;
import com.preBook.mapper.HospitalSetMapper;
import com.preBook.service.HospitalSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:3536/admin/hosp/hospitalSet/findAll

@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

//    1.查all
    @ApiOperation(value = "获取分页列表")
    @GetMapping("findAll")
    public Result findAllHospital(){
        List<HospitalSet> list = hospitalSetService.list();
        return Result.ok(list);
    }

    /*@GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }*/

    // 2、逻辑删除
    @ApiOperation(value = "医院设置逻辑删除")
    @DeleteMapping("{id}")
    public Result removeHospSet(@PathVariable Long id) {
        // 写long都不行，一定要写Long
        boolean flag = hospitalSetService.removeById(id);
        if(flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    // 3. 条件查询带分页医院设置

}
