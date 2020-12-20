package com.rakovets.course_java_enterprise.example.apache_maven;

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
