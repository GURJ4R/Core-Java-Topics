package core.java.main.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
	public static void writeFile() {
		BufferedWriter writer = null;
		try {
			// Provide the path to your file
			String filePath = "C:\\Users\\HP\\Desktop\\RequirmentLWP.txt";

			// Create a new BufferedWriter with FileWriter
			// You can specify 'true' as the second argument to append to an existing file
			writer = new BufferedWriter(new FileWriter(filePath));

			// Write data to the file
			writer.write("1)user should be able to sign-up and login with username and password(can be admin or student)\n");
			writer.write("2)user will have list of state board names like CBSE/UK Board/ UP Board etc\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					// Close the writer to flush the buffer and release resources
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
