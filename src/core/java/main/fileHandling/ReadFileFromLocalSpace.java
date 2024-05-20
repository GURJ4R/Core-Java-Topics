package core.java.main.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileFromLocalSpace {
     public static void  readFile() {
    	 BufferedReader reader = null;
         try {
             // Provide the path to your file
             String filePath = "C:\\Users\\HP\\Desktop\\Angular17ProjectSetup.txt";
             reader = new BufferedReader(new FileReader(filePath));

             String line;
             while ((line = reader.readLine()) != null) {
            	 if(line.contains("ng")) {
            		 System.out.println("This is Angular Cmd= "+line);
            	 }else {
            		 System.out.println("This is an NPM cmd= "+line);
            	 }
             }
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             try {
                 if (reader != null) {
                     reader.close();
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
}
