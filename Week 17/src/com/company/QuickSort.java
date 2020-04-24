package com.company;

import java.util.ArrayList;

public class QuickSort {
    private int count = 0;

    //r = last/rightmost element in the array
    //p = first element in the array
    //q = the index where the select pivot ends up after partitioning

    public void sort(ArrayList<Integer> arrayList){
        System.out.println(arrayList.toString());
        quickSort(arrayList, 0, arrayList.size()-1);
        System.out.println(arrayList.toString());
    }

    private void swap(ArrayList<Integer> arrayList, int firstIndex, int secondIndex){
        int temp = arrayList.get(firstIndex);
        arrayList.set(firstIndex, arrayList.get(secondIndex));
        arrayList.set(secondIndex, temp);
    }

    private int partitioning(ArrayList<Integer> arrayList, int p, int r){
        /*
         Returns index of pivot
         Compare arrayList[j] with arrayList[r], for j = p, p+1,...r-1 maintaining that:
        */

        int q = p;

        /*
         array[r] (last element) is the pivot
         array[p..q-1] are values larger than array[r]
         That means values left of pivot are less than or equal to pivot

         array[q..j-1] are values smaller than array[r]
         that means values right of pivot are greater than pivot

         array[j..r-1] haven't been compared with array[r]
         If array[j] > array[r], just increment j.
        */

        for(int i = p; i < r; i++){
            // If array[j] <= array[r], swap array[j] with array[q], increment q, and increment j.
            if(arrayList.get(i) <= arrayList.get(r)) {
                swap(arrayList, i, q);
                q++;
            }
        }

        /*
         When all values in array[p..r-1] have been compared with array[r],
         swap array[r] with array[q. q is the new index of the pivot
        */

        swap(arrayList, r, q);
        return q;
    }

    private void quickSort(ArrayList<Integer> arrayList, int p, int r){
        if(p < r){
            int pivot = partitioning(arrayList, p , r);
            quickSort(arrayList, p, pivot - 1);
            quickSort(arrayList, pivot + 1, r);
        }

        //To see the sorting in action
        count++;
        System.out.println(count + " - " + arrayList.toString());
    }
}
