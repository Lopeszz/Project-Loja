/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Init;

import com.formdev.flatlaf.FlatIntelliJLaf;
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
import javax.swing.UIManager;

/**
 * §
 *
 * @author Lopes
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        GradientDropdownMenu menu = new GradientDropdownMenu();
        getContentPane().setBackground(Color.WHITE);
        menu.setMenuHeight(50);
        menu.setGradientColor(Color.black, Color.black);
        menu.setHeaderGradient(false);
        menu.addItem("Inicial");
        menu.addItem("Cadastrar", "Funcionário", "Cliente", "Produto", "Fornecedor");
        menu.applay(this);
        menu.setFont(Pegandoafont());

        menu.addEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex, boolean menuItem) {
                if (index == 1 && subIndex == 1 && menuItem) {
                    showForm(new NewJInternalFrame(DesktopPane));
                    menu.getComponentPopupMenu().setVisible(false);
                }
                else if (index == 1 && subIndex == 2 && menuItem) {
                    showForm(new NewJInternalFrame(DesktopPane));
                    menu.getComponentPopupMenu().setVisible(false);
                }
            }
        });
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
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Whale ERP");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
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

        getContentPane().add(DesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 750));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/tela principal.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
