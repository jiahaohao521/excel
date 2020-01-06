package com.excel.excel.controller;

import com.excel.excel.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @RequestMapping("/exportExcel")
    public void export(HttpServletResponse response, @RequestParam Integer type) throws Exception {
        excelService.export(response, type);
    }

    @RequestMapping("/importExcel")
    public void importExcel() throws Exception {
        excelService.importExcel();
    }
}
