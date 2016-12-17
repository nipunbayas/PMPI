package com.project.ai.main;
import java.util.Scanner;

import com.project.ai.db.DatabaseHelper;

public class PMPIApp {

	public static void main(String[] args) {

		System.out.println("Welcome to EPL Player Match Performance Index");
		System.out.println("Enter 1 for prediction in 2014 season, Enter 2 for prediction in 2015 season: ");
		Scanner in = new Scanner(System.in);
		int selectedYear = in.nextInt();
		if(selectedYear == 1) {

		} else if (selectedYear == 2) {

		} else {
			System.out.println("Wrong input!");
		}

		in.close();

		PMPIApp pmpiApp = new PMPIApp();
		pmpiApp.accessDatabaseHelper();
	}

	public void accessDatabaseHelper() {
		DatabaseHelper databaseHelper = new DatabaseHelper();
		//		databaseHelper.getAllMatchesInGameweek("2010/2011", "10");
		//		databaseHelper.getAllTeams("2008/2009");
		//		databaseHelper.getAllPlayers("10260", "489132");
		//		databaseHelper.getTotalPointsHistory("8455", "2008/2009");
		//		databaseHelper.getStandingsOfSeason("2011/2012");
		//		databaseHelper.getPreviousStandingsAllOpponents("10260", "489132", 2);
		databaseHelper.getListOfPlayersPlayed("10260", "489132", 5);
	}
}
