/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bigbull.views;

import com.bigbull.models.BigBullDataModel;
import com.bigbull.utils.BigBullUtilities;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * The BigBullForm class represents a graphical user interface for data input or
 * update. It extends the javax.swing.JFrame class and provides methods to
 * handle form operations.
 *
 * @author dklku
 */
public class BigBullForm extends javax.swing.JFrame {

    // Flag indicating whether the form is in update mode
    private boolean isUpdate;

    // List of months used in the form
    final private ArrayList<String> months = new ArrayList<>(List.of("January", "February", "March", "April", "May",
            "June", "July", "August", "September",
            "October", "November", "December"));

    // BigBullDataModel object to store updated row data during an update
    private BigBullDataModel updatedRowData;

    /**
     * Creates a new Form instance in the default state (not in update mode).
     * Initializes the form components and applies custom settings.
     */
    public BigBullForm() {
        initComponents();
        this.isUpdate = false;
        mySettings();
    }

    /**
     * Creates a new Form instance in update mode and populates the form with
     * the data from the selectedRowData.
     *
     * @param selectedRowData The BigBullDataModel object representing the selected row
 data.
     */
    public BigBullForm(BigBullDataModel selectedRowData) {
        initComponents();
        mySettings();
        this.isUpdate = true;
        populateUpdateForm(selectedRowData);
        this.updatedRowData = selectedRowData;
    }

