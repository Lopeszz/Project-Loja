/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Fornecedor;
import jacontrol.Classes.WebServiceCep;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFornecedor {

    private final Connection con;

    public DAOFornecedor() {
        this.con = new ConnectionFactory().getConnection();
    }

    //CREAT
    public void Save(Fornecedor obj) {
        try {
            String sql = "INSERT INTO fornecedor (nome,cnpj,email,celular,cep,rua,numero,complemento,bairro,cidade,estado) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
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
    public List<Fornecedor> listarFornecedor() {
        try {
            //Criando a lista
            List<Fornecedor> lista = new ArrayList<>();
            //Comando Sql
            String sql = "select * from fornecedor";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            //Armazenando os dados
            ResultSet rs = stmt.executeQuery();
            //Jogando os dados para o ArrayList
            while (rs.next()) {
                Fornecedor obj = new Fornecedor();
                obj.setId_fornecedor(rs.getInt("id_fornecedor"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
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
    public void Delete(Fornecedor obj) {
        try {
            String sql = "delete from fornecedor where id_fornecedor = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId_fornecedor());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Apagado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }

    }

    //UPDATE
    public void Update(Fornecedor obj) {
        try {
            //Criando comando
            String sql = "update fornecedor set nome = ?, cnpj = ?, email = ?, celular = ?, cep = ?, "
                    + "rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?,estado = ? "
                    + "where id_fornecedor = ?";
            //Conectar e organizar os dados
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getRua());
            stmt.setInt(7, obj.getNumero());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getEstado());
            stmt.setInt(12, obj.getId_fornecedor());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    //BuscaPorNomeTabela
    public List<Fornecedor> buscaFornecedorPorNomeTabela(String nome) {
        try {
            //Criando a lista
            List<Fornecedor> lista = new ArrayList<>();
            //Comando Sql
            String sql = "select * from fornecedor f where f.nome like ?";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            //Armazenando os dados
            ResultSet rs = stmt.executeQuery();
            //Jogando os dados para o ArrayList
            while (rs.next()) {
                Fornecedor obj = new Fornecedor();
                obj.setId_fornecedor(rs.getInt("id_fornecedor"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
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

    //BuscaPorNomeFrameDados
    public Fornecedor buscaFornecedorPorNomeFrameDados(String nome) {
        try {
            String sql = "select * from fornecedor f where f.nome = ?";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Fornecedor obj = new Fornecedor();
            if (rs.next()) {
                obj.setId_fornecedor(rs.getInt("id_fornecedor"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
            }
            return obj;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
        }
        return null;
    }

    public Fornecedor buscaCep(String cep) {
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
        Fornecedor obj = new Fornecedor();

        if (webServiceCep.wasSuccessful()) {
            obj.setRua(webServiceCep.getLogradouroFull());
            obj.setCidade(webServiceCep.getCidade());
            obj.setBairro(webServiceCep.getBairro());
            obj.setEstado(webServiceCep.getUf());
            return obj;
        } else {
            JOptionPane.showMessageDialog(null, "CEP não encontrado na base de dados");
            return null;
        }

    }

}
