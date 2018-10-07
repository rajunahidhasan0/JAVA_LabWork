package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class ExcerciseE19_4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("countryName.txt"));
		
		List <String> wordList = new ArrayList<>();
		
		while (in.hasNext()) { wordList.add(in.next()); }
		wordList.stream()
				.filter(ch -> ch.length()<=4)
				.distinct()
				.forEach(System.out::println);
	}

}
