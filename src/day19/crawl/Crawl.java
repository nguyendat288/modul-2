package day19.crawl;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    public static void main(String[] args) {
        try {
            // đối tượng url.
            URL url = new URL("https://vnexpress.net");
            // đọc dữ liệu được trả về
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            // đọc đến cuối.
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            // xoá các ký tự ngắt dòng (xuống dòng)
            content = content.replaceAll("\\R", "");
            // regex
            Pattern p = Pattern.compile("<h3 class=\"title-news\">(.*?)</a></h3>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1).trim());
                //truy cập vào đường link:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
