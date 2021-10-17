
package blood_donation_management_system.Dashbord;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;


public class Dash_content_gradient extends javax.swing.JPanel{

public Dash_content_gradient () {
            initComponents ();
          setOpaque(false);
          
          
                  
        setSize (1400, 750);
        Toolkit t = Toolkit.getDefaultToolkit();
}



   //Dashbord Gradient
@SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
        protected void paintChildren(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING ,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g=new GradientPaint(0,0,Color.decode("#414345"),0,getHeight(),Color.decode("#232526"));

        g2.setPaint (g);
        //    g2.fillRoundRect(0,0,getWidth(),getHeight(),25,25);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),0,0);
        g2.fillRect (getWidth()-20,0,getWidth(),getHeight());
        super.paintChildren (grphcs); //To change body of generate method

}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
