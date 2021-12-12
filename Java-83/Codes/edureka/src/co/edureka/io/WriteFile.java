package co.edureka.io;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		/*
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		
		String str = "World’s #1 E-Learning Platform. Edureka's online training helps you land your dream job. "
				+ "Best-selling technology certification courses co-created with global industry experts. "
				+ "24/7 Lifetime Support. No Cost EMI Option. Instructor-led Classes. Flexible Batch Timings.";
		
		byte[] data = str.getBytes();
		
		fout.write(data);
		*/
		
		FileWriter fout = new FileWriter("src/co/edureka/io/edureka1.txt");
		
		String str = "World’s #1 E-Learning Platform. Edureka's online training helps you land your dream job. "
				+ "Best-selling technology certification courses co-created with global industry experts. "
				+ "24/7 Lifetime Support. No Cost EMI Option. Instructor-led Classes. Flexible Batch Timings.";
		
		fout.write(str);
		
		System.out.println("---- file created ----");
		fout.close();
	}
}
