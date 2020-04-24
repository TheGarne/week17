package com.company;

import java.util.ArrayList;

public class MergeSort {
    //r = last/rightmost element in the array
    //p = first element in the array (0 - zero)
    //q = the index where the select pivot ends up after partitioning

    public void sort(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.toString());
        mergeSort(arrayList, 0, arrayList.size()-1);
        System.out.println(arrayList.toString());
    }


    private void mergeSort(ArrayList<Integer> arrayList, int p, int r){
        if(p < r){
            int q = (int) Math.floor((p + r)/2);
            mergeSort(arrayList, p, q);
            mergeSort(arrayList, q + 1, r);
            merge(arrayList, p, q, r);
        }
    }

    private void merge(ArrayList<Integer> arrayList, int p, int q, int r){
        //Two new arrays are created and the original array is split
        ArrayList<Integer> lowHalf = new ArrayList<>();
        ArrayList<Integer> topHalf = new ArrayList<>();

        int k = p;
        int i;
        int j;

        //Values from original array entered into the new arrays
        for (i = 0; k <= q; i++, k++) {
            lowHalf.add(i, arrayList.get(k));
        }
        for (j = 0; k <= r; j++, k++) {
            topHalf.add(j, arrayList.get(k));
        }


        k = p;
        i = 0;
        j = 0;


        while (i < lowHalf.size() && j < topHalf.size()) {
            if (lowHalf.get(i) < topHalf.get(j)) {
                arrayList.set(k, lowHalf.get(i));
                i++;
            } else {
                arrayList.set(k, topHalf.get(j));
                j++;
            }
            k++;
        }

        while (i < lowHalf.size()) {
            arrayList.set(k, lowHalf.get(i));
            k++;
            i++;
        }
        while (j < topHalf.size()) {
            arrayList.set(k, topHalf.get(j));
            k++;
            j++;
        }
    }
}