    /**
     * Initializes the form components. This method is called from within the
     * constructor and should not be modified.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel = new javax.swing.JPanel();
        headerJPanel = new javax.swing.JPanel();
        logoJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        headerJLabel = new javax.swing.JLabel();
        formTitleJLabel = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        yearJComboBox = new javax.swing.JComboBox<>();
        monthJComboBox = new javax.swing.JComboBox<>();
        dayJComboBox = new javax.swing.JComboBox<>();
        symbolJLabel = new javax.swing.JLabel();
        symbolJTextField = new javax.swing.JTextField();
        symbolWarningJLabel = new javax.swing.JLabel();
        transactionTypeJLabel = new javax.swing.JLabel();
        transactionTypeJComboBox = new javax.swing.JComboBox<>();
        pricePerShareJLabel = new javax.swing.JLabel();
        pricePerShareJTextField = new javax.swing.JTextField();
        pricePerShareWarningJLabel = new javax.swing.JLabel();
        quantityJLabel = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        quantityWarningJLabel = new javax.swing.JLabel();
        sectorJLabel = new javax.swing.JLabel();
        sectorJComboBox = new javax.swing.JComboBox<>();
        noteJLabel = new javax.swing.JLabel();
        noteJTextField = new javax.swing.JTextField();
        cancelEntryJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        noteWarningJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setResizable(false);

        formPanel.setForeground(new java.awt.Color(217, 217, 217));
        formPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        headerJPanel.setBackground(new java.awt.Color(246, 250, 253));
        headerJPanel.setFocusCycleRoot(true);
        headerJPanel.setMaximumSize(new java.awt.Dimension(1280, 118));
        headerJPanel.setMinimumSize(new java.awt.Dimension(1280, 118));
        headerJPanel.setName(""); // NOI18N

        logoJPanel.setMaximumSize(new java.awt.Dimension(118, 118));
        logoJPanel.setMinimumSize(new java.awt.Dimension(118, 118));
        logoJPanel.setName(""); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bigbull/views/assets/Logo_118.png"))); // NOI18N

        javax.swing.GroupLayout logoJPanelLayout = new javax.swing.GroupLayout(logoJPanel);
        logoJPanel.setLayout(logoJPanelLayout);
        logoJPanelLayout.setHorizontalGroup(
            logoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(logoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoJPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        logoJPanelLayout.setVerticalGroup(
            logoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(logoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoJPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        headerJLabel.setFont(new java.awt.Font("Inter", 1, 32)); // NOI18N
        headerJLabel.setForeground(new java.awt.Color(9, 44, 76));
        headerJLabel.setText("BigBull: Your Personal Stock Logbook");
        headerJLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout headerJPanelLayout = new javax.swing.GroupLayout(headerJPanel);
        headerJPanel.setLayout(headerJPanelLayout);
        headerJPanelLayout.setHorizontalGroup(
            headerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerJPanelLayout.createSequentialGroup()
                .addComponent(logoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(headerJLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerJPanelLayout.setVerticalGroup(
            headerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerJPanelLayout.createSequentialGroup()
                .addComponent(logoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerJLabel)
                .addGap(37, 37, 37))
        );

        formTitleJLabel.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        formTitleJLabel.setForeground(new java.awt.Color(9, 44, 76));
        formTitleJLabel.setText("Add Entry");

        dateJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        dateJLabel.setForeground(new java.awt.Color(9, 44, 76));
        dateJLabel.setText("Date:");

        yearJComboBox.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        yearJComboBox.setForeground(new java.awt.Color(9, 44, 76));
        yearJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015" }));
        yearJComboBox.setToolTipText("");

        monthJComboBox.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        monthJComboBox.setForeground(new java.awt.Color(9, 44, 76));
        monthJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        dayJComboBox.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        dayJComboBox.setForeground(new java.awt.Color(9, 44, 76));
        dayJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        symbolJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        symbolJLabel.setForeground(new java.awt.Color(9, 44, 76));
        symbolJLabel.setText("Symbol:");

        symbolJTextField.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        symbolWarningJLabel.setForeground(new java.awt.Color(207, 48, 48));
        symbolWarningJLabel.setText("Cannot be empty!");

        transactionTypeJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        transactionTypeJLabel.setForeground(new java.awt.Color(9, 44, 76));
        transactionTypeJLabel.setText("Transaction Type:");

        transactionTypeJComboBox.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        transactionTypeJComboBox.setForeground(new java.awt.Color(9, 44, 76));
        transactionTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buy", "Sell" }));

        pricePerShareJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        pricePerShareJLabel.setForeground(new java.awt.Color(9, 44, 76));
        pricePerShareJLabel.setText("Price Per Share:");

        pricePerShareJTextField.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        pricePerShareWarningJLabel.setForeground(new java.awt.Color(207, 48, 48));
        pricePerShareWarningJLabel.setText("Cannot be empty!");

        quantityJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        quantityJLabel.setForeground(new java.awt.Color(9, 44, 76));
        quantityJLabel.setText("Quantity:");

        quantityJTextField.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        quantityWarningJLabel.setForeground(new java.awt.Color(207, 48, 48));
        quantityWarningJLabel.setText("Cannot be empty!");

        sectorJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        sectorJLabel.setForeground(new java.awt.Color(9, 44, 76));
        sectorJLabel.setText("Sector:");

        sectorJComboBox.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        sectorJComboBox.setForeground(new java.awt.Color(9, 44, 76));
        sectorJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank", "Hydropower", "Insurance", "Finance", "Investment", "Trading", "Other" }));

        noteJLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        noteJLabel.setForeground(new java.awt.Color(9, 44, 76));
        noteJLabel.setText("Note:");

        noteJTextField.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        cancelEntryJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bigbull/views/assets/Cancel_Icon.png"))); // NOI18N
        cancelEntryJButton.setBorder(null);
        cancelEntryJButton.setOpaque(true);
        cancelEntryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEntryJButtonActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(0, 157, 119));
        submitJButton.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.setBorder(null);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        noteWarningJLabel.setForeground(new java.awt.Color(207, 48, 48));
        noteWarningJLabel.setText("Cannot be empty!");

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formTitleJLabel)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(formPanelLayout.createSequentialGroup()
                                    .addComponent(noteJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(noteJTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formPanelLayout.createSequentialGroup()
                                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(transactionTypeJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(transactionTypeJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(quantityJLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(formPanelLayout.createSequentialGroup()
                                            .addComponent(quantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(quantityWarningJLabel)))
                                    .addGap(78, 78, 78)
                                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(symbolJLabel)
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cancelEntryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(sectorJLabel)
                                                .addComponent(pricePerShareJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pricePerShareJTextField)
                                                .addComponent(symbolJTextField)
                                                .addComponent(sectorJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(yearJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pricePerShareWarningJLabel)
                            .addComponent(noteWarningJLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                                .addComponent(symbolWarningJLabel)
                                .addGap(59, 59, 59)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(formTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cancelEntryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJLabel)
                    .addComponent(symbolJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolWarningJLabel))
                .addGap(19, 19, 19)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionTypeJLabel)
                    .addComponent(pricePerShareJLabel))
                .addGap(5, 5, 5)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricePerShareJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricePerShareWarningJLabel))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityJLabel)
                    .addComponent(sectorJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityWarningJLabel))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteJLabel)
                    .addComponent(noteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noteWarningJLabel))
                .addGap(18, 18, 18)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action event when the submit button is clicked. Validates the
     * form entries and processes the data accordingly.
     *
     * @param evt The ActionEvent triggered by the submit button click.
     */
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // Validate form entries
        boolean isValid = validateEntries();

