package com.kodilla.bytecode.reflection;

import java.nio.charset.Charset;
import java.util.Random;

public class Student {

    private String indexNumber;
    private Random random = new Random();
    private int leftLimit=97;
    private int rightLimit=122;
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";

    public Student() {
        StringBuilder sb = new StringBuilder(10);
        for(int i=0;i<10;i++){
            int index = (int)(text.length()*Math.random());
            sb.append(text.charAt(index));
        }
        this.indexNumber = sb.toString();
    }
}
