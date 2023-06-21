package com.test.listdemo.implementation;

/**
 * @author Jitendra Vishwakarma
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSolution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberofLists = scan.nextInt();
		List<List<Integer>> listOfArrayList = new ArrayList<>();
		for (int i = 0; i < numberofLists; i++) {
			String str;
			boolean readComplete = false;
			while (!readComplete) {
				str = scan.nextLine();
				if (!str.equals("")) {
					List<Integer> tempList = new ArrayList<>(); // 5
					for (String s : str.split(" ")) {
						tempList.add(Integer.parseInt(s));
					}
					listOfArrayList.add(tempList);
					readComplete = true;
				}
			}
		}
		int numberOfQuery = scan.nextInt();
		for (int i = 0; i < numberOfQuery; i++) {
			String str;
			boolean readComplete = false;
			while (!readComplete) {
				str = scan.nextLine();
				if (!str.equals("")) {
					String[] s = str.split(" ");
					List<Integer> temp;
					if ((temp = listOfArrayList.get(Integer.parseInt(s[0]) - 1)) != null) {
						int value;
						try {
							if ((value = temp.get(Integer.parseInt(s[1]))) != 0) {
								System.out.println(value);
							}
						} catch (Exception e) {
							System.out.println("ERROR!");
						}
					}
					readComplete = true;
				}
			}
		}
	}
}
