
package blood_donation_management_system.Dashbord;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Pannel_border extends javax.swing.JPanel{


public Pannel_border () {
        initComponents ();
        setOpaque (false);
}


        
@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


     protected void paintComponent ( Graphics grphcs ) {
        
       Graphics2D g2=(Graphics2D)grphcs;
       g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING ,RenderingHints.VALUE_ANTIALIAS_ON);
       g2.setColor (getBackground());
       g2.fillRoundRect (0, 0,getWidth(),getHeight(), 25, 25);
      super.paintComponent (grphcs);
    
        GradientPaint g=new GradientPaint(0,0,Color.decode("#D7E1EC"),0,getHeight(),Color.decode("#FFFFFF"));

    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
