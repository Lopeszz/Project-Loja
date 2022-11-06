/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Funcionario;
import View.Init.Principal;
import com.sun.prism.impl.GlyphCache;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Giovani
 */
public class DAOFuncionario {

    public boolean conseguiuLogar;
    private Connection con;

    public DAOFuncionario() {
        this.con = new ConnectionFactory().getConnection();
    }

    //CREAT
    public void Save(Funcionario obj) {
        try {
            String sql = "INSERT INTO funcionario (nome,cpf,usuario,senha,salario,celular,cargo,nivel_acesso) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getUsuario());
            stmt.setString(4, obj.getSenha());
            stmt.setDouble(5, obj.getSalario());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCargo());
            stmt.setString(8, obj.getNivel_acesso());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    //READ
    public List<Funcionario> listarFuncionario() {
        try {
            //Criando a lista
            List<Funcionario> lista = new ArrayList<>();
            //Comando Sql
            String sql = "select * from funcionario";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            //Armazenando os dados
            ResultSet rs = stmt.executeQuery();
            //Jogando os dados para o ArrayList
            while (rs.next()) {
                Funcionario obj = new Funcionario();
                obj.setId_funcionario(rs.getInt("id_funcionario"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setUsuario(rs.getString("usuario"));
                obj.setSenha(rs.getString("senha"));
                obj.setSalario(rs.getDouble("salario"));
                obj.setCelular(rs.getString("celular"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                //guardando o obj na lista
                lista.add(obj);

            }
            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }

    //Excluir
    public void Delete(Funcionario obj) {
        try {
            String sql = "delete from funcionario where id_funcionario = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId_funcionario());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Apagado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }

    }

    //Update
    public void Update(Funcionario obj) {
        try {
            //Criando comando
            String sql = "update funcionario set nome = ?, cpf = ?,usuario = ?,senha = ?,salario = ?,"
                    + "celular = ?,cargo = ?,nivel_acesso = ? where id_funcionario = ?";
            //Conectar e organizar os dados
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getUsuario());
            stmt.setString(4, obj.getSenha());
            stmt.setDouble(5, obj.getSalario());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCargo());
            stmt.setString(8, obj.getNivel_acesso());
            stmt.setInt(9, obj.getId_funcionario());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    public void Login(String usuario, String senha) {
        try {

            String sql = "select * from funcionario where usuario = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                //usuario consiguiu logar
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema");
                Principal tela = new Principal();
                tela.usuarioLogado = rs.getNString("nome");
                tela.setVisible(true);
                conseguiuLogar = true;

            } else {
                //dados invalidos
                JOptionPane.showMessageDialog(null, "Dados incorretos");

            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }

    }
}
