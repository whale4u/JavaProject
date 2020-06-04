package crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUrlDemo {
    private static ArrayList<String> allWaitedUrl = new ArrayList<>();
    private static Set<String> allFinishedUrl = new HashSet<>();
    private static Map<String, Integer> allUrlDepth = new HashMap<>();
    private static int maxDepth = 2;
    private static int maxScope = 1;

    public static void main(String[] args) {
        String indexUrl  = "https://www.baidu.com";

        crawlPage(indexUrl, maxDepth, maxScope);
    }

    public  static  void crawlPage(String strUrl, int depth, int scope) {
//        System.out.println(url);
        if (!(allFinishedUrl.contains(strUrl) || depth<maxDepth)) {
            System.out.println("xxxxx");
            try {
                URL url = new URL(strUrl);
                URLConnection conn = url.openConnection();
                InputStream is = conn.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

                Pattern p = Pattern.compile("(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]");
                String line = null;
                while ((line = br.readLine()) != null) {
                    Matcher m = p.matcher(line);
                    while (m.find()) {
                        String href = m.group();
                        //                    System.out.println(href);
                        allWaitedUrl.add(href);
                        allUrlDepth.put(href, depth + 1);
                    }
                }
                br.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            allFinishedUrl.add(strUrl);
            System.out.println(strUrl + " crawl finished! crawled: " + allFinishedUrl.size() + " Left:" + allWaitedUrl.size());
        }

        if (allWaitedUrl.size() > 0) {
            System.out.println("-----");
            String nextUrl = allWaitedUrl.get(0);
            allWaitedUrl.remove(0);
            crawlPage(nextUrl, allUrlDepth.get(nextUrl), 2);
        }

    }



}
