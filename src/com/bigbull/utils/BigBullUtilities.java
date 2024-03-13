/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bigbull.utils;

import com.bigbull.controllers.BigBullController;
import com.bigbull.models.BigBullDataModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * BigBullUtilities class provides various utility methods for managing and
 manipulating share data in the logbook.
 *
 * @author dklku
 */
public class BigBullUtilities {

    private static ArrayList<BigBullDataModel> tableDataArrayList; // Holds share data in memory
    private static short counter = 0; // Counter for table population

    /**
     * Populates the tableDataArrayList with sample share data.
     */
    public static void populateTableDataArrayList() {
        tableDataArrayList = new ArrayList<>();
        // Sample share data
        BigBullDataModel row1 = new BigBullDataModel((short) 1,
                "2017-11-13", "SIKLES", "Buy",
                492.00f, 70, 34440, 147.92601f,
                34587.926f, "Hydropower", "Bought at low");
        tableDataArrayList.add(row1);
        BigBullDataModel row2 = new BigBullDataModel((short) 2,
                "2022-04-17", "ADBL", "Sell",
                245.00f, 100, 24500, 101.67501f,
                24398.324f, "Bank", "Sold at high");
        tableDataArrayList.add(row2);
        BigBullDataModel row3 = new BigBullDataModel((short) 3,
                "2019-08-04", "NGPL", "Buy",
                243.00f, 30, 7290, 35.2535f,
                7325.2534f, "Hydropower", "Will grow");
        tableDataArrayList.add(row3);
        BigBullDataModel row4 = new BigBullDataModel((short) 4,
                "2024-01-11", "NABIL", "Buy",
                492.00f, 10, 4920, 25.418001f,
                4945.418f, "Bank", "Stable stock");
        tableDataArrayList.add(row4);
        BigBullDataModel row5 = new BigBullDataModel((short) 5,
                "2023-10-01", "ADBL", "Buy",
                230.00f, 300, 69000, 270.648f,
                69270.648f, "Bank", "Same stock, low price");
        tableDataArrayList.add(row5);
        BigBullDataModel row6 = new BigBullDataModel((short) 6,
                "2018-07-07", "PFL", "Sell",
                394.60f, 50, 19730, 81.88f,
                19648.121f, "Finance", "Needed urgent money");
        tableDataArrayList.add(row6);
        BigBullDataModel row7 = new BigBullDataModel((short) 7,
                "2021-12-21", "BBC", "Sell",
                3864.00f, 20, 77280, 297.528f,
                76982.469f, "Trading", "trading equity boring");
        tableDataArrayList.add(row7);
        BigBullDataModel row8 = new BigBullDataModel((short) 8,
                "2024-01-12", "ADBL", "Buy",
                225.00f, 100, 22500, 98.375f,
                22598.375f, "Bank", "added some more");
        tableDataArrayList.add(row8);
        BigBullDataModel row9 = new BigBullDataModel((short) 9,
                "2021-12-09", "NIL", "Sell",
                832.50f, 50, 41625, 172.744f,
                41452.258f, "Insurance", "might go down");
        tableDataArrayList.add(row9);
    }

    /**
     * Adds a new row of share data to the tableDataArrayList.
     *
     * @param newRowData The BigBullDataModel object representing the new row of share
 data.
     */
    public static void addRowToTable(BigBullDataModel newRowData) {
        newRowData.setSymbolNo((short) (tableDataArrayList.size() + 1));
        tableDataArrayList.add(newRowData);
    }

    /**
     * Updates an existing row of share data in the tableDataArrayList.
     *
     * @param updatedRowData The BigBullDataModel object representing the updated row
 of share data.
     */
    public static void updateRowOfTable(BigBullDataModel updatedRowData) {
        short rowIndex = (short) (updatedRowData.getSymbolNo() - 1);
        tableDataArrayList.set(rowIndex, updatedRowData);
    }

    /**
     * Deletes a row of share data from the tableDataArrayList.
     *
     * @param symbolNoOfRowToDelete The symbol number of the row to be deleted.
     */
    public static void deleteRowFromTable(short symbolNoOfRowToDelete) {
        tableDataArrayList.remove(symbolNoOfRowToDelete - 1);
        BigBullController.sortArrayList(tableDataArrayList, "Symbol No.", true);
        for (int i = symbolNoOfRowToDelete - 1; i < tableDataArrayList.size(); i++) {
            BigBullDataModel row = tableDataArrayList.get(i);
            row.setSymbolNo((short) (row.getSymbolNo() - 1));
        }
    }

    /**
     * Populates the specified JTable with share data based on filtering and
     * sorting criteria.
     *
     * @param table The JTable to be populated.
     * @param transactionType The transaction type to filter by.
     * @param sector The sector to filter by.
     * @param column The column to sort by.
     * @param isAscending Indicates whether the sorting order is ascending or
     * descending.
     * @param symbol The symbol to filter by.
     */
    public static void populateTable(JTable table, String transactionType,
            String sector, String column, boolean isAscending, String symbol) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        if (counter < 1) {
            populateTableDataArrayList();
            counter++;
        }
        tableModel.setRowCount(0);
        ArrayList<BigBullDataModel> tempTableDataArrayList = new 
        ArrayList<>(tableDataArrayList);
        if (!symbol.isEmpty()) {
            BigBullController.sortArrayListBySymbol(tableDataArrayList);
            BigBullController.filterArrayListBySymbolUsingBinarySearch(
                    tableDataArrayList, symbol.toUpperCase());
        }
        BigBullController.sortArrayList(tableDataArrayList, column, isAscending);
        for (BigBullDataModel dataModel : tableDataArrayList) {
            boolean matchTransactionType = transactionType.equals("All")
                    || transactionType.equals(dataModel.getTransactionType());
            boolean matchSector = sector.equals("All") ||
                    sector.equals(dataModel.getSector());

            if (matchTransactionType && matchSector) {
                tableModel.addRow(new Object[]{
                    dataModel.getSymbolNo(),
                    dataModel.getDate(),
                    dataModel.getSymbol(),
                    dataModel.getTransactionType(),
                    dataModel.getPricePerShare(),
                    dataModel.getQuantity(),
                    dataModel.getTotalAmount(),
                    dataModel.getFees(),
                    dataModel.getTotalAfterFees(),
                    dataModel.getSector(),
                    dataModel.getNote()
                });
            }
        }
        tableDataArrayList.clear();
        tableDataArrayList.addAll(tempTableDataArrayList);
    }
}
