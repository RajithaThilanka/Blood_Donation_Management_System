
package blood_donation_management_system.Dashbord.contacts;

import blood_donation_management_system.Dashbord.Donor.Doner_registation_form;
import java.awt.Toolkit;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Contact_page extends javax.swing.JInternalFrame{


public Contact_page () {
    initComponents ();
    
      this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui =(BasicInternalFrameUI) this.getUI ();
        bui.setNorthPane (null);
        setSize (1400, 750);
        Toolkit t = Toolkit.getDefaultToolkit();
        
        contact_pane.removeAll();
        email_page emailp1=new email_page();
        contact_pane.add(emailp1).setVisible (true);
}


@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_content_gradient1 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        jButton2 = new javax.swing.JButton();
        contact_pane = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(38, 43, 63));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Send Email");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contact_paneLayout = new javax.swing.GroupLayout(contact_pane);
        contact_pane.setLayout(contact_paneLayout);
        contact_paneLayout.setHorizontalGroup(
            contact_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contact_paneLayout.setVerticalGroup(
            contact_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(38, 43, 63));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Donor Contacts");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(38, 43, 63));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cluster Centers");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dash_content_gradient1Layout = new javax.swing.GroupLayout(dash_content_gradient1);
        dash_content_gradient1.setLayout(dash_content_gradient1Layout);
        dash_content_gradient1Layout.setHorizontalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contact_pane)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton3)
                .addGap(28, 28, 28)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton5)
                .addContainerGap(696, Short.MAX_VALUE))
        );
        dash_content_gradient1Layout.setVerticalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contact_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_content_gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dash_content_gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        contact_pane.removeAll();
        email_page emailp1=new email_page();
        contact_pane.add(emailp1).setVisible (true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        contact_pane.removeAll();
       cluster_center_page cluster_page=new cluster_center_page();
        contact_pane.add(cluster_page).setVisible (true);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane contact_pane;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
