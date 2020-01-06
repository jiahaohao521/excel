package com.excel.excel.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 判断题
 * @author 1
 */
public class ExamJudgeExcel implements Serializable {

    public ExamJudgeExcel() {
    }


    private String id;

    @Excel(name = "题型",width = 50)
    private String type;

    @Excel(name = "专题",width = 50)
    private String specialName;

    @Excel(name = "题干",width = 50)
    private String title;

    @Excel(name = "答案", width = 20)
    private String answer;

    @Excel(name = "是否包含图片", width = 20)
    private String isPicture;

    @Excel(name = "图片路径", width = 50)
    private String picturePath;

    @Excel(name = "图片编号", width = 50)
    private String pictureI;

    @Override
    public String toString() {
        return "ExamJudgeExcel{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", specialName='" + specialName + '\'' +
                ", title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                ", isPicture='" + isPicture + '\'' +
                ", picturePath='" + picturePath + '\'' +
                ", pictureI='" + pictureI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamJudgeExcel that = (ExamJudgeExcel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(specialName, that.specialName) &&
                Objects.equals(title, that.title) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(isPicture, that.isPicture) &&
                Objects.equals(picturePath, that.picturePath) &&
                Objects.equals(pictureI, that.pictureI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, specialName, title, answer, isPicture, picturePath, pictureI);
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

    public ExamJudgeExcel(String id, String type, String specialName, String title, String answer, String isPicture, String picturePath, String pictureI) {
        this.id = id;
        this.type = type;
        this.specialName = specialName;
        this.title = title;
        this.answer = answer;
        this.isPicture = isPicture;
        this.picturePath = picturePath;
        this.pictureI = pictureI;
    }
}
