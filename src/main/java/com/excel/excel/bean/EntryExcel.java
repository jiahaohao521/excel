package com.excel.excel.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Objects;

/**
 * 词条excel
 */
public class EntryExcel implements Serializable {

    @Excel(name = "名称", width = 50)
    private String entryName;

    @Excel(name = "解释", width = 50)
    private String explain;

    public EntryExcel() {
    }

    public EntryExcel(String entryName, String explain) {
        this.entryName = entryName;
        this.explain = explain;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntryExcel that = (EntryExcel) o;
        return Objects.equals(entryName, that.entryName) &&
                Objects.equals(explain, that.explain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entryName, explain);
    }

    @Override
    public String toString() {
        return "EntryExcel{" +
                "entryName='" + entryName + '\'' +
                ", explain='" + explain + '\'' +
                '}';
    }
}
