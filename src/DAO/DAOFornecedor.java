/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoDeDados.Dados;
import Modelos.Fornecedor;
import java.util.List;

/**
 *
 * @author Giovani
 */
public class DAOFornecedor {
    //READ
    public List<Fornecedor> getLista(){
        return Dados.ListaFornecedor;              
    } 
    //CREAT
    public void Save(Fornecedor fornecedor){
        if (fornecedor.getId_fornecedor()==0) {
            int aux = Dados.ListaFornecedor.size() + 1;
            fornecedor.setId_fornecedor(aux);            
        }
        else{
            //update
            Dados.ListaFornecedor.add(fornecedor);
        }
    }
    //DELETE
    public void Remove(Fornecedor fornecedor){
        Dados.ListaFornecedor.remove(fornecedor);   
    }
}
