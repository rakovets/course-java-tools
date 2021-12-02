package by.rakovets.course.java.tools.testing.junit5.example;

public class StringServiceImpl implements StringService {
    public boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public String trim(String str) {
        return str.trim();
    }

    public boolean isPalindrome(String str) throws WrongArgumentException {
        if (str == null) {
            throw new WrongArgumentException("String can't be 'null'");
        }
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public String[] split(String text, String separator) {
        if (separator.contains("|")) {
            separator = separator.replace("|", "\\|");
        }
        return text.split(separator);
    }
}
