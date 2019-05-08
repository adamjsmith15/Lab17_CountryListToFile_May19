package co.grandcircus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public static void readMyFile() {
		String fileName = "countries.txt";
		// File fileName = new File("Biscuits.txt");
		Path path = Paths.get("countries", fileName);
		File file = path.toFile();
		try {
			FileReader r = new FileReader(file);
			BufferedReader in = new BufferedReader(r);
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			System.out.println("Something happened");
		}
	}
	
	public static void writeMyFile(Country country) {
		String fileName = "countries.txt";
		// File fileName = new File("Biscuits.txt");
		Path path = Paths.get("countries", fileName);
		File file = path.toFile();

		try {
			PrintWriter output = new PrintWriter(new FileOutputStream(file, true)); // true = append and will keep
			output.print(country);

			output.close();
			System.out.println("Country has been saved!");
		} catch (IOException e) {
			System.out.println("Something happened");
		}
	}

	public static void createMyFile(String fileName) {
		// can also do "word2yourmutha/test.txt"
		fileName = fileName.concat(".txt");
		Path file = Paths.get("countries", fileName);
		if (Files.notExists(file)) {
			try {
				Files.createFile(file);
				System.out.println("File was created successfully");
			} catch (IOException e) {
				System.out.println("I don't know");
			}
		} else {
			//System.out.println("File already exists.");

		}
	}
	
	public static void createDir(String path) {
		String dirPath = path;

		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {
			try {
				Files.createDirectories(folder);
				System.out.println("Folder was created successfully");
			} catch (IOException e) {
				System.out.println("I don't know");
			}
		} else {
			//System.out.println("Folder already exists.");
		}
	}


}
