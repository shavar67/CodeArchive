package FilesIO;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File {


    public static void main(String[] args) throws IOException {
        String path = "/Users/shavar/MaterialApps/LeetCode/src/main/java/FilesIO/samples.txt".trim();
        String data = "i = 4\nj = 4, is 4 > 0? yes -> print(4)\ndecrement by 1\nj = 3, is 3 > 0? yes -> print(3)\ndecrement by 1 \nj = 2, is 2 > 0? yes print(2) \ndecrement by 1\\nj = 1, is 1 > 0? yes print(1) \ndecrement by 1\nj = 0, condition is now false 0 > 0 ? exit innerLoop ";
       // writeFile(data);
       readFile(path);
        System.out.println();

    }

    public static void readFile(String path) throws IOException {
        BufferedReader bufferedReader = null;
        String lineToRead;
        System.out.println("Now reading from file: " + path);
         int len = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((lineToRead = bufferedReader.readLine()) != null) {

                 System.out.printf("%s\n", lineToRead.trim());
               //  System.out.println("Filtering using regex\n\n");
                 //regexChecker("M[A-Za-z]|D[A-Za-z]",lineToRead);
               // regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", lineToRead);
               // regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", lineToRead);
                len = lineToRead.length();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(path + " doesn't exist");
            System.out.println("File is empty.");
        } finally {

            bufferedReader.close();
            System.out.println("String values found: " + len);


        }

    }

    public static void writeFile(String data) throws IOException {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        java.io.File file = new java.io.File("Demo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println();
                System.out.println(file.getAbsoluteFile() + " is now created");

            }
            fileWriter = new FileWriter(file.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            System.out.println();
            System.out.print("Finished Writing to file " + file.getAbsolutePath() + ".");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            bufferedWriter.close();
        }

    }
    public static void regexChecker(String theRgex, String str2Check) {
        Pattern checkRegex = Pattern.compile(theRgex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println(regexMatcher.group().trim());
            }

        }
    }
}
