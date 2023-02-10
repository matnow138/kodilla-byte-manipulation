package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;

public class ReflectiontestPrivate {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Book book = new Book("Title", "Signature", 2003);
        Field signatureField = Book.class.getDeclaredField("signature");
        signatureField.setAccessible(true);

        String value = (String)signatureField.get(book);
        System.out.println(value);
    }

}
