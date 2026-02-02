package com.horrorcore;

import java.util.Arrays;
import java.util.List;

public class Main {
    //Strings
    //An Character Array internally formatted to help us read it
    // Use cases ranges from posts statuses to Database URL's

    static void main(String[] args) {
        String str = "Hello, World";
        String str2 = new String("Hello, World");
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        String[] strArr = str.split(", ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(Arrays.toString(str.toCharArray()));
        str2 = str2.intern();
        System.out.println(str == str2);
        str = str.replaceAll("o", "0");
        System.out.println(str);
    }
}
