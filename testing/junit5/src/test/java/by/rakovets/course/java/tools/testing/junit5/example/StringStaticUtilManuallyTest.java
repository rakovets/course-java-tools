package by.rakovets.course.java.tools.testing.junit5.example;

import by.rakovets.course.java.tools.testing.junit5.example.StringStaticUtil;

public class StringStaticUtilManuallyTest {
    public static void main(String[] args) {
        String result = StringStaticUtil.concat("Hello", "Java");
        System.out.println(result);
    }
}
