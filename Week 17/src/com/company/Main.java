package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
	    ArrayList<Integer> arrayList = userInput.fillArray();
	    int selection = userInput.selectedSorting();

	    switch (selection) {
            case 1:
                new QuickSort().sort(arrayList);
                break;
            case 2:
                new MergeSort().sort(arrayList);
                break;
            default:
                System.out.println("Input not recognized... program ending");
        }
    }
}
