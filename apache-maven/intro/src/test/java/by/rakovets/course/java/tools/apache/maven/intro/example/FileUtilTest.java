package by.rakovets.course.java.tools.apache.maven.intro.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileUtilTest {
    @Test
    public void testGetFileExtension() {
        FileUtil fileUtil = new FileUtil();
        Assertions.assertEquals("", fileUtil.getFileExtension(""));
        Assertions.assertEquals("sh", fileUtil.getFileExtension("name.sh"));
    }
}