        // If form entries are valid, process the data
        if (isValid) {
            // Extract data from form components
            String date = yearJComboBox.getSelectedItem().toString() + "-"
                    + String.format("%02d",
                            (months.indexOf((monthJComboBox.getSelectedItem().toString())) + 1))
                    + "-" + dayJComboBox.getSelectedItem().toString();
            String symbol = symbolJTextField.getText().toUpperCase();
            String transactionType = transactionTypeJComboBox.getSelectedItem().toString();
            float pricePerShare = Float.parseFloat(pricePerShareJTextField.getText());
            int quantity = Integer.parseInt(quantityJTextField.getText());
            float totalAmount = pricePerShare * quantity;
            float fees = getFees(totalAmount);
            int nameTransferCharge = 5;
            float totalAfterFees;

            // Calculate total after fees based on transaction type
            if (transactionType.equals("Buy")) {
                fees += nameTransferCharge;
                totalAfterFees = totalAmount + fees;
            } else {
                totalAfterFees = totalAmount - fees;
            }

            String sector = sectorJComboBox.getSelectedItem().toString();
            String note = noteJTextField.getText();
            
            if (isUpdate){
                JOptionPane.showMessageDialog(null,
                        ("The entry with symbol "+ symbol+
                                " has been updated"),
                        "Entry Updated!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        ("A new entry has been added!"),
                        "Entry Added!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            // Dispose the form
            this.dispose();

            // Update or add data to the table based on the update mode
            if (isUpdate) {
                updatedRowData.setDate(date);
                updatedRowData.setSymbol(symbol);
                updatedRowData.setTransactionType(transactionType);
                updatedRowData.setPricePerShare(pricePerShare);
                updatedRowData.setQuantity(quantity);
                updatedRowData.setTotalAmount(totalAmount);
                updatedRowData.setFees(fees);
                updatedRowData.setTotalAfterFees(totalAfterFees);
                updatedRowData.setSector(sector);
                updatedRowData.setNote(note);
                BigBullUtilities.updateRowOfTable(updatedRowData);
            } else {
                short symbolNo = -1;
                BigBullDataModel newRowData = new BigBullDataModel(symbolNo,
                        date, symbol, transactionType, pricePerShare, quantity,
                        totalAmount, fees, totalAfterFees, sector, note);
                BigBullUtilities.addRowToTable(newRowData);
            }

            // Show the main frame
            BigBull mainFrame = new BigBull();
            mainFrame.setVisible(true);
        } else {
            // Display a warning message if form entries are not valid
            JOptionPane.showMessageDialog(null,
                    "Please fill the form properly!", "Invalid Inputs!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    /**
     * Calculates and returns the fees based on the total amount. The fees
     * include brokerage and SEBON (Securities Board of Nepal) charges.
     *
     * @param totalAmount The total amount of the financial transaction.
     * @return The calculated fees based on the total amount.
     */
    private static float getFees(float totalAmount) {
        float brokeragePct;

        // Calculate brokerage percentage based on total amount
        if (totalAmount <= 50000) {
            brokeragePct = 0.40f;
        } else if (totalAmount <= 500000) {
            brokeragePct = 0.37f;
        } else if (totalAmount <= 2000000) {
            brokeragePct = 0.34f;
        } else if (totalAmount <= 10000000) {
            brokeragePct = 0.30f;
        } else {
            brokeragePct = 0.27f;
        }

        float sebonChargePct = 0.015f;

        // Calculate fees using brokerage and SEBON charges
        float fees = brokeragePct * 0.01f * totalAmount + sebonChargePct * 0.01f * totalAmount;
        return fees;
    }

    /**
     * Handles the action event when the cancel entry button is clicked. Prompts
     * the user for confirmation and exits the form without saving changes or
     * adding an entry.
     *
     * @param evt The ActionEvent triggered by the cancel entry button click.
     */
    private void cancelEntryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEntryJButtonActionPerformed
        // Variable to store user confirmation choice
        int userConfirmation;

        // Determine the appropriate confirmation message based on update mode
        if (this.isUpdate) {
            userConfirmation = JOptionPane.showConfirmDialog(null,
                    "Do you sure want to exit without making any changes?", "Cancel Update!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } else {
            userConfirmation = JOptionPane.showConfirmDialog(null,
                    "Do you sure want to exit without adding an entry?", "Cancel Entry!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }

        // If the user confirms, hide the form and show the main frame
        if (userConfirmation == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new BigBull().setVisible(true);
        }
    }
//GEN-LAST:event_cancelEntryJButtonActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BigBullForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BigBullForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BigBullForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BigBullForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BigBullForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelEntryJButton;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JComboBox<String> dayJComboBox;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel formTitleJLabel;
    private javax.swing.JLabel headerJLabel;
    private javax.swing.JPanel headerJPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel logoJPanel;
    private javax.swing.JComboBox<String> monthJComboBox;
    private javax.swing.JLabel noteJLabel;
    private javax.swing.JTextField noteJTextField;
    private javax.swing.JLabel noteWarningJLabel;
    private javax.swing.JLabel pricePerShareJLabel;
    private javax.swing.JTextField pricePerShareJTextField;
    private javax.swing.JLabel pricePerShareWarningJLabel;
    private javax.swing.JLabel quantityJLabel;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JLabel quantityWarningJLabel;
    private javax.swing.JComboBox<String> sectorJComboBox;
    private javax.swing.JLabel sectorJLabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel symbolJLabel;
    private javax.swing.JTextField symbolJTextField;
    private javax.swing.JLabel symbolWarningJLabel;
    private javax.swing.JComboBox<String> transactionTypeJComboBox;
    private javax.swing.JLabel transactionTypeJLabel;
    private javax.swing.JComboBox<String> yearJComboBox;
    // End of variables declaration//GEN-END:variables

    /**
     * Populates the form with data from the selectedRowData for an update
     * operation.
     *
     * @param selectedRowData The BigBullDataModel object representing the selected row
 data to be updated.
     */
    private void populateUpdateForm(BigBullDataModel selectedRowData) {
        // Set the form title for update
        formTitleJLabel.setText("Update Entry");

        // Extract year, month, and day from the selected row data's date
        String date = selectedRowData.getDate();
        String year = date.substring(0, 4);
        String month = months.get(Integer.parseInt(date.substring(5, 7)) - 1);
        String day = date.substring(8, 10);

        // Set the selected values in the corresponding form components
        yearJComboBox.setSelectedItem(year);
        monthJComboBox.setSelectedItem(month);
        dayJComboBox.setSelectedItem(day);
        symbolJTextField.setText(selectedRowData.getSymbol());
        transactionTypeJComboBox.setSelectedItem(selectedRowData.getTransactionType());
        pricePerShareJTextField.setText(String.valueOf(selectedRowData.getPricePerShare()));
        quantityJTextField.setText(String.valueOf(selectedRowData.getQuantity()));
        sectorJComboBox.setSelectedItem(selectedRowData.getSector());
        noteJTextField.setText(selectedRowData.getNote());
    }

    /**
     * Validates the form entries and displays appropriate warning messages for
     * invalid inputs.
     *
     * @return true if all form entries are valid, false otherwise.
     */
    private boolean validateEntries() {
        // Initialize validation status to true
        boolean isValid = true;

        // Validate symbol
        if (symbolJTextField.getText().isEmpty()) {
            isValid = false;
            symbolWarningJLabel.setText("Cannot be empty!");
            symbolWarningJLabel.setVisible(true);
        } else if (!symbolJTextField.getText().matches("[a-zA-Z]*")) {
            symbolWarningJLabel.setText("Only letters");
            symbolWarningJLabel.setVisible(true);
            isValid = false;
        } else {
            symbolWarningJLabel.setVisible(false);
        }

        // Validate price per share
        if (pricePerShareJTextField.getText().isEmpty()) {
            isValid = false;
            pricePerShareWarningJLabel.setText("Cannot be empty!");
            pricePerShareWarningJLabel.setVisible(true);
        } else {
            try {
                Float.valueOf(pricePerShareJTextField.getText());
                pricePerShareWarningJLabel.setVisible(false);
            } catch (NumberFormatException e) {
                pricePerShareWarningJLabel.setText("Enter a valid number!");
                pricePerShareWarningJLabel.setVisible(true);
                isValid = false;
            }
        }

        // Validate quantity
        if (quantityJTextField.getText().isEmpty()) {
            quantityWarningJLabel.setText("Cannot be empty!");
            quantityWarningJLabel.setVisible(true);
            isValid = false;
        } else {
            try {
                Integer.valueOf(quantityJTextField.getText());
                quantityWarningJLabel.setVisible(false);
            } catch (NumberFormatException e) {
                isValid = false;
                quantityWarningJLabel.setText("Enter a valid number!");
                quantityWarningJLabel.setVisible(true);
            }
        }

        // Validate note
        if (noteJTextField.getText().isEmpty()) {
            isValid = false;
            noteWarningJLabel.setText("Cannot be empty!");
            noteWarningJLabel.setVisible(true);
        } else {
            noteWarningJLabel.setVisible(false);
        }

        // Return the overall validation status
        return isValid;
    }

    /**
     * Applies custom settings to the form, such as hiding warning labels
     * initially.
     */
    private void mySettings() {
        // Hide warning labels initially
        symbolWarningJLabel.setVisible(false);
        pricePerShareWarningJLabel.setVisible(false);
        quantityWarningJLabel.setVisible(false);
        noteWarningJLabel.setVisible(false);
    }

}
