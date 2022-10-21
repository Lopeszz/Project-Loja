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
public class DAOVenda {

    //READ
    public List<Venda> getLista() {
        return Dados.ListaVenda;
    }

    //CREAT
    //UPDATE
    public void Save(Venda venda) {
        if (venda.getId_venda() == 0) {
            int aux = Dados.ListaVenda.size() + 1;
            venda.setId_venda(aux);
        } else {
            //update
            Dados.ListaVenda.add(venda);
        }
    }

    //DELETE
    public void Remove(Venda venda) {
        Dados.ListaVenda.remove(venda);
    }
}
