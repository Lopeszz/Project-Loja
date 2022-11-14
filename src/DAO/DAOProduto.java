/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Fornecedor;
import Modelos.Produto;
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
public class DAOProduto {

    private final Connection con;

    public DAOProduto() {
        this.con = new ConnectionFactory().getConnection();
    }

    //SAVE
    public void Save(Produto obj) {
        try {
            String sql = "INSERT INTO produto (nome, descricao,preco, qtd_estoque, fornecedor_id) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getDescricao());
            stmt.setDouble(3, obj.getPreco());
            stmt.setInt(4, obj.getQtd_estoque());
            stmt.setInt(5, obj.getFornecedor().getId_fornecedor());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    //READ
    public List<Produto> listarProduto() {
        try {
            //Criando a lista
            List<Produto> lista = new ArrayList<>();
            //Comando Sql
            String sql = "select p.id_produto, p.nome, p.descricao, p.preco, p.qtd_estoque , f.nome "
                    + "from produto p, fornecedor f where p.fornecedor_id = f.id_fornecedor ";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            //Armazenando os dados
            ResultSet rs = stmt.executeQuery();
            //Jogando os dados para o ArrayList
            while (rs.next()) {
                Produto obj = new Produto();
                Fornecedor f = new Fornecedor();

                obj.setId_produto(rs.getInt("p.id_produto"));
                obj.setNome(rs.getString("p.nome"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString("f.nome"));
                // Guardar o Obj Fornecedor dentro do obj Produto
                obj.setFornecedor(f);
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
    public void Delete(Produto obj) {
        try {
            String sql = "delete from produto where id_produto = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId_produto());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Apagado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    //UPDATE
    public void Update(Produto obj) {
        try {
            //Criando comando
            String sql = "update produto set nome = ?, descricao = ?,preco = ?,qtn_estoque = ?,fornecedor_id = ? "
                    + "where id_produto = ?";
            //Conectar e organizar os dados
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getDescricao());
            stmt.setDouble(3, obj.getPreco());
            stmt.setInt(4, obj.getQtd_estoque());
            stmt.setInt(5, obj.getFornecedor().getId_fornecedor());
            stmt.setInt(6, obj.getId_produto());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro: " + e);
        }
    }

    //BuscaPorNomeTabela
    public List<Produto> buscaProdutoPorNomeTabela(String nome) {
        try {
            //Criando a lista
            List<Produto> lista = new ArrayList<>();
            //Comando Sql
            String sql = "select p.id_produto, p.nome, p.descricao, p.preco, p.qtd_estoque , f.nome "
                    + "from produto p, fornecedor f where p.fornecedor_id = f.id_fornecedor and p.nome like ?";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            //Armazenando os dados
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            //Jogando os dados para o ArrayList
            while (rs.next()) {
                Produto obj = new Produto();
                Fornecedor f = new Fornecedor();

                obj.setId_produto(rs.getInt("p.id_produto"));
                obj.setNome(rs.getString("p.nome"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString("f.nome"));
                // Guardar o Obj Fornecedor dentro do obj Produto
                obj.setFornecedor(f);

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
    public Produto buscaProdutoPorNomeFrameDados(String nome) {
        try {
            //Comando Sql
            String sql = "select p.id_produto, p.nome, p.descricao, p.preco, p.qtd_estoque , f.nome "
                    + "from produto p, fornecedor f where p.fornecedor_id = f.id_fornecedor and p.nome = ?";
            //Executar
            PreparedStatement stmt = con.prepareStatement(sql);
            //Armazenando os dados
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            Produto obj = new Produto();
            Fornecedor f = new Fornecedor();

            //Jogando os dados para o ArrayList
            if (rs.next()) {

                obj.setId_produto(rs.getInt("p.id_produto"));
                obj.setNome(rs.getString("p.nome"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString("f.nome"));
                // Guardar o Obj Fornecedor dentro do obj Produto
                obj.setFornecedor(f);
            }
                return obj;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
}
