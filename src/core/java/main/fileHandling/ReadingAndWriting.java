package core.java.main.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWriting {
       public static void readingAndWriting() {
           try {
               // Provide the path to your file
               String filePathReading = "C:\\Users\\HP\\Desktop\\RequirmentLWP.txt";
               File file = new File(filePathReading);

               // Temporary file for writing modified content
               File tempFile = new File("C:\\Users\\HP\\Desktop\\WrittenFile2.txt");

               // Reading from the file
               BufferedReader reader = new BufferedReader(new FileReader(file));
               BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile,true));

               String line;
               while ((line = reader.readLine()) != null) {
                   // Modify the content if needed
                   // For simplicity, let's just convert all text to uppercase
//                   line = line.toUpperCase();
                   // Write the modified line to the temporary file
                   writer.write(line);
                   writer.newLine(); // Add newline since readLine() removes it
               }
               reader.close();
               writer.close();

               // Replace the original file with the temporary file
//               file.delete(); // Delete original file
//               tempFile.renameTo(file); // Rename temp file to original file name

               System.out.println("File content modified and written successfully.");
           } catch (IOException e) {
               e.printStackTrace();
           } 

       }
}
