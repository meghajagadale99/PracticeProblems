package regex;

import java.util.regex.Pattern;

public
class Demo {
    public static
    void main(String[] args) {
        Pattern pattern =Pattern.compile(".");
        String[] s = pattern.split("Megha jagadale prakash %$#@^&");
        for (String s1:s) {
            System.out.println(s1);
        }
    }
}
