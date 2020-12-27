package com.rakovets.course.java.tools.apache.maven.intro.example;

import java.util.Arrays;

public class FileUtil {
    public String getFileExtension(String filename) {
        String[] split = filename.split("\\.");
        return (split.length == 1) ? "" : split[split.length - 1];
    }

    // This method is not tested, so it may have errors
    public String getFileName(String filename) {
        String[] split = filename.split("\\.");
        return (split.length == 1) ? "" : String.join("", Arrays.copyOfRange(split, 0, split.length - 1));
    }
}
