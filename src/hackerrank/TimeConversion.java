package hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeConversion {
    public static String timeConversion(String s) throws ParseException {
        // Write your code here
        String hh = s.split(":")[0];
        String mm = s.split(":")[1];
        String ss = s.split(":")[2];

        if (ss.contains("PM")) {
            hh = hh.equals("12") ? "12" : Integer.toString(Integer.parseInt(hh) + 12);
            return String.format("%s:%s:%s", hh, mm, ss.replace("PM", ""));
        } else {
            hh = hh.equals("12") ? "00" : hh;
            return String.format("%s:%s:%s", hh, mm, ss.replace("AM", ""));
        }
    }

    public static void main(String[] args) throws ParseException {
        String s = "05:00:00AM";
        System.out.println(timeConversion(s));
    }
}
