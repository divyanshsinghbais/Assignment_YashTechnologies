package com.assessment.sheet1;

import java.util.Scanner;

import com.assessment.sheet1.view.ConsoleView;

/**
 * @author divyansh.singh
 *
 */
public class Main {

	public static void main(String[] args) {

		/*
		 * Using object for calling view methods
		 */
		ConsoleView cv = new ConsoleView();
		
		try (/*
				 * Take user input for conditional switch views
				 */
		Scanner inp = new Scanner(System.in)) {
			/*
			 * Default view on console
			 */
			cv.viewFirst();
			int xx = inp.nextInt();

			/*
			 * Dynamic selection of program to run 
			 */
			switch(xx) {
			case 1:
				cv.viewInsertStringAt();
				break;

			case 2:
				cv.viewSortStringDescending();
				break;

			case 3:
				cv.viewRemoveVowels();
				break;

			case 4:
				cv.viewCountOfRepeatedAlphabats();
				break;

			case 5:
				cv.viewPerformanceTestingStringBuffervsBuilder();
				break;

			case 6:
				cv.viewStringObjectsInMemory();
				break;

			case 7:
				cv.viewCheckGarbageCollector();
				break;
				
			case 8:
				cv.viewPrintThirdLargest();
				break;
				
			case 9:
				cv.viewPrintDuplicateElements();
				break;
				
			case 10:
				cv.viewPrintPythagorasCombination();
				break;

			default:
				System.out.println("Wrong input!! Please re-run the application again");
				System.exit(0);
				break;
			}
		}


	}
}
