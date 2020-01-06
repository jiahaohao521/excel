package com.excel.excel.test;

public class ByteTest {

    public static void main(String[] args) {
        String s = "ACB";
        String answer = getAnswer(s);
        System.out.println(answer);
    }

    public static String getAnswer(String answer) {
        int length = answer.length();
        String finalAnswer = "";
        if(length == 1){
            finalAnswer = "选项" + answer;
        }
        if(length == 2){
            finalAnswer = "选项" + answer.substring(0,1) + "#" + "选项" + answer.substring(1,2);
        }
        if(length == 3){
            finalAnswer = "选项" + answer.substring(0,1) + "#" + "选项" + answer.substring(1,2) +  "#" + "选项" +answer.substring(2,3);
        }
        if(length == 4){
            finalAnswer = "选项" + answer.substring(0,1) + "#" + "选项" + answer.substring(1,2) + "#" + "选项" + answer.substring(2,3) + "#" + "选项" + answer.substring(3,4);
        }
        return finalAnswer;
    }
}
