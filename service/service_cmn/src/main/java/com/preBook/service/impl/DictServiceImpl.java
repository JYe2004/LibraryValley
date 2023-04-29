package com.preBook.service.impl;

import com.atguigu.yygh.model.cmn.Dict;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.preBook.mapper.DictMapper;
import com.preBook.mapper.HospitalSetMapper;
import com.preBook.service.DictService;
import com.preBook.service.HospitalSetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {

    @Override
    public List<Dict> findChildData(Long id) {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",id);
        List<Dict> dictList = baseMapper.selectList(wrapper);
        for (Dict dict : dictList) {
            Long dictId = dict.getId() ;
            dict.setHasChildren(this.isChildren(dictId));
        }
        return dictList;
    }

    private boolean isChildren(Long id) {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",id);
        Integer count = baseMapper.selectCount(wrapper);
        return count > 0;
    }

    @Override
    public List<Dict> findByDictCode(String dictCode) {
        return null;
    }

    @Override
    public String getDictName(String dictCode, String value) {
        return null;
    }

//    @Override
//    public void importDictData(MultipartFile file) {
//
//    }
//
//    @Override
//    public void exportDictData(HttpServletResponse response) {
//
//    }
}
