package com.preBook.easyExcel;

import com.alibaba.excel.EasyExcel;

public class TestRead {
    public static void main(String[] args) {
        // path
        String fileName = "D:\\BigProjectStudy\\DoctorValley\\Test4\\ExcelTest\\01.xlsx";
        EasyExcel.read(fileName,UserData.class,new Monitor()).sheet().doRead();
    }
}
