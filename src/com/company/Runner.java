package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        int[] testArr = SortingUtils.randIntArray(10);
        System.out.print("Before: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        SelectionSort.selectionSort(testArr);
        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
