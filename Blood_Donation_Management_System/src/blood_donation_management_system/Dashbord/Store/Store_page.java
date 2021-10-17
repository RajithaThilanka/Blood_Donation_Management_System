
package blood_donation_management_system.Dashbord.Store;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Store_page extends javax.swing.JInternalFrame{



public Store_page () {
    initComponents ();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui =(BasicInternalFrameUI) this.getUI ();
        bui.setNorthPane (null);
        setSize (1270, 680);
        
        
        store_pane.removeAll();
        StoreGraph st1=new StoreGraph();
        store_pane.add(st1).setVisible(true); 
}


@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_content_gradient1 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        dash_content_gradient2 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        obtaining_packet_var = new javax.swing.JButton();
        Packet_Register_var = new javax.swing.JButton();
        View_data_var = new javax.swing.JButton();
        Graphs_var = new javax.swing.JButton();
        Registation_pane = new javax.swing.JDesktopPane();
        store_pane = new javax.swing.JDesktopPane();

        obtaining_packet_var.setBackground(new java.awt.Color(38, 43, 63));
        obtaining_packet_var.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        obtaining_packet_var.setForeground(new java.awt.Color(255, 255, 255));
        obtaining_packet_var.setText("Obtaining Packet");
        obtaining_packet_var.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obtaining_packet_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtaining_packet_varActionPerformed(evt);
            }
        });

        Packet_Register_var.setBackground(new java.awt.Color(38, 43, 63));
        Packet_Register_var.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Packet_Register_var.setForeground(new java.awt.Color(255, 255, 255));
        Packet_Register_var.setText("Packet Register");
        Packet_Register_var.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Packet_Register_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Packet_Register_varActionPerformed(evt);
            }
        });

        View_data_var.setBackground(new java.awt.Color(38, 43, 63));
        View_data_var.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        View_data_var.setForeground(new java.awt.Color(255, 255, 255));
        View_data_var.setText("View Data");
        View_data_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_data_varActionPerformed(evt);
            }
        });

        Graphs_var.setBackground(new java.awt.Color(38, 43, 63));
        Graphs_var.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Graphs_var.setForeground(new java.awt.Color(255, 255, 255));
        Graphs_var.setText("Graphs");
        Graphs_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Graphs_varActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Registation_paneLayout = new javax.swing.GroupLayout(Registation_pane);
        Registation_pane.setLayout(Registation_paneLayout);
        Registation_paneLayout.setHorizontalGroup(
            Registation_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Registation_paneLayout.setVerticalGroup(
            Registation_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout store_paneLayout = new javax.swing.GroupLayout(store_pane);
        store_pane.setLayout(store_paneLayout);
        store_paneLayout.setHorizontalGroup(
            store_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1887, Short.MAX_VALUE)
        );
        store_paneLayout.setVerticalGroup(
            store_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dash_content_gradient2Layout = new javax.swing.GroupLayout(dash_content_gradient2);
        dash_content_gradient2.setLayout(dash_content_gradient2Layout);
        dash_content_gradient2Layout.setHorizontalGroup(
            dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient2Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(Packet_Register_var, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(obtaining_packet_var)
                .addGap(18, 18, 18)
                .addComponent(View_data_var, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Graphs_var, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dash_content_gradient2Layout.createSequentialGroup()
                .addComponent(store_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registation_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dash_content_gradient2Layout.setVerticalGroup(
            dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Packet_Register_var, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obtaining_packet_var, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(View_data_var, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Graphs_var, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registation_pane)
                    .addComponent(store_pane)))
        );

        javax.swing.GroupLayout dash_content_gradient1Layout = new javax.swing.GroupLayout(dash_content_gradient1);
        dash_content_gradient1.setLayout(dash_content_gradient1Layout);
        dash_content_gradient1Layout.setHorizontalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dash_content_gradient1Layout.setVerticalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_content_gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obtaining_packet_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtaining_packet_varActionPerformed
             store_pane.removeAll();
             obtainPack ob1=new obtainPack();
             store_pane.add(ob1).setVisible(true);
    }//GEN-LAST:event_obtaining_packet_varActionPerformed

    private void Packet_Register_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Packet_Register_varActionPerformed
        Registation_pane.removeAll();
        
            store_pane.removeAll();
            packReg s1= new packReg();
            store_pane.add(s1).setVisible(true);
  
    }//GEN-LAST:event_Packet_Register_varActionPerformed

    private void Graphs_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Graphs_varActionPerformed
       store_pane.removeAll();
        StoreGraph st1=new StoreGraph();
        store_pane.add(st1).setVisible(true); 
    }//GEN-LAST:event_Graphs_varActionPerformed

    private void View_data_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_data_varActionPerformed
           store_pane.removeAll();
           StoreDataRet sdr=new StoreDataRet();
           store_pane.add(sdr).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_View_data_varActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Graphs_var;
    private javax.swing.JButton Packet_Register_var;
    private javax.swing.JDesktopPane Registation_pane;
    private javax.swing.JButton View_data_var;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient1;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient2;
    private javax.swing.JButton obtaining_packet_var;
    private javax.swing.JDesktopPane store_pane;
    // End of variables declaration//GEN-END:variables
}
