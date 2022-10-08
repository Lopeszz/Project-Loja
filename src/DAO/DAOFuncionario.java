/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BancoDeDados.Dados;
import java.util.List;
import Modelos.*;

/**
 *
 * @author Giovani
 */
public class DAOFuncionario {
    //READ
    public List<Funcionario> getLista(){
        return Dados.ListaFuncionario;              
    } 
    //CREAT
    //UPDATE
    public void Save(Funcionario funcionario){
        if (funcionario.getId_funcionario()==0) {
            int aux = Dados.ListaFuncionario.size() + 1;
            funcionario.setId_funcionario(aux);            
        }
        else{
            //update
            Dados.ListaFuncionario.add(funcionario);
        }
    }
    //DELETE
    public void Remove(Funcionario funcionario){
        Dados.ListaFuncionario.remove(funcionario);   
    }
 
}
