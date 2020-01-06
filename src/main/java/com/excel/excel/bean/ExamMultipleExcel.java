package com.excel.excel.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Objects;

/**
 * 多选题
 * @author 1
 */
public class ExamMultipleExcel implements Serializable {

    public ExamMultipleExcel() {
    }

    public ExamMultipleExcel(String id, String type, String specialName, String title, String optionA, String optionB, String optionC, String optionD, String answer, String isPicture, String picturePath, String pictureI) {
        this.id = id;
        this.type = type;
        this.specialName = specialName;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
        this.isPicture = isPicture;
        this.picturePath = picturePath;
        this.pictureI = pictureI;
    }

    private String id;

    @Excel(name = "题型",width = 50)
    private String type;

    @Excel(name = "专题",width = 50)
    private String specialName;

    @Excel(name = "题干",width = 50)
    private String title;

    @Excel(name = "选项A",width = 20)
    private String optionA;

    @Excel(name = "选项B",width = 20)
    private String optionB;

    @Excel(name = "选项C",width = 20)
    private String optionC;

    @Excel(name = "选项D",width = 20)
    private String optionD;

    @Excel(name = "答案", width = 20)
    private String answer;

    @Excel(name = "是否包含图片", width = 20)
    private String isPicture;

    @Excel(name = "图片路径", width = 50)
    private String picturePath;

    @Excel(name = "图片编号", width = 50)
    private String pictureI;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamMultipleExcel that = (ExamMultipleExcel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(specialName, that.specialName) &&
                Objects.equals(title, that.title) &&
                Objects.equals(optionA, that.optionA) &&
                Objects.equals(optionB, that.optionB) &&
                Objects.equals(optionC, that.optionC) &&
                Objects.equals(optionD, that.optionD) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(isPicture, that.isPicture) &&
                Objects.equals(picturePath, that.picturePath) &&
                Objects.equals(pictureI, that.pictureI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, specialName, title, optionA, optionB, optionC, optionD, answer, isPicture, picturePath, pictureI);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getIsPicture() {
        return isPicture;
    }

    public void setIsPicture(String isPicture) {
        this.isPicture = isPicture;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getPictureI() {
        return pictureI;
    }

    public void setPictureI(String pictureI) {
        this.pictureI = pictureI;
    }
}
