package com.techment.CollectionAssignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Rahane", 20);
		map.put("Rahul", 30);
		map.put("Kohli", 150);

		System.out.println("Players who battled ");

		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
		}

		System.out.println("Scores by Players");
		int sum = 0;
		int max = 0;
		for (Entry<String, Integer> e : map.entrySet()) {
			sum += e.getValue();
			max = Math.max(max, e.getValue());
			System.out.println(e.getKey() + " " + e.getValue());
		}

		System.out.println("Total Score " + sum);

		for (Entry<String, Integer> e : map.entrySet()) {

			if (e.getValue() == max)
				System.out.println("Name of Highest Scorer :" + e.getKey());
		}

	}

}
