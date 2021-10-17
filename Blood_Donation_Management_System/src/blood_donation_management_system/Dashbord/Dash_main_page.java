
package blood_donation_management_system.Dashbord;

import java.awt.Toolkit;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Dash_main_page extends javax.swing.JInternalFrame{


public Dash_main_page () {
    initComponents ();
       
     //Internal frame border remove and set design
    
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui =(BasicInternalFrameUI) this.getUI ();
        bui.setNorthPane (null);
        setSize (1400, 750);
        Toolkit t = Toolkit.getDefaultToolkit();
    
}


@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_content_gradient2 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dash main page");

        javax.swing.GroupLayout dash_content_gradient2Layout = new javax.swing.GroupLayout(dash_content_gradient2);
        dash_content_gradient2.setLayout(dash_content_gradient2Layout);
        dash_content_gradient2Layout.setHorizontalGroup(
            dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash_content_gradient2Layout.createSequentialGroup()
                .addContainerGap(1353, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
        );
        dash_content_gradient2Layout.setVerticalGroup(
            dash_content_gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_content_gradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_content_gradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
