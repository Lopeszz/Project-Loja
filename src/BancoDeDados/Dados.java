/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.util.ArrayList;
import java.util.List;
import Modelos.*;

/**
 *
 * @author Giovani
 */
public class Dados {

    public static List<Cliente> ListaClientes = new ArrayList<>();
    public static List<Endereco> ListaEndereco = new ArrayList<>();
    public static List<Fornecedor> ListaFornecedor = new ArrayList<>();
    public static List<Funcionario> ListaFuncionario = new ArrayList<>();
    public static List<Produto> ListaProduto = new ArrayList<>();
    public static List<Venda> ListaVenda = new ArrayList<>();
    public static List<ItemVenda> ListaItemVenda = new ArrayList<>();

    /* Criando listas para utilizar como se fosse um banco de dados, essa listas
    serão estaticas assim podem manipular varios objetos de mesma classe*/
}
