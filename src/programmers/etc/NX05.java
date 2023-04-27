package programmers.etc;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NX05 {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/bella/IdeaProjects/algorithm/test.txt";

        File inputLog = new File(filename);
        FileReader fileReader = new FileReader(inputLog);

        String line ="";
        BufferedReader br = new BufferedReader(fileReader);

        List<String> timeStamp = new ArrayList<>();
        Set<String> timeSet = new HashSet<>();

        String pattern = "^(?:www\\\\.)?[a-zA-Z0-9./].*\\[(.*?) (-[0-9]*)+(.*)$";

        while((line = br.readLine()) != null) {
            Matcher matcher = Pattern.compile(pattern).matcher(line);
            if(matcher.find()) {
                String reqTime = matcher.group(1);
                if (timeStamp.contains(reqTime)) {
                    timeSet.add(reqTime);
                } else {
                    timeStamp.add(reqTime);
                }
            }
        }
        StringBuilder resultStr = new StringBuilder();

        for(String time : timeSet) {
            System.out.println(time);
            resultStr.append(time);
            resultStr.append("\r\n");
        }

//
//        FileOutputStream fos = new FileOutputStream("req"+filename);
//
//        fos.write(resultStr.toString().getBytes());
//        fos.close();

    }
}
