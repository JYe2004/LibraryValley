package com.preBook.easyExcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestWrite {
    public static void main(String[] args) {
        List<UserData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData userData = new UserData();
            userData.setId(i);
            userData.setName("");
            list.add(userData);
        }
        // 设置url和name
        String fileName = "D:\\BigProjectStudy\\DoctorValley\\Test4\\ExcelTest\\01.xlsx";
        EasyExcel.write(fileName, UserData.class).sheet("userName")
                .doWrite(list);
    }
}
