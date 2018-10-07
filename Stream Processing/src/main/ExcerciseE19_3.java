package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class ExcerciseE19_3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("countryName.txt"));
		
		List <String> wordList = new ArrayList<>();
		
		while (in.hasNextLine()) { wordList.add(in.nextLine()); }

		wordList.stream()
				.filter(ch -> ch.contains("the"))
				.forEach(System.out::println);
	}

}
