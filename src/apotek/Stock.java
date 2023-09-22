/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apotek;

import static apotek.Apotek.con;
import static apotek.Apotek.res;
import static apotek.Apotek.stm;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yodha
 */
public final class Stock extends javax.swing.JFrame implements SQL{
    private Apotek apt;

    /**
     * Creates new form Stock
     */
 
    public Stock() {
        connectsql();
        initComponents();
        tableDisplay();
    }
    
     @Override
    public void connectsql() {
        apt = new Apotek();
    }

    @Override
    public void tableDisplay() {
        try {
            //kolom
            DefaultTableModel tb = new DefaultTableModel();
            tb.addColumn("ID");
            tb.addColumn("Nama");
            tb.addColumn("Harga");
            tb.addColumn("Stock");
            jTable_stock.setModel(tb);
     
            //get data
            res = stm.executeQuery("select * from stockobat");
            while (res.next()) {
                tb.addRow(new Object[]{
                res.getString("ID"),
                res.getString("Nama"),
                res.getString("Harga"),
                res.getString("Stock"),
            });   
            }
            //total stock
            
            int total = 0;
            res = stm.executeQuery("select stock from stockobat");
            while (res.next()){
                total += res.getInt("stock");
            }
            
            jTextField_Stock.setText(Integer.toString(total));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data Error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_BACK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        jButton_restock = new javax.swing.JButton();
        text_Jumlah = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_stock = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_harga = new javax.swing.JTextField();
        btn_Harga = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        text_Nama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        text_stock = new javax.swing.JTextField();
        btn_nama = new javax.swing.JButton();
        btn_stock = new javax.swing.JButton();
        jButton_tambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.lightGray);

        jPanel3.setBackground(java.awt.Color.gray);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obat.png"))); // NOI18N

        jButton_BACK.setBackground(java.awt.Color.red);
        jButton_BACK.setForeground(new java.awt.Color(255, 255, 255));
        jButton_BACK.setText("BACK");
        jButton_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_BACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_BACK)
                .addGap(31, 31, 31))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Obat");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Restock");

        text_ID.setBackground(new java.awt.Color(255, 255, 255));
        text_ID.setForeground(new java.awt.Color(0, 0, 0));
        text_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_IDActionPerformed(evt);
            }
        });

        jButton_restock.setBackground(new java.awt.Color(255, 255, 255));
        jButton_restock.setForeground(new java.awt.Color(0, 0, 0));
        jButton_restock.setText("Restock");
        jButton_restock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_restockActionPerformed(evt);
            }
        });

        text_Jumlah.setBackground(new java.awt.Color(255, 255, 255));
        text_Jumlah.setForeground(new java.awt.Color(0, 0, 0));

        jTable_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_stock.setEnabled(false);
        jScrollPane2.setViewportView(jTable_stock);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Data Stock Obat");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jumlah Stock");

        jTextField_Stock.setEditable(false);
        jTextField_Stock.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Stock.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Harga");

        text_harga.setBackground(new java.awt.Color(255, 255, 255));
        text_harga.setForeground(new java.awt.Color(0, 0, 0));
        text_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_hargaActionPerformed(evt);
            }
        });

        btn_Harga.setBackground(new java.awt.Color(255, 255, 255));
        btn_Harga.setForeground(new java.awt.Color(0, 0, 0));
        btn_Harga.setText("Update");
        btn_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HargaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama");

        text_Nama.setBackground(new java.awt.Color(255, 255, 255));
        text_Nama.setForeground(new java.awt.Color(0, 0, 0));
        text_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_NamaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Stock");

        text_stock.setBackground(new java.awt.Color(255, 255, 255));
        text_stock.setForeground(new java.awt.Color(0, 0, 0));
        text_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_stockActionPerformed(evt);
            }
        });

        btn_nama.setBackground(new java.awt.Color(255, 255, 255));
        btn_nama.setForeground(new java.awt.Color(0, 0, 0));
        btn_nama.setText("Update");
        btn_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_namaActionPerformed(evt);
            }
        });

        btn_stock.setBackground(new java.awt.Color(255, 255, 255));
        btn_stock.setForeground(new java.awt.Color(0, 0, 0));
        btn_stock.setText("Update");
        btn_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stockActionPerformed(evt);
            }
        });

        jButton_tambah.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tambah.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tambah.setText("Tambah");
        jButton_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(287, 287, 287)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(text_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btn_stock)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(text_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(128, 128, 128)
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                        .addComponent(jTextField_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(btn_Harga)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton_restock)
                                                        .addGap(33, 33, 33))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(btn_nama)
                                                        .addGap(45, 45, 45)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(text_Jumlah)))))))
                                .addGap(41, 41, 41))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButton_tambah)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(text_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_restock)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_stock)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nama))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Harga)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_tambah)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_restockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_restockActionPerformed
        if(text_ID.getText().equals("")||text_Jumlah.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Insert ID and Restock Data");
        }else{
            //restock
            String ID = text_ID.getText();
            String jumlah = text_Jumlah.getText();
            int stock = apt.getstock(ID);
            int total = stock + Integer.parseInt(jumlah);
            apt.setStock(ID, Integer.toString(total));
            
            tableDisplay();
            JOptionPane.showMessageDialog(this, "Data Updated");
            
            text_ID.setText("");
            text_Jumlah.setText("");
        }
    }//GEN-LAST:event_jButton_restockActionPerformed

    private void text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_IDActionPerformed

    private void jButton_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACKActionPerformed
        Main m = new Main();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_BACKActionPerformed

    private void jTextField_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StockActionPerformed
        
    }//GEN-LAST:event_jTextField_StockActionPerformed

    private void btn_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HargaActionPerformed
        // TODO add your handling code here:
        if(text_ID.getText().equals("")||text_harga.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Insert ID and Harga Data");
        }else{
        String ID = text_ID.getText();
        String Harga = text_harga.getText();
        apt.setHarga(ID, Harga);
        JOptionPane.showMessageDialog(this, "Data Updated");
        tableDisplay();
        text_ID.setText("");
        text_harga.setText("");
        tableDisplay();
        }
    }//GEN-LAST:event_btn_HargaActionPerformed

    private void text_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_hargaActionPerformed

    private void text_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_NamaActionPerformed

    private void text_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_stockActionPerformed

    private void btn_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_namaActionPerformed
        // TODO add your handling code here:
        if(text_ID.getText().equals("")||text_Nama.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Insert ID and Nama");
        }else{
        String ID = text_ID.getText();
        String Nama = text_Nama.getText();
        apt.setNama(ID, Nama);
        JOptionPane.showMessageDialog(this, "Data Updated");
        tableDisplay();
        text_ID.setText("");
        text_Nama.setText("");
        tableDisplay();
        }
    }//GEN-LAST:event_btn_namaActionPerformed

    private void btn_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stockActionPerformed
        // TODO add your handling code here:
        if(text_ID.getText().equals("")||text_stock.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Insert ID and Nama");
        }else{
        String ID = text_ID.getText();
        String stock = text_stock.getText();
        apt.setStock(ID, stock);
        JOptionPane.showMessageDialog(this, "Data Updated");
        tableDisplay();
        text_ID.setText("");
        text_stock.setText("");
        tableDisplay();
        }
    }//GEN-LAST:event_btn_stockActionPerformed

    private void jButton_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tambahActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            if(text_Nama.getText().equals("")||
                text_harga.getText().equals("")||
                text_stock.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please Insert All Data");
            }else{

                //get data
                String nama = text_Nama.getText();
                int harga = Integer.parseInt(text_harga.getText());
                int stock = Integer.parseInt(text_stock.getText());

                //insert data to sql
                PreparedStatement ps = con.prepareStatement("insert into stockobat(ID,Nama,Harga,Stock)values(?,?,?,?)");
                ps.setInt(1,0);
                ps.setString(2, nama);
                ps.setInt(3, harga);
                ps.setInt(4, stock);
                ps.executeUpdate();

                tableDisplay();
                JOptionPane.showMessageDialog(this, "Data Added");

                //reset
                text_Nama.setText("");
                text_ID.setText("");
                text_harga.setText("");
                text_stock.setText("");

            }
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_tambahActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Harga;
    private javax.swing.JButton btn_nama;
    private javax.swing.JButton btn_stock;
    private javax.swing.JButton jButton_BACK;
    private javax.swing.JButton jButton_restock;
    private javax.swing.JButton jButton_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_stock;
    private javax.swing.JTextField jTextField_Stock;
    private javax.swing.JTextField text_ID;
    private javax.swing.JTextField text_Jumlah;
    private javax.swing.JTextField text_Nama;
    private javax.swing.JTextField text_harga;
    private javax.swing.JTextField text_stock;
    // End of variables declaration//GEN-END:variables

   
}
