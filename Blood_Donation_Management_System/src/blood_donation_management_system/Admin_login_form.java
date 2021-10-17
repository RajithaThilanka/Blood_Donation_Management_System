package blood_donation_management_system;


import blood_donation_management_system.Dashbord.Main_dashbord;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Admin_login_form extends javax.swing.JFrame{


//Setting connection null
Connection conn=null;
PreparedStatement st=null;


public Admin_login_form () {
    initComponents ();
    
      //Layour size setting  
        
        Toolkit t = Toolkit.getDefaultToolkit();
        this.setSize(1536, 824);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - 1536/ 2;
            int dy = centerPoint.y - 824/ 2;    
            setLocation(dx, dy);
        
        
        


    //frame resizable desable
    setResizable(false);
}



//User Validation
public void validate_user(){
    
    String login_id=Admin_id.getText();
    String login_password=Admin_password.getText();
    
   
     conn=Database_connction.Connect(); 
     
   
    try {
        
      String url=" SELECT Admin_id,Password from admin where Admin_id='"+login_id+"' and Password='"+login_password+"' ";
      
      
      Statement st=(Statement) conn.createStatement(); 
      
        java.sql.ResultSet set = st.executeQuery(url);
      
      if(set.next()){
         
          Main_dashbord dashbord=new Main_dashbord();
          dashbord.setVisible(true);
          this.dispose ();
          
      }
      else{
      
           JOptionPane.showMessageDialog (this,"Invalid User ID or Password"); 
      }
      
      
    } catch (Exception e) {
    }
     
}




    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Admin_id = new javax.swing.JTextField();
        Admin_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Sign_in_button = new javax.swing.JButton();
        sign_up_button = new javax.swing.JButton();
        Close_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(508, 0));
        setMaximumSize(new java.awt.Dimension(1500, 700));
        setMinimumSize(new java.awt.Dimension(1500, 700));
        setPreferredSize(new java.awt.Dimension(1500, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 700));

        Close.setBackground(new java.awt.Color(20, 36, 62));

        jLabel1.setBackground(new java.awt.Color(20, 36, 62));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Login");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Admin_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        Admin_password.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Admin_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_passwordActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password :");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Admin  ID :");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Forgot your password ?");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Sign_in_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Sign_in_button.setForeground(new java.awt.Color(20, 36, 62));
        Sign_in_button.setText("Sign In");
        Sign_in_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_in_buttonActionPerformed(evt);
            }
        });

        sign_up_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        sign_up_button.setForeground(new java.awt.Color(20, 36, 62));
        sign_up_button.setText("Sign Up");
        sign_up_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_buttonActionPerformed(evt);
            }
        });

        Close_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Close_button.setForeground(new java.awt.Color(20, 36, 62));
        Close_button.setText("Close");
        Close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CloseLayout = new javax.swing.GroupLayout(Close);
        Close.setLayout(CloseLayout);
        CloseLayout.setHorizontalGroup(
            CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseLayout.createSequentialGroup()
                .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CloseLayout.createSequentialGroup()
                            .addGap(454, 454, 454)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CloseLayout.createSequentialGroup()
                            .addGap(617, 617, 617)
                            .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CloseLayout.createSequentialGroup()
                            .addGap(430, 430, 430)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Admin_id, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CloseLayout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(Sign_in_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sign_up_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(566, Short.MAX_VALUE))
        );
        CloseLayout.setVerticalGroup(
            CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sign_in_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sign_up_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_buttonActionPerformed

      int close_val=JOptionPane.showConfirmDialog (null,"Do you really want to close this programme ?" );
      if(close_val==0){
      this.dispose();
      }
        
      
    }//GEN-LAST:event_Close_buttonActionPerformed

    private void sign_up_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_buttonActionPerformed
        Admin_registation_form reg1= new Admin_registation_form();
        reg1.setVisible (true);
        this.dispose ();

    }//GEN-LAST:event_sign_up_buttonActionPerformed

    private void Sign_in_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_in_buttonActionPerformed
        validate_user();
    }//GEN-LAST:event_Sign_in_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void Admin_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_passwordActionPerformed

    }//GEN-LAST:event_Admin_passwordActionPerformed

    
    
public static
        void main ( String args[] ) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels ()) {
            if ("Nimbus".equals (info.getName ())) {
                javax.swing.UIManager.setLookAndFeel (info.getClassName ());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger (Admin_login_form.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger (Admin_login_form.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger (Admin_login_form.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger (Admin_login_form.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater (new Runnable (){
    public
            void run () {
                
        //Admin_login_form admin1=new Admin_login_form ();
               // admin1.setVisible (true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admin_id;
    private javax.swing.JPasswordField Admin_password;
    private javax.swing.JPanel Close;
    private javax.swing.JButton Close_button;
    private javax.swing.JButton Sign_in_button;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sign_up_button;
    // End of variables declaration//GEN-END:variables
}
