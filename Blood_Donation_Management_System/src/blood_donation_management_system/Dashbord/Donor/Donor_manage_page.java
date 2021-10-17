
package blood_donation_management_system.Dashbord.Donor;

import java.awt.Toolkit;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Donor_manage_page extends javax.swing.JInternalFrame{


public Donor_manage_page () {
        initComponents ();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui =(BasicInternalFrameUI) this.getUI ();
        bui.setNorthPane (null);
        
        Registation_pane.removeAll();
        Doner_registation_form doner_reg=new   Doner_registation_form();
        registation_pane.add(doner_reg).setVisible (true);
        setSize (1400, 750);
        Toolkit t = Toolkit.getDefaultToolkit();
}



@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_content_gradient1 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        jButton1 = new javax.swing.JButton();
        registation_var = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Registation_pane = new javax.swing.JDesktopPane();
        registation_pane = new javax.swing.JDesktopPane();
        dash_content_gradient2 = new blood_donation_management_system.Dashbord.Dash_content_gradient();

        setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(38, 43, 63));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registation_var.setBackground(new java.awt.Color(38, 43, 63));
        registation_var.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registation_var.setForeground(new java.awt.Color(255, 255, 255));
        registation_var.setText("Registation ");
        registation_var.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registation_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registation_varActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(38, 43, 63));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");

        jButton4.setBackground(new java.awt.Color(38, 43, 63));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Make report");

        javax.swing.GroupLayout Registation_paneLayout = new javax.swing.GroupLayout(Registation_pane);
        Registation_pane.setLayout(Registation_paneLayout);
        Registation_paneLayout.setHorizontalGroup(
            Registation_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Registation_paneLayout.setVerticalGroup(
            Registation_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dash_content_gradient2Layout = new javax.swing.GroupLayout(dash_content_gradient2);
        dash_content_gradient2.setLayout(dash_content_gradient2Layout);
        dash_content_gradient2Layout.setHorizontalGroup(
            dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1537, Short.MAX_VALUE)
        );
        dash_content_gradient2Layout.setVerticalGroup(
            dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        registation_pane.setLayer(dash_content_gradient2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout registation_paneLayout = new javax.swing.GroupLayout(registation_pane);
        registation_pane.setLayout(registation_paneLayout);
        registation_paneLayout.setHorizontalGroup(
            registation_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registation_paneLayout.createSequentialGroup()
                .addComponent(dash_content_gradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        registation_paneLayout.setVerticalGroup(
            registation_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dash_content_gradient1Layout = new javax.swing.GroupLayout(dash_content_gradient1);
        dash_content_gradient1.setLayout(dash_content_gradient1Layout);
        dash_content_gradient1Layout.setHorizontalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(registation_var, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addComponent(registation_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registation_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dash_content_gradient1Layout.setVerticalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registation_var, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registation_pane)
                    .addComponent(registation_pane)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registation_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registation_varActionPerformed
        Registation_pane.removeAll();
        Doner_registation_form doner_reg=new   Doner_registation_form();
        registation_pane.add(doner_reg).setVisible (true);

    }//GEN-LAST:event_registation_varActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registation_pane.removeAll();
       Doner_view doner_view1=new Doner_view();
        registation_pane.add(doner_view1).setVisible (true);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Registation_pane;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient1;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane registation_pane;
    private javax.swing.JButton registation_var;
    // End of variables declaration//GEN-END:variables
}
