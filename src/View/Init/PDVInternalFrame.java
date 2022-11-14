/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Init;

import java.beans.PropertyVetoException;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author Lopes
 */
public class PDVInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public PDVInternalFrame(javax.swing.JDesktopPane JDesktopPane) {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        JDesktopPane.add(this);
        this.Maximizar();
        this.setVisible(true);
        initWinButtonInternal();
        initTable();
    }
    private void initTable(){
        table1.fixTable(jScrollPane1);
    }
    
    private void initWinButtonInternal() {
        winButtonInternal.initEvent(PDVInternalFrame.this);
    }

    public void Maximizar() {
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            System.out.println("Problema no maximizar");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        winButtonInternal = new Source.ButtonTitleBar.WinButtonInternal();
        CabecalhodeClienteImg = new javax.swing.JLabel();
        WinPainel = new javax.swing.JPanel();
        BackGround = new javax.swing.JPanel();
        panelRoundTitle = new Source.Classes.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panelRoundConteudo = new Source.Classes.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Source.Classes.Table.Table();

        jLabel1.setText("jLabel1");

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1280, 750));
        setMinimumSize(new java.awt.Dimension(1280, 750));
        setPreferredSize(new java.awt.Dimension(1280, 750));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(winButtonInternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, -1, -1));

        CabecalhodeClienteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Img/Produto/cabecalho/CabecalhodeProduto.png"))); // NOI18N
        CabecalhodeClienteImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(CabecalhodeClienteImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 120));

        WinPainel.setBackground(new java.awt.Color(236, 236, 236));

        javax.swing.GroupLayout WinPainelLayout = new javax.swing.GroupLayout(WinPainel);
        WinPainel.setLayout(WinPainelLayout);
        WinPainelLayout.setHorizontalGroup(
            WinPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        WinPainelLayout.setVerticalGroup(
            WinPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(WinPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 240, 120));

        BackGround.setBackground(new java.awt.Color(228, 223, 223));

        panelRoundTitle.setBackground(new java.awt.Color(0, 63, 107));
        panelRoundTitle.setRoundTopLeft(25);
        panelRoundTitle.setRoundTopRight(25);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Produtos ");

        javax.swing.GroupLayout panelRoundTitleLayout = new javax.swing.GroupLayout(panelRoundTitle);
        panelRoundTitle.setLayout(panelRoundTitleLayout);
        panelRoundTitleLayout.setHorizontalGroup(
            panelRoundTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRoundTitleLayout.setVerticalGroup(
            panelRoundTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundTitleLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2))
        );

        panelRoundConteudo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelRoundConteudo.setRoundBottomLeft(50);
        panelRoundConteudo.setRoundBottomRight(50);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout panelRoundConteudoLayout = new javax.swing.GroupLayout(panelRoundConteudo);
        panelRoundConteudo.setLayout(panelRoundConteudoLayout);
        panelRoundConteudoLayout.setHorizontalGroup(
            panelRoundConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundConteudoLayout.setVerticalGroup(
            panelRoundConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(674, 674, 674)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRoundConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRoundTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelRoundTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1320, 640));

        setBounds(0, 0, 1314, 791);
    }// </editor-fold>//GEN-END:initComponents
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    }//GEN-LAST:event_formInternalFrameActivated
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel CabecalhodeClienteImg;
    private javax.swing.JPanel WinPainel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Source.Classes.PanelRound panelRoundConteudo;
    private Source.Classes.PanelRound panelRoundTitle;
    private Source.Classes.Table.Table table1;
    private Source.ButtonTitleBar.WinButtonInternal winButtonInternal;
    // End of variables declaration//GEN-END:variables
}
