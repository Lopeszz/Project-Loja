/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import View.Init.Principal;
import com.formdev.flatlaf.IntelliJTheme;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopes
 */
public class TestarConexao {

    public static void main(String[] args) {
        IntelliJTheme.setup(Principal.class.getResourceAsStream("/Cyan.theme.json"));
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ops, aconteceu algum erro" + e);
        }
    }

}
