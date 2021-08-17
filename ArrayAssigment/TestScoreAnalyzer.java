package com.techment.CollectionAssignment;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer {

	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	void addRunsToList(int runsData) {
		this.runsData.add(runsData);
	}

	void calcRunRate() {
		int sum = 0;

		for (int i = 0; i < runsData.size(); i++) {
			sum += runsData.get(i);
		}

		System.out.println("Run rate is " + (sum / 50.0));

	}

	void lowestRunsScored() {

		int num = 100000000;
		for (int i = 0; i < runsData.size(); i++) {
			num = Math.min(num, runsData.get(i));
		}

		System.out.println("Lowest run is " + num);

	}

	void displayRuns() {
		for (int i = 0; i < runsData.size(); i++) {
			System.out.println("run " + (i + 1) + " " + runsData.get(i));
		}

	}
}

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreAnalyzer score = new ScoreAnalyzer();

		System.out.println("Enter integer numbers  you want to add runs ");
		Scanner scanner = new Scanner(System.in);

		int players = scanner.nextInt();
		System.out.println("Enter runs ");
		for (int i = 0; i < players; i++) {
			score.addRunsToList(scanner.nextInt());
		}

		score.calcRunRate();
		score.displayRuns();
		score.lowestRunsScored();
	}

}

