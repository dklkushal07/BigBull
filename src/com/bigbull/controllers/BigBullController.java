/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bigbull.controllers;

import com.bigbull.models.BigBullDataModel;
import java.util.ArrayList;

/**
 * The BigBullController class provides methods for sorting and filtering share data in
 a logbook.
 *
 * @author dklku
 */
public class BigBullController {

    /**
     * Sorts the ArrayList of BigBullDataModel objects based on the specified column in
 ascending or descending order.
     *
     * @param tableDataArrayList The ArrayList of BigBullDataModel objects to be
 sorted.
     * @param column The column by which the sorting should be done.
     * @param isAscending A boolean indicating whether the sorting order is
     * ascending (true) or descending (false).
     */
    public static void sortArrayList(ArrayList<BigBullDataModel> 
            tableDataArrayList, String column, boolean isAscending) {
        double[] columnArray = new double[tableDataArrayList.size()];
        for (int i = 0; i < tableDataArrayList.size(); i++) {
            switch (column) {
                case "Date" ->
                    columnArray[i] = Double.parseDouble(tableDataArrayList
                            .get(i).getDate().replace("-", ""));
                case "Price per Share" ->
                    columnArray[i] = tableDataArrayList.get(i).getPricePerShare();
                case "Quantity" ->
                    columnArray[i] = tableDataArrayList.get(i).getQuantity();
                case "Total Amount" ->
                    columnArray[i] = tableDataArrayList.get(i).getTotalAmount();
                default ->
                    columnArray[i] = tableDataArrayList.get(i).getSymbolNo();
            }
        }

        mergeSort(columnArray, tableDataArrayList, isAscending);
    }

