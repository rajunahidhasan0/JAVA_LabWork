package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class ExcerciseE19_2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("countryName.txt"));
		
		List <String> wordList = new ArrayList<>();
		
		while (in.hasNext()) { wordList.add(in.next()); }

		long space = wordList.stream()
				.filter(ch -> ch.equals("the"))
				.count();
		System.out.println(space);
	}

}
