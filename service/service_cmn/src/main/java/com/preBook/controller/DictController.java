package com.preBook.controller;

import com.atguigu.yygh.model.cmn.Dict;
import com.preBook.result.Result;
import com.preBook.service.DictService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:3537/admin/cmn/dict/hello
//http://localhost:3537/admin/cmn/dict/findChildData/2
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin

public class DictController {

    @Autowired
    private DictService dictService ;

    /*
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    */
    //导入数据字典
//    @PostMapping("importData")
//    public Result importDict(MultipartFile file) {
//        dictService.importDictData(file);
//        return Result.ok();
//    }
//
//    //导出数据字典接口
//    @GetMapping("exportData")
//    public void exportDict(HttpServletResponse response) {
//        dictService.exportDictData(response);
//    }

    //根据dictCode获取下级节点
    @ApiOperation(value = "根据dictCode获取下级节点")
    @GetMapping("findByDictCode/{dictCode}")
    public Result findByDictCode(@PathVariable String dictCode) {
        List<Dict> list = dictService.findByDictCode(dictCode);
        return Result.ok(list);
    }

    //根据数据id查询子数据列表
    @ApiOperation(value = "根据数据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id) {
        List<Dict> list = dictService.findChildData(id);
        return Result.ok(list);
    }

    //根据dictcode和value查询
    @GetMapping("getName/{dictCode}/{value}")
    public String getName(@PathVariable String dictCode,
                          @PathVariable String value) {
        String dictName = dictService.getDictName(dictCode,value);
        return dictName;
    }

    //根据value查询
    @GetMapping("getName/{value}")
    public String getName(@PathVariable String value) {
        String dictName = dictService.getDictName("",value);
        return dictName;
    }
}
