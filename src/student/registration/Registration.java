/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Registration extends javax.swing.JPanel {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        combodistrict = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdepartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        buttonsubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaaddress = new javax.swing.JTextArea();

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel4.setText("Phone number");

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        combodistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combodistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodistrictActionPerformed(evt);
            }
        });

        jLabel5.setText("District");

        jLabel6.setText("Department");

        jLabel7.setText("NIC");

        buttonsubmit.setText("Submit");
        buttonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsubmitActionPerformed(evt);
            }
        });

        txaaddress.setColumns(20);
        txaaddress.setRows(5);
        jScrollPane1.setViewportView(txaaddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonsubmit)
                    .addComponent(txtname)
                    .addComponent(txtphone)
                    .addComponent(combodistrict, 0, 339, Short.MAX_VALUE)
                    .addComponent(txtdepartment)
                    .addComponent(txtnic)
                    .addComponent(jScrollPane1))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combodistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonsubmit)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void buttonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsubmitActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String address = txaaddress.getText();
        Date day = new Date();
        String regDate = getDate(day);
        String phone = txtphone.getText();
        Object obj = combodistrict.getSelectedItem();
        String department = txtdepartment.getText();
        String nic = txtnic.getText();
        int age = getAge(nic);
        String faculty = new String(department);
        
        
    }//GEN-LAST:event_buttonsubmitActionPerformed

    private void combodistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodistrictActionPerformed
        // TODO add your handling code here:
        combodistrict.addItem(new String[]{"1","Galle"});
        combodistrict.addItem(new String[]{"2","Matara"});
        combodistrict.addItem(new String[]{"3","Colombo"});
        combodistrict.addItem(new String[]{"4","Kandy"});
        combodistrict.addItem(new String[]{"5","Jafna"});
    }//GEN-LAST:event_combodistrictActionPerformed
    
    public static int getAge(String nic){
        String yearText = nic.substring(0,2);
        int year = Integer.parseInt(yearText);
        Date today = new Date();
        int thisYear =today.getYear();
        int age = thisYear - year;
        return age;
    }
    
    public static String getGender(String nic){
        
        String genderText = nic.substring(2, 5);
        int gender = Integer.parseInt(genderText);
        String S;
        if(gender<500){
            S="Male";
        }else{
            S="Female";    
        }
        return S;
    }
    public static String getFaculty(String department){
        String F = "";
        if(department.equals("CIS") || department.equals("PST") || department.equals("FST") || department.equals("NR") || department.equals("SM")){
            F = "Applied";
            }
        return F;
    }
    public static String getDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        return sdf.format(date);
    }
    public static boolean Save(){
        try {
            boolean saved = false;
            String url = "jdbc:mysql://localhost:3306/dbgym";
            String un = "root";
            String pw = "18372652232";
            String driverName = "com.mysql.jdbc.Driver";
            
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(url, un, pw);
            String sql = "INSERT INTO registration page(name,nic,gender,address,Date,district,phone_number,faculty,department)" VALUES(?,?,?,?,?,?,?,?,?,?);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, nic);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonsubmit;
    private javax.swing.JComboBox combodistrict;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaaddress;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
