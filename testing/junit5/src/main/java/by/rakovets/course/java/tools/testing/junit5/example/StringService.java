package by.rakovets.course.java.tools.testing.junit5.example;

public interface StringService {
    boolean isEmpty(String str);

    String trim(String str);

    boolean isPalindrome(String str) throws WrongArgumentException;
}
