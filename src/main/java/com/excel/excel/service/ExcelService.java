package com.excel.excel.service;

import javax.servlet.http.HttpServletResponse;

public interface ExcelService {

    void export(HttpServletResponse response, Integer type) throws Exception;

    void importExcel() throws Exception;
}
