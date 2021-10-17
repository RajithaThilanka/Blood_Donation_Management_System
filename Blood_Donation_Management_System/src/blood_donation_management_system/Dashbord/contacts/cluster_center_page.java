

package blood_donation_management_system.Dashbord.contacts;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class cluster_center_page extends javax.swing.JInternalFrame{



public cluster_center_page () {

          initComponents ();
        
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui =(BasicInternalFrameUI) this.getUI ();
        bui.setNorthPane (null);
        setSize (1400, 750);
        Toolkit t = Toolkit.getDefaultToolkit();
        
        
               //Table heder design
       cluster_table.getTableHeader ().setFont (new Font("sergro",Font.BOLD,19));
       cluster_table.getTableHeader ().setOpaque (false);
       
       
 
       //    Admin_table.getTableHeader ().setBackground(new Color(32,,32));
       cluster_table.setRowHeight(40);

         District.setSelectedItem (null);
       
       
}





@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_content_gradient1 = new blood_donation_management_system.Dashbord.Dash_content_gradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        cluster_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Province = new javax.swing.JComboBox<>();
        District = new javax.swing.JComboBox<>();
        Center = new javax.swing.JComboBox<>();

        cluster_table.setForeground(new java.awt.Color(255, 255, 255));
        cluster_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cluster ", "Blood Bank", "TP No", "Email ", "Address"
            }
        ));
        cluster_table.setRowHeight(30);
        jScrollPane1.setViewportView(cluster_table);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Select Province  :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Select Cluster Center  :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Select District  :");

        jButton1.setBackground(new java.awt.Color(38, 43, 63));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(38, 43, 63));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");

        Province.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Province.setForeground(new java.awt.Color(255, 255, 255));
        Province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Western", "Sabaragamuwa", "Central", "North Western", "Nothern", "Eastern", "North Central", "Uva", "Southern", " ", " " }));
        Province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinceActionPerformed(evt);
            }
        });

        District.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        District.setForeground(new java.awt.Color(255, 255, 255));
        District.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistrictActionPerformed(evt);
            }
        });

        Center.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Center.setForeground(new java.awt.Color(255, 255, 255));
        Center.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dash_content_gradient1Layout = new javax.swing.GroupLayout(dash_content_gradient1);
        dash_content_gradient1.setLayout(dash_content_gradient1Layout);
        dash_content_gradient1Layout.setHorizontalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Province, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Center, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        dash_content_gradient1Layout.setVerticalGroup(
            dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_content_gradient1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Province, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Center, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(dash_content_gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dash_content_gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dash_content_gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistrictActionPerformed
       
        
             
        try {
            
            if(District.getSelectedItem ().equals ("Colombo")){
           
            Center.removeAllItems();    
            Center.setSelectedItem (null);
            Center.removeAllItems();    
            Center.setSelectedItem (null);
            Center.addItem ("NBC");
            Center.addItem ("NHSL");
            Center.addItem ("CSHW");
            Center.addItem ("CSTH");
            Center.addItem ("DMH");
            Center.addItem ("LRH");
            Center.addItem ("SIGH");
            Center.addItem ("Accidenr  Ser");
            Center.addItem ("IDH -Angoda");
            Center.addItem ("ECBH -Mulleriyawa");
            Center.addItem ("KDU");
            Center.addItem ("NFTH");
            
            
            }
            
            
          else if(District.getSelectedItem ().equals ("Gampaha")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Gampaha");
          Center.addItem ("Wathupitiwala");
          Center.addItem ("Meerigama");
          Center.addItem ("Minuwangoda");
          Center.addItem ("Negombo");
          Center.addItem ("Walisara");
          Center.addItem ("Kiribathgoda");
                
         } 
            
            
            
          else if(District.getSelectedItem ().equals ("Maharagama")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Avissawella");
          Center.addItem ("CIM Apesha");
          Center.addItem ("Homagama");
                
         } 
            
            
            
          
          else if(District.getSelectedItem ().equals ("Kaluthara")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Kaluthara");
          Center.addItem ("Horana");
          Center.addItem ("Panadura");
                
         } 
           
          
          
          else if(District.getSelectedItem ().equals ("Galla")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Karapitiya");
          Center.addItem ("Mahamodara");
          Center.addItem ("Balapitiya");
          Center.addItem ("Elapitiya");  
          Center.addItem ("Udugama");
                    
         } 
            
          
          else if(District.getSelectedItem ().equals ("Matara")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Matara");
          Center.addItem ("SRBC");
          Center.addItem ("Kamburugamuwa");
          Center.addItem ("Kamburupitiya");  
     
                    
         } 
          
          
          else if(District.getSelectedItem ().equals ("Hambantota")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Hambantota");
          Center.addItem ("Tangalla");
          Center.addItem ("Tissamaharamaya");
          Center.addItem ("Walasmulla");  
                  
         } 
            
            else if(District.getSelectedItem ().equals ("Badulla")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Badulla");
          Center.addItem ("Diyathalawa");
          Center.addItem ("Welimada");
   
                  
         } 
            else if(District.getSelectedItem ().equals ("Monaragala")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Monaragala");
          Center.addItem ("Bibile");
          Center.addItem ("Wellawaya");
                  
         } 
           
             else if(District.getSelectedItem ().equals ("Anuradhapura")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Anuradhapura");
          Center.addItem ("PadaviyaBibile");
          Center.addItem ("Thambuththegama");
          Center.addItem ("TMadawachchiya");        
         } 
           
            else if(District.getSelectedItem ().equals ("Polonnaruwa")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Polonnaruwa");
          Center.addItem ("Medirigiriya");
         
                  
         } 
             else if(District.getSelectedItem ().equals ("Batticaloa")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Batticaloa");
          Center.addItem ("Valachchenai");
          Center.addItem ("Kattankudy");
          Center.addItem ("Kalawanchikudi");
          
         
                  
         } 
              
             
             else if(District.getSelectedItem ().equals ("Trincomalee")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Thrincomalee");
          Center.addItem ("Kantale");
          Center.addItem ("Kinniya");
          Center.addItem ("Muthtur");
         
                  
         } 
             
            else if(District.getSelectedItem ().equals ("Ampara")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Ampara");
          Center.addItem ("Akkarepattuwa");
          Center.addItem ("Dehiattakandiya");
          Center.addItem ("Mahaoya");
          Center.addItem ("Samanthurai");
          Center.addItem ("POthuvil");
   
         } 
              
            else if(District.getSelectedItem ().equals ("Jaffna")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Jaffna");
          Center.addItem ("Kilinochchi");
          Center.addItem ("Point Pedro");
          Center.addItem ("Mulativu");
          Center.addItem ("Thelippalai");
   
         } 
             
            else if(District.getSelectedItem ().equals ("Vavuniya")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Chettikilam");
          Center.addItem ("Vavuniya");
          Center.addItem ("Manner");

   
         }             
            else if(District.getSelectedItem ().equals ("Kurunegala")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Kurunegala");
          Center.addItem ("Dambadeniya");
          Center.addItem ("Kuliyapitiya");
          Center.addItem ("Nikaweratiya");
          Center.addItem ("Galgamuwa");

   
         }             
            else if(District.getSelectedItem ().equals ("Chilaw")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Chillaw");
          Center.addItem ("Marawila");
          Center.addItem ("Puttalam");
          Center.addItem ("Warakapola");

   
         }             
                                    
          else if(District.getSelectedItem ().equals ("Kandy")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null); 
          Center.addItem ("Kandy");
          Center.addItem ("Peradeniya");
          Center.addItem ("Gampola");
          Center.addItem ("Theldeniya");
          Center.addItem ("Matale");
          Center.addItem ("Dambulla");
          Center.addItem ("Nawalapitiya");

   
         }             
                                    
          else if(District.getSelectedItem ().equals ("Nuwaraeliya")){
            
          Center.removeAllItems();    
          Center.setSelectedItem (null);     
          Center.addItem ("Nuwaraeliya");
          Center.addItem ("Dikoya");
          Center.addItem ("Rikillagaskada");
    
   
         }               
        } catch (Exception e) {
        }
        
        
        
        
        
    }//GEN-LAST:event_DistrictActionPerformed

    private void CenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenterActionPerformed
     
    
    }//GEN-LAST:event_CenterActionPerformed

    private void ProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinceActionPerformed
        try {
            if(Province.getSelectedItem ().equals ("Western")){
                
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Colombo");
            District.addItem ("Gampaha");
            District.addItem ("Maharagama");
            District.addItem ("Kaluthara");
            
            }
            
            else if(Province.getSelectedItem ().equals ("Sabaragamuwa")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Rathnapura");
            District.addItem ("Kegalle");
            }
            
             else if(Province.getSelectedItem ().equals ("Central")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Kandy");
            District.addItem ("Nuwaraeliya");
            }
                       
             else if(Province.getSelectedItem ().equals ("North Western")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Kurunegala");
            District.addItem ("Chilaw");
            }
             
            else if(Province.getSelectedItem ().equals ("Nothern")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("vavuniya");
            District.addItem ("Jaffna");
            }
            
            else if(Province.getSelectedItem ().equals ("Eastern")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Batticaloa");
            District.addItem ("Trincomalee");
            District.addItem ("Ampara");
            }
                                               
            else if(Province.getSelectedItem ().equals ("North Central")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Anuradhapura");
            District.addItem ("Polonnaruwa");

            }
            
             else if(Province.getSelectedItem ().equals ("Uva")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Badulla");
            District.addItem ("Monaragala");
            }
              else if(Province.getSelectedItem ().equals ("Southern")){
            District.removeAllItems();    
            District.setSelectedItem (null);
            District.addItem ("Galla");
            District.addItem ("Matara");
            District.addItem ("Hambantota");
            }                 
            
            
        } catch (Exception e) {
        }
        
       
    }//GEN-LAST:event_ProvinceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Center.removeAllItems();         
          District.removeAllItems(); 
        

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Center;
    private javax.swing.JComboBox<String> District;
    private javax.swing.JComboBox<String> Province;
    private javax.swing.JTable cluster_table;
    private blood_donation_management_system.Dashbord.Dash_content_gradient dash_content_gradient1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
