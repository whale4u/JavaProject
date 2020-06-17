package crawler;

import java.util.HashSet;
import java.util.Set;


public class setContains {
    private static Set<String> allFinishedUrl = new HashSet<>();

    public static void main(String[] args) {
        allFinishedUrl.add("www.baidu.com.cn");
        if (allFinishedUrl.contains("www.baidu.com.cn111")) {
            System.out.println(11111);
        }
    }
}
