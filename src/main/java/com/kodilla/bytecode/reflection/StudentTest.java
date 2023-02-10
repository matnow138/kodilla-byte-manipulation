package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;

public class StudentTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Student student= new Student();
        Field signatureField = Student.class.getDeclaredField("indexNumber");
        signatureField.setAccessible(true);

        String value = (String)signatureField.get(student);
        System.out.println(value);
    }
}
