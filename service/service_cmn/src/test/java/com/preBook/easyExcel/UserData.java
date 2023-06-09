package com.preBook.easyExcel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class UserData {
    @ExcelProperty(value = "用户编号",index = 0)
    private int id;

    @ExcelProperty(value = "用户名称",index = 1)
    private String name;

    /*public UserData (int id,String name){
        this.id = id;
        this.name = name;
    }*/
}