    /**
     * Performs the merge sort algorithm on an array of doubles along with
     * maintaining the indices for rearranging the original ArrayList.
     *
     * @param inputArray The array of doubles to be sorted.
     * @param tableDataArrayList The original ArrayList of BigBullDataModel objects.
     * @param isAscending A boolean indicating whether the sorting order is
     * ascending (true) or descending (false).
     */
    public static void mergeSort(double[] inputArray,
            ArrayList<BigBullDataModel> tableDataArrayList, boolean isAscending) {
        int[] indices = new int[inputArray.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        mergeSortHelper(inputArray, indices, 0,
                inputArray.length - 1, isAscending);

        ArrayList<BigBullDataModel> sortedTableDataArrayList
                = new ArrayList<>(tableDataArrayList.size());
        for (int index : indices) {
            sortedTableDataArrayList.add(tableDataArrayList.get(index));
        }

        tableDataArrayList.clear();
        tableDataArrayList.addAll(sortedTableDataArrayList);
    }

    /**
     * Helper method for the mergeSort method.
     *
     * @param inputArray The array of doubles to be sorted.
     * @param indices The array of indices to be rearranged.
     * @param low The lower index of the array.
     * @param high The higher index of the array.
     * @param isAscending A boolean indicating whether the sorting order is
     * ascending (true) or descending (false).
     */
    private static void mergeSortHelper(double[] inputArray,
            int[] indices, int low, int high, boolean isAscending) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSortHelper(inputArray, indices, low, mid, isAscending);
            mergeSortHelper(inputArray, indices, mid + 1, high, isAscending);

            merge(inputArray, indices, low, mid, high, isAscending);
        }
    }

    /**
     * Merges two halves of an array during the merge sort process.
     *
     * @param inputArray The array of doubles to be sorted.
     * @param indices The array of indices to be rearranged.
     * @param low The lower index of the array.
     * @param mid The middle index of the array.
     * @param high The higher index of the array.
     * @param isAscending A boolean indicating whether the sorting order is
     * ascending (true) or descending (false).
     */
    private static void merge(double[] inputArray, int[] indices,
            int low, int mid, int high, boolean isAscending) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        double[] leftHalf = new double[leftSize];
        int[] leftIndices = new int[leftSize];
        double[] rightHalf = new double[rightSize];
        int[] rightIndices = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftHalf[i] = inputArray[low + i];
            leftIndices[i] = indices[low + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightHalf[j] = inputArray[mid + 1 + j];
            rightIndices[j] = indices[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        while (i < leftSize && j < rightSize) {
            if ((isAscending && leftHalf[i] <= rightHalf[j]) ||
                    (!isAscending && leftHalf[i] >= rightHalf[j])) {
                inputArray[k] = leftHalf[i];
                indices[k] = leftIndices[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                indices[k] = rightIndices[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            indices[k] = leftIndices[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            indices[k] = rightIndices[j];
            j++;
            k++;
        }
    }

    /**
     * Sorts an ArrayList of BigBullDataModel objects based on the symbols in ascending
 order.
     *
     * @param tableDataArrayList The ArrayList to be sorted.
     */
    public static void sortArrayListBySymbol(ArrayList<BigBullDataModel> tableDataArrayList) {
        String[] symbolArray = new String[tableDataArrayList.size()];

        // Extract symbols into an array
        for (int i = 0; i < tableDataArrayList.size(); i++) {
            symbolArray[i] = tableDataArrayList.get(i).getSymbol();
        }

        // Perform string merge sort on symbols
        stringMergeSort(symbolArray, tableDataArrayList);
    }

    /**
     * Performs string merge sort on an array of strings and updates the
     * provided ArrayList based on the sorted order of the strings.
     *
     * @param inputArray The array of strings to be sorted.
     * @param tableDataArrayList The ArrayList to be updated based on the sorted
     * order.
     */
    public static void stringMergeSort(String[] inputArray, ArrayList<BigBullDataModel> tableDataArrayList) {
        int[] indices = new int[inputArray.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        stringMergeSortHelper(inputArray, indices, 0, inputArray.length - 1);

        ArrayList<BigBullDataModel> sortedTableDataArrayList = new ArrayList<>(tableDataArrayList.size());
        for (int index : indices) {
            sortedTableDataArrayList.add(tableDataArrayList.get(index));
        }

        tableDataArrayList.clear();
        tableDataArrayList.addAll(sortedTableDataArrayList);
    }

    /**
     * Helper method for performing string merge sort on an array of strings.
     *
     * @param inputArray The array of strings to be sorted.
     * @param indices The array of indices corresponding to the original order
     * of the strings.
     * @param low The low index of the subarray to be sorted.
     * @param high The high index of the subarray to be sorted.
     */
    private static void stringMergeSortHelper(String[] inputArray, int[] indices, int low, int high) {
        /*
          Recursively divides the array into subarrays until each subarray has
          only one element. Then merges the subarrays in sorted order.

          @param low The low index of the current subarray.
         * @param high The high index of the current subarray.
         */
        if (low < high) {
            int mid = low + (high - low) / 2;

            stringMergeSortHelper(inputArray, indices, low, mid);
            stringMergeSortHelper(inputArray, indices, mid + 1, high);

            stringMerge(inputArray, indices, low, mid, high);
        }
    }

    /**
     * Merges two halves of an array of strings and updates the corresponding
     * indices array.
     *
     * @param inputArray The array of strings to be merged.
     * @param indices The array of indices corresponding to the original order
     * of the strings.
     * @param low The low index of the subarray to be merged.
     * @param mid The mid index of the subarray to be merged.
     * @param high The high index of the subarray to be merged.
     */
    private static void stringMerge(String[] inputArray, int[] indices, int low, int mid, int high) {
        /*
          Merges two halves of the array in sorted order. Updates both the
          array of strings and the array of indices.

          @param leftSize The size of the left half.
         * @param rightSize The size of the right half.
         * @param leftHalf The left half of the array.
         * @param rightHalf The right half of the array.
         * @param leftIndices The indices corresponding to the left half.
         * @param rightIndices The indices corresponding to the right half.
         * @param i Index for the left half.
         * @param j Index for the right half.
         * @param k Index for updating the main array and indices array.
         */
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        String[] leftHalf = new String[leftSize];
        int[] leftIndices = new int[leftSize];
        String[] rightHalf = new String[rightSize];
        int[] rightIndices = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftHalf[i] = inputArray[low + i];
            leftIndices[i] = indices[low + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightHalf[j] = inputArray[mid + 1 + j];
            rightIndices[j] = indices[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) <= 0) {
                inputArray[k] = leftHalf[i];
                indices[k] = leftIndices[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                indices[k] = rightIndices[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            indices[k] = leftIndices[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            indices[k] = rightIndices[j];
            j++;
            k++;
        }
    }

    /**
     * Filters an ArrayList of DataModel objects by a specified symbol using
     * binary search. Removes DataModels with symbols not equal to the specified
     * symbol.
     *
     * @param tableDataArrayList The ArrayList to be filtered.
     * @param symbol The symbol to filter by.
     */
    public static void filterArrayListBySymbolUsingBinarySearch(
            ArrayList<BigBullDataModel> tableDataArrayList, String symbol) {
        /*
          Filters the ArrayList based on the specified symbol using binary
          search. Updates the ArrayList to keep only the DataModels with the
          specified symbol.

          @param startIndex The index of the first occurrence of the specified
         * symbol.
         * @param endIndex The index of the last occurrence of the specified
         * symbol.
         * @param filteredList The ArrayList containing only the DataModels with
         * the specified symbol.
         */
        int startIndex = binarySearchForFirstOccurrence(tableDataArrayList, symbol);
        int endIndex = binarySearchForLastOccurrence(tableDataArrayList, symbol);

        if (startIndex != -1 && endIndex != -1) {
            ArrayList<BigBullDataModel> filteredList = new 
        ArrayList<>(tableDataArrayList.subList(startIndex, endIndex + 1));
            tableDataArrayList.clear();
            tableDataArrayList.addAll(filteredList);
        } else {
            tableDataArrayList.clear();
        }
    }

    /**
     * Performs a binary search to find the index of the first occurrence of a
 specified symbol in a sorted ArrayList of BigBullDataModel objects.
     *
     * @param tableDataArrayList The sorted ArrayList to search.
     * @param symbol The symbol to find the first occurrence of.
     * @return The index of the first occurrence of the specified symbol, or -1
     * if not found.
     */
    private static int binarySearchForFirstOccurrence(
            ArrayList<BigBullDataModel> tableDataArrayList, String symbol) {
        /*
          Binary search to find the first occurrence of the specified symbol in
          a sorted ArrayList. Updates the search range based on the comparison
          of symbols.

          @param low The low index of the current search range.
         * @param high The high index of the current search range.
         * @param mid The mid index of the current search range.
         * @param midSymbol The symbol at the mid index.
         * @param result The index of the first occurrence of the specified
         * symbol.
         */
        int low = 0;
        int high = tableDataArrayList.size() - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midSymbol = tableDataArrayList.get(mid).getSymbol();

            if (midSymbol.equals(symbol)) {
                result = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (midSymbol.compareTo(symbol) < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return result;
    }

    /**
     * Performs a binary search to find the index of the last occurrence of a
 specified symbol in a sorted ArrayList of BigBullDataModel objects.
     *
     * @param tableDataArrayList The sorted ArrayList to search.
     * @param symbol The symbol to find the last occurrence of.
     * @return The index of the last occurrence of the specified symbol, or -1
     * if not found.
     */
    private static int binarySearchForLastOccurrence(
            ArrayList<BigBullDataModel> tableDataArrayList, String symbol) {
        /*
          Binary search to find the last occurrence of the specified symbol in
          a sorted ArrayList. Updates the search range based on the comparison
          of symbols.

          @param low The low index of the current search range.
         * @param high The high index of the current search range.
         * @param mid The mid index of the current search range.
         * @param midSymbol The symbol at the mid index.
         * @param result The index of the last occurrence of the specified
         * symbol.
         */
        int low = 0;
        int high = tableDataArrayList.size() - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midSymbol = tableDataArrayList.get(mid).getSymbol();

            if (midSymbol.equals(symbol)) {
                result = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (midSymbol.compareTo(symbol) < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return result;
    }

}
