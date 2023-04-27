package programmers.etc;


import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NX04 {

    public static void main(String[] args) throws IOException {
        String filename = "/Users/bella/IdeaProjects/algorithm/test.txt";

        File inputLog = new File(filename);
        FileReader fileReader = new FileReader(inputLog);

        String line ="";
        BufferedReader br = new BufferedReader(fileReader);

        Set<String> fileSet = new HashSet<>();

        String pattern = "^(?:www\\\\.)?[a-zA-Z0-9./].*\\[(.*?)\\] \\\"GET(.*?) (HTTP/1.0\\\" 200 [0-9]*)+$";
        while((line = br.readLine()) != null) {
            if(line.contains("truncated")) {
                continue;
            }
            Matcher matcher = Pattern.compile(pattern).matcher(line);
            if(matcher.find()) {
                String filePath = matcher.group(2).toLowerCase();
                if(filePath.contains("gif")) {
                    String fileName = matcher.group(2).substring(filePath.lastIndexOf("/")+1);
                    fileSet.add(fileName);
                    System.out.println(fileName);
                }
            }
        }

//        StringBuilder resultStr = new StringBuilder();
//
//        for(String name : fileSet) {
//            System.out.println(name);
//            resultStr.append(name);
//            resultStr.append("\r\n");
//        }
//
//        FileOutputStream fos = new FileOutputStream("gifs_"+filename);
//
//        fos.write(resultStr.toString().getBytes());
//        fos.close();
    }

}
