package com.company;

public class SelectionSort
{
    public static void selectionSort(int []arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            SortingUtils.swap(arr, i, (SortingUtils.minimumIndex(arr, i)));
        }
    }
}
