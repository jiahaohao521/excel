package com.excel.excel.service.impl;

import com.excel.excel.bean.ExamJudgeExcel;
import com.excel.excel.service.ExcelService;
import com.excel.excel.util.ExcelUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service("excelServiceImpl")
public class ExcelServiceImpl implements ExcelService {
    @Override
    public void export(HttpServletResponse response, Integer type) throws Exception {
        List<ExamJudgeExcel> goodsList = new ArrayList<ExamJudgeExcel>();
        if(type == 1){
            ExamJudgeExcel examJudgeExcel = new ExamJudgeExcel(null,"判断题", "雷达专题", "雷达技术", "答案A","否",null, "1");
            ExamJudgeExcel examJudgeExce2 = new ExamJudgeExcel(null,"判断题", "地图专题", "地图技术", "答案B","否",null, "2");
            goodsList.add(examJudgeExcel);
            goodsList.add(examJudgeExce2);
        }

        for (ExamJudgeExcel examJudgeExcel : goodsList) {
            System.out.println(examJudgeExcel);
        }
        //导出
        ExcelUtils.exportExcel(goodsList,null, "水果", ExamJudgeExcel.class,"商品.xls",response);
    }

    @Override
    public void importExcel() throws Exception {
//        本地文件 模拟文件上传解析
        String filePath = "E:/tttt/商品.xls";
        //解析excel
        List<ExamJudgeExcel> goodsList = ExcelUtils.importExcel(filePath,0,1, ExamJudgeExcel.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+goodsList.size()+"】行");

        //TODO 保存数据库
        for (ExamJudgeExcel goods:goodsList) {
            System.out.println(goods);
        }
    }

//    public void export(HttpServletResponse response) throws Exception {
//        //模拟数据库数据
//        Goods goods1 = new Goods(110, "苹果", 1, new Date(), 0, "1");
//        Goods goods2 = new Goods(111, "香蕉", 2, new Date(), 0, "0");
////        Goods goods3 = new Goods(112, "拉菲红酒", 3, new Date(), 1, "1");
////        Goods goods4 = new Goods(113, "玫瑰", 4, new Date(), 1, "0");
//
//        List<Goods> goodsList = new ArrayList<Goods>();
//        goodsList.add(goods1);
//        goodsList.add(goods2);
////        goodsList.add(goods3);
////        goodsList.add(goods4);
//
//        for (Goods goods : goodsList) {
//            System.out.println(goods);
//        }
//        //导出
//        FileUtil.exportExcel(goodsList,null, "水果",Goods.class,"商品.xls",response);
//    }
//
//    public void importExcel() throws Exception {
//        //本地文件 模拟文件上传解析
//        String filePath = "E:/tttt/商品.xls";
//        //解析excel
//        List<Goods> goodsList = FileUtil.importExcel(filePath,0,1,Goods.class);
//        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
//        System.out.println("导入数据一共【"+goodsList.size()+"】行");
//
//        //TODO 保存数据库
//        for (Goods goods:goodsList) {
//            System.out.println(goods);
//        }
//    }
}
