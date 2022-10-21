/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelos.*;
import java.util.List;
import BancoDeDados.Dados;

/**
 *
 * @author Giovani
 */
public class DAOProduto {
   //READ
    public List<Produto> getLista(){
        return Dados.ListaProduto;              
    } 
    //CREAT
    //UPDATE
    public void Save(Produto produto){
        if (produto.getId_produto()==0) {
            int aux = Dados.ListaProduto.size() + 1;
            produto.setId_produto(aux);            
        }
        else{
            //update
            Dados.ListaProduto.add(produto);
        }
    }
    //DELETE
    public void Remove(Produto produto){
        Dados.ListaProduto.remove(produto);   
    }
}
