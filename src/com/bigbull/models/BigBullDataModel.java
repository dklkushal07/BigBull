/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bigbull.models;

/**
 * The BigBullDataModel class represents a data model for financial transactions. It
 * encapsulates information about a transaction, including date, symbol,
 * transaction type, price per share, quantity, total amount, fees, total after
 * fees, sector, and notes.
 *
 * @author dklku
 */
public class BigBullDataModel {

    private short symbolNo;
    private String date;
    private String symbol;
    private String transactionType;
    private float pricePerShare;
    private int quantity;
    private float totalAmount;
    private float fees;
    private float totalAfterFees;
    private String sector;
    private String note;

    /**
     * Constructs a BigBullDataModel instance with the specified parameters.
     *
     * @param symbolNo The symbol number.
     * @param date The date of the transaction.
     * @param symbol The symbol associated with the transaction.
     * @param transactionType The type of transaction (Buy or Sell).
     * @param pricePerShare The price per share for the transaction.
     * @param quantity The quantity of shares involved in the transaction.
     * @param totalAmount The total amount of the transaction.
     * @param fees The fees associated with the transaction.
     * @param totalAfterFees The total amount after adding/deducting fees.
     * @param sector The sector of the share company.
     * @param note Additional notes for the transaction.
     */
    public BigBullDataModel(short symbolNo, String date, String symbol, String transactionType, float pricePerShare,
            int quantity, float totalAmount, float fees, float totalAfterFees, String sector, String note) {
        this.symbolNo = symbolNo;
        this.date = date;
        this.symbol = symbol;
        this.transactionType = transactionType;
        this.pricePerShare = pricePerShare;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.fees = fees;
        this.totalAfterFees = totalAfterFees;
        this.sector = sector;
        this.note = note;
    }

    /**
     * Getter method for retrieving the symbol number.
     *
     * @return The symbol number.
     */
    public short getSymbolNo() {
        return symbolNo;
    }

    /**
     * Setter method for setting the symbol number.
     *
     * @param symbolNo The symbol number to be set.
     */
    public void setSymbolNo(short symbolNo) {
        this.symbolNo = symbolNo;
    }

    /**
     * Getter method for retrieving the date of the transaction.
     *
     * @return The date of the transaction.
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter method for setting the date of the transaction.
     *
     * @param date The date to be set.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter method for retrieving the symbol associated with the transaction.
     *
     * @return The symbol associated with the transaction.
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Setter method for setting the symbol associated with the transaction.
     *
     * @param symbol The symbol to be set.
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter method for retrieving the type of transaction (Buy or Sell).
     *
     * @return The type of transaction.
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Setter method for setting the type of transaction (Buy or Sell).
     *
     * @param transactionType The type of transaction to be set.
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Getter method for retrieving the price per share for the transaction.
     *
     * @return The price per share.
     */
    public float getPricePerShare() {
        return pricePerShare;
    }

    /**
     * Setter method for setting the price per share for the transaction.
     *
     * @param pricePerShare The price per share to be set.
     */
    public void setPricePerShare(float pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    /**
     * Getter method for retrieving the quantity of shares involved in the
     * transaction.
     *
     * @return The quantity of shares.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for setting the quantity of shares involved in the
     * transaction.
     *
     * @param quantity The quantity of shares to be set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter method for retrieving the total amount of the transaction.
     *
     * @return The total amount.
     */
    public float getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter method for setting the total amount of the transaction.
     *
     * @param totalAmount The total amount to be set.
     */
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter method for retrieving the fees associated with the transaction.
     *
     * @return The fees.
     */
    public float getFees() {
        return fees;
    }

    /**
     * Setter method for setting the fees associated with the transaction.
     *
     * @param fees The fees to be set.
     */
    public void setFees(float fees) {
        this.fees = fees;
    }

    /**
     * Getter method for retrieving the total amount after deducting fees.
     *
     * @return The total amount after deducting fees.
     */
    public float getTotalAfterFees() {
        return totalAfterFees;
    }

    /**
     * Setter method for setting the total amount after deducting fees.
     *
     * @param totalAfterFees The total amount after deducting fees to be set.
     */
    public void setTotalAfterFees(float totalAfterFees) {
        this.totalAfterFees = totalAfterFees;
    }

    /**
     * Getter method for retrieving the sector associated with the transaction.
     *
     * @return The sector.
     */
    public String getSector() {
        return sector;
    }

    /**
     * Setter method for setting the sector associated with the transaction.
     *
     * @param sector The sector to be set.
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * Getter method for retrieving additional notes for the transaction.
     *
     * @return The notes.
     */
    public String getNote() {
        return note;
    }

    /**
     * Setter method for setting additional notes for the transaction.
     *
     * @param note The notes to be set.
     */
    public void setNote(String note) {
        this.note = note;
    }
}
