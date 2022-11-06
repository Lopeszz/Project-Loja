/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Init;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Component;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;

/**
 * §
 *
 * @author Lopes
 */
public class Principal extends javax.swing.JFrame {
    
    public String usuarioLogado;
    
    public Principal() {
        initComponents();
        GradientDropdownMenu menu = new GradientDropdownMenu();
        getContentPane().setBackground(Color.WHITE);
        menu.setMenuHeight(50);
        menu.setGradientColor(Color.black, Color.black);
        menu.setHeaderGradient(false);
        menu.addItem("Inicial");
        menu.addItem("Cadastrar", "Funcionário", "Cliente", "Produto", "Fornecedor");
        menu.setFont(Pegandoafont());
        menu.applay(this);

        menu.addEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex, boolean menuItem) {
                if (index == 1 && subIndex == 1 && menuItem) {
                    FuncionarioInternalFrame obj = new FuncionarioInternalFrame(DesktopPane);
                    showForm(obj);
                    menu.getComponentPopupMenu().setVisible(false);

                } else if (index == 1 && subIndex == 2 && menuItem) {
                    ClienteInternalFrame obj = new ClienteInternalFrame(DesktopPane);
                    showForm(obj);
                    menu.getComponentPopupMenu().setVisible(false);

                } else if (index == 0 && menuItem) {
                    menu.getComponentPopupMenu().setVisible(false);

                }
            }
        }
        );
    }

    private void showForm(Component com) {
        DesktopPane.removeAll();
        DesktopPane.add(com);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }

    public Font Pegandoafont() {
        try {
            Font montserrat;
            montserrat = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Source/Fontes/Montserrat-SemiBold.ttf"));
            montserrat = montserrat.deriveFont(Font.PLAIN, 16);
            return montserrat;
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu errado na font");
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Whale ERP");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DesktopPane.setMaximumSize(new java.awt.Dimension(1280, 750));
        DesktopPane.setMinimumSize(new java.awt.Dimension(1280, 750));
        DesktopPane.setName(""); // NOI18N
        DesktopPane.setOpaque(false);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 690));

        roundPanel1.setBackground(new java.awt.Color(228, 223, 223));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 16)); // NOI18N
        jLabel1.setText("Usúario Conectado:");

        lblUsuario.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 16)); // NOI18N
        lblUsuario.setText("Null");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addContainerGap(1092, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1280, 30));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Img/Inicial/telaInicial.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        lblUsuario.setText(usuarioLogado);
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        IntelliJTheme.setup(Principal.class.getResourceAsStream("/Cyan.theme.json"));

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsuario;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
