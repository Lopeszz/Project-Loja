/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import BancoDeDados.Dados;
import Modelos.*;
import java.util.List;

/**
 *
 * @author Giovani
 */
public class DAOCliente {
    //READ
    public List<Cliente> getLista(){
        return Dados.ListaClientes;              
    } 
    //CREAT
    //UPDATE
    public void Save(Cliente cliente){
        if (cliente.getId_cliente()==0) {
            int aux = Dados.ListaClientes.size() + 1;
            cliente.setId_cliente(aux);            
        }
        else{
            //update
            Dados.ListaClientes.add(cliente);
        }
    }
    //DELETE
    public void Remove(Cliente cliente){
        Dados.ListaClientes.remove(cliente);   
    }
}
        
        
    
