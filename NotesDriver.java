 package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImpl;
import com.greatlearning.service.NotesCount;

public class NotesDriver {

	public static void main(String[] arg)
	{
		MergeSortImpl mergeSortImpl = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();
		int size;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Size of Currency Denominations: ");
	    size = sc.nextInt();
	    System.out.println(" Enter the Currency Denomination Values: ");
	    int noteDenomination[] = new int[size];
	    for(int i =0; i<size; i++)
	    {
	     noteDenomination[i] = sc.nextInt();
	    }
	    System.out.println(" Please enter the amount you want to pay: ");
	    int amt = sc.nextInt();
	    mergeSortImpl.mergeSort(noteDenomination,0,noteDenomination.length-1);
	    for(int i=0; i<noteDenomination.length; i++)
	    {
	    	System.out.println(noteDenomination[i] + " ");
	    }
	    notesCount.implementNotesCount(noteDenomination, amt);
	}	
}
