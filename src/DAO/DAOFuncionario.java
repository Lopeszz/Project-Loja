/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Funcionario;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovani
 */
public class DAOFuncionario {

    private Connection con;

    public DAOFuncionario() {
        this.con = new ConnectionFactory().getConnection();
    }

    //CREAT
    public void Save(Funcionario obj) {
        try {
            
            String sql = "INSERT INTO funcionario (id_funcionario,nome,cpf,usuario,senha,salario,celular,cargo,nivel_acesso) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId_funcionario());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getUsuario());
            stmt.setString(5, obj.getSenha());
            stmt.setDouble(6, obj.getSalario());
            stmt.setString(7, obj.getCelular());
            stmt.setString(8, obj.getCargo());
            stmt.setString(9, obj.getNivel_acesso());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (HeadlessException| SQLException e) {
            System.out.println(e);
            System.out.println("nn tá funcionando");
        }
    }
}
