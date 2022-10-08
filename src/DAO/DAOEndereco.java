/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelos.*;
import BancoDeDados.Dados;
import java.util.List;

/**
 *
 * @author Giovani
 */
public class DAOEndereco {
   //READ
    public List<ItemVenda> getLista(){
        return Dados.ListaItemVenda;              
    } 
    //CREAT
    //UPDATE
    public void Save(ItemVenda itemvenda){
        if (itemvenda.getId_itemvenda()==0) {
            int aux = Dados.ListaItemVenda.size() + 1;
            itemvenda.setId_itemvenda(aux);            
        }
        else{
            //update
            Dados.ListaItemVenda.add(itemvenda);
        }
    }
    //DELETE
    public void Remove(ItemVenda itemvenda){
        Dados.ListaItemVenda.remove(itemvenda);   
    }
}