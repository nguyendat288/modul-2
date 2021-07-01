package day18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Time1 {
        public static void main(String[] args) {
            Date thoiGian = new Date();
            SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
            String showTime = dinhDangThoiGian.format(thoiGian.getTime());
            System.out.println("" + showTime);

    }
}
