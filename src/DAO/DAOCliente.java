/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Cliente;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovani
 */
public class DAOCliente {

    private final Connection con;

    public DAOCliente() {
        this.con = new ConnectionFactory().getConnection();
    }

    //CREAT
    public void Save(Cliente obj) {
        try {
            String sql = "INSERT INTO cliente (nome,cpf,email,celular,cep,rua,numero,complemento,bairro,cidade,estado) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getRua());
            stmt.setInt(7, obj.getNumero());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getEstado());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    //READ
    public List<Cliente> listarcliente() {
        try {
            //Criando a lista
            List<Cliente> lista = new ArrayList<>();
            //Comando Sql
            String sql = "select * from cliente";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            //Armazenando os dados
            ResultSet rs = stmt.executeQuery();
            //Jogando os dados para o ArrayList
            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId_cliente(rs.getInt("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                //guardando o obj na lista
                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }

    //DELETE
    public void Delete(Cliente obj) {
        try {
            String sql = "delete from cliente where id_cliente = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId_cliente());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Apagado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }

    }

    //UPDATE
    public void Update(Cliente obj) {
        try {
            //Criando comando
            String sql = "update cliente set nome = ?, cpf = ?, email = ?, celular = ?, cep = ?, "
                    + "rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?,estado = ? "
                    + "where id_fornecedor = ?";
            //Conectar e organizar os dados
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getRua());
            stmt.setInt(7, obj.getNumero());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getEstado());
            stmt.setInt(12, obj.getId_cliente());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }
}
