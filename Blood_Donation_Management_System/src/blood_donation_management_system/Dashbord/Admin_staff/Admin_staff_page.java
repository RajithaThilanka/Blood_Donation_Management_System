package blood_donation_management_system.Dashbord.Admin_staff;


import blood_donation_management_system.Database_connction;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;


public class Admin_staff_page extends javax.swing.JInternalFrame{

   Connection conn=null;
   PreparedStatement pst =null;

   

public  Admin_staff_page () {
        initComponents ();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui =(BasicInternalFrameUI) this.getUI ();
        bui.setNorthPane (null);
        setSize (1270, 680);
       
       //Connect to DB
       conn=Database_connction.Connect();
       
       //Table load
       TableLoad();
       
       //Table heder design
       Admin_table.getTableHeader ().setFont (new Font("sergro",Font.BOLD,19));
       Admin_table.getTableHeader ().setOpaque (false);
       
   //    Admin_table.getTableHeader ().setBackground(new Color(32,,32));
       Admin_table.setRowHeight(40);
}



public void TableLoad(){

    
    try {
            
       String sql=" SELECT admin_id,Admin_name,Admin_epf,Hospitle,Email,Contact_no,Address from admin ";
       PreparedStatement pst =conn.prepareStatement(sql);
       java.sql.ResultSet set = pst.executeQuery(sql);
       Admin_table.setModel (DbUtils.resultSetToTableModel (set));
       
    } catch (Exception e) {
        
    }
  
}


public void Search_data(){
    
    
     try {
         
       String var_id=Enter_id.getText ();
         
       String sql=" SELECT admin_id,Admin_name,Admin_epf,Hospitle,Email,Contact_no,Address from admin WHERE admin_id='"+ var_id +"' ";
       PreparedStatement pst =conn.prepareStatement(sql);
       java.sql.ResultSet set = pst.executeQuery(sql);
       Admin_table.setModel (DbUtils.resultSetToTableModel (set));
      
        JOptionPane.showMessageDialog (null,"Serch OK");
        
    } catch (Exception e) {
         JOptionPane.showMessageDialog (null,"Serch ERROR");
    }

}


public void Delete_record(){
    
    
     try {
         
       String Delete_para=Enter_id.getText ();
         
       String sql=" DELETE from admin where admin_id='"+ Delete_para +"' ";
       
       PreparedStatement pst =conn.prepareStatement(sql);
       pst.execute(sql);
       TableLoad();
     
     
        JOptionPane.showMessageDialog (null,"Delete OK");
        
    } catch (Exception e) {
         JOptionPane.showMessageDialog (null,"Delete ERROR");
    }

}


  
    public void Update_record() {
        
        PreparedStatement pst =null;

        
        String update_select_var=Select_update_para.getSelectedItem().toString();
        String update_val=Enter_update_para.getText ();
        String Enter_para=Enter_id.getText ();
        String sql = null ;
        
        
        try {
            
                   
        if(update_select_var.equals ("Admin_ID")){
            
          sql=" Update admin set admin_id='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
        
        else if(update_select_var.equals ("Admin_Name")){
          sql=" Update admin set Admin_name='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
        else if(update_select_var.equals ("Admin_EPF")){
         sql=" Update admin set Admin_epf='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
            
        else if(update_select_var.equals ("Hospitle")){
         sql=" Update admin set Hospitle='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
        
        else if(update_select_var.equals ("Hospitle_Email")){
          sql=" Update admin set Email='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
        
        else if(update_select_var.equals ("Contact_No")){
          sql=" Update admin set Contact_no='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
        
        else if(update_select_var.equals ("Address")){
          sql=" Update admin set Address='"+ update_val +"'  where  admin_id='"+ Enter_para +"' ";
       
        }
            pst =conn.prepareStatement(sql);
            pst.execute(sql);
 
            TableLoad();   
       
      
        JOptionPane.showMessageDialog (null,"Update OK");
            
        } catch (Exception e) {
            
        JOptionPane.showMessageDialog (null,"Update ERROR");
        }
        
     
       
     
    } 


    public void set_clear(){
        
        Enter_id.setText ("");
        Enter_update_para.setText ("");
    
    }

@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_content_gradient1 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        Admin_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Enter_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Enter_update_para = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Select_update_para = new javax.swing.JComboBox<>();

        Admin_table.setAutoCreateRowSorter(true);
        Admin_table.setBackground(new java.awt.Color(32, 60, 61));
        Admin_table.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Admin_table.setForeground(new java.awt.Color(255, 255, 255));
        Admin_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Admin_ID", "Admin_Name", "Admin_EPF", "Hospitle", "Hospitle_Email", "Contact_No", "Address"
            }
        ));
        Admin_table.setColumnSelectionAllowed(true);
        Admin_table.setFocusable(false);
        Admin_table.setGridColor(new java.awt.Color(255, 255, 255));
        Admin_table.setRowHeight(50);
        Admin_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Admin_table.setShowGrid(true);
        Admin_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Admin_table);
        Admin_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton1.setBackground(new java.awt.Color(38, 43, 63));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(38, 43, 63));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Enter Admin ID :");

        Enter_id.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Enter_id.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Update Paramerter : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Select Update Paramerter : ");

        Enter_update_para.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Enter_update_para.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(38, 43, 63));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Select_update_para.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Select_update_para.setForeground(new java.awt.Color(255, 255, 255));
        Select_update_para.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin_ID", "Admin_Name", "Admin_EPF", "Hospitle", "Hospitle_Email", "Contact_No", "Address" }));
        Select_update_para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_update_paraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dash_content_gradient1Layout = new javax.swing.GroupLayout(dash_content_gradient1);
        dash_content_gradient1.setLayout(dash_content_gradient1Layout);
        dash_content_gradient1Layout.setHorizontalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dash_content_gradient1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Select_update_para, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dash_content_gradient1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Enter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dash_content_gradient1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Enter_update_para, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        dash_content_gradient1Layout.setVerticalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Select_update_para, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter_update_para, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_content_gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_content_gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int update_val=JOptionPane.showConfirmDialog (null,"Do you really want to update this ?" );
      if(update_val==0){
          Update_record();
           set_clear();
      }
      
      
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int delete_val=JOptionPane.showConfirmDialog (null,"Do you really want to delete this raw ?" );
      if(delete_val==0){
       Delete_record();  
       set_clear();
     
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Search_data();
        set_clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Select_update_paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_update_paraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_update_paraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Admin_table;
    private javax.swing.JTextField Enter_id;
    private javax.swing.JTextField Enter_update_para;
    private javax.swing.JComboBox<String> Select_update_para;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
