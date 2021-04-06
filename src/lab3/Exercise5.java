package lab3;

import java.io.*;

public class Exercise5 {

	public static void main(String[] args) {
		try {

			int lines = 0, chars = 0, words = 0;
			int c = 0;
			FileInputStream fis = new FileInputStream("sample.txt");
		
			while (fis.available() != 0) {
				c = fis.read();
				if (c != 10)
					chars++;
				if (c == 32)
					words++;
				if (c == 13) {
					lines++;
					words++;
				}
			}
			System.out.println("Number of chars:" + chars);
			System.out.println("Number of words:" + (words + 1));
			System.out.println("Number of lines:" + (lines + 1));
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException i) {
			System.out.println("cannot read file");
		}

	}
}
