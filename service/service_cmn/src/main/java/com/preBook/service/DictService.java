package com.preBook.service;

import com.atguigu.yygh.model.cmn.Dict;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DictService extends IService<Dict> {
    List<Dict> findChildData(Long id);

    List<Dict> findByDictCode(String dictCode);

    String getDictName(String dictCode, String value);

    void importDictData(MultipartFile file);
//
    void exportDictData(HttpServletResponse response);
}
