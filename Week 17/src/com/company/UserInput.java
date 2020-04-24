package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInput {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public ArrayList<Integer> fillArray(){
        System.out.println("How big an array do you wanna sort?: ");
        int size = input.nextInt();
        for(int i = 0; i < size; i++){
            int j = random.nextInt(10000);
            arrayList.add(j);
        }
        return arrayList;
    }

    public int selectedSorting(){
        System.out.println("Sorting Method:\n (1) QuickSort\n (2) Merge Sort");
        return input.nextInt();
    }

}
