package co.edureka.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class NIOTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		Path path = Paths.get("src/co/edureka/io/data.txt");
		
		List<String> data = Arrays.asList("This is my first Line", 
										  "This is my second Line",
										  "This is my third Line"
										  );
		/*
		//Files.write(path, data, StandardOpenOption.CREATE_NEW);
		Files.write(path, data, StandardOpenOption.CREATE);
		//Files.write(path, data, StandardOpenOption.APPEND);
	   */
		
		List<String> readData = Files.readAllLines(path);
		
		for(String line : readData) {
			System.out.println(line);
			Thread.sleep(2000);
		}
	}

}
