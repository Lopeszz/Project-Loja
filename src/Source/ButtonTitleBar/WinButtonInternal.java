/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source.ButtonTitleBar;

import View.Init.Principal;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Lopes
 */
public class WinButtonInternal extends javax.swing.JPanel {

    public WinButtonInternal() {
        initComponents();
        setOpaque(false);
    }

    public void initEvent(JInternalFrame fram) {
        btX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fram.setClosed(true);
                } catch (PropertyVetoException x) {
                    System.out.println("não tá fechando");
                }
            }
        });
        BtMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    fram.setMinimumSize(new Dimension(100, 100));
                } catch (Exception e) {
                }

            }
        });

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtMenos = new Source.ButtonTitleBar.Button();
        btX = new Source.ButtonTitleBar.Button();

        BtMenos.setBackground(new java.awt.Color(102, 255, 102));

        btX.setBackground(new java.awt.Color(255, 51, 51));
        btX.setMaximumSize(new java.awt.Dimension(1, 13));
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btX, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(btX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Source.ButtonTitleBar.Button BtMenos;
    private Source.ButtonTitleBar.Button btX;
    // End of variables declaration//GEN-END:variables

}
