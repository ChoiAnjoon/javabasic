package javabase.chap_11.quiz12;

import java.io.File;

public class Validator {
    public static boolean validate(String path) {
        if (path.startsWith("/Users/")) {
            File file = new File(path);
            return file.exists();
        } else {
            throw new IllegalPathAccessError(path);
        }
    }
}
