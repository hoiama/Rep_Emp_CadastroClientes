package br.com.transpobrasil.controller;

import java.util.List;
import br.com.transpobrasil.model.dao.ClienteDAO;
import br.com.transpobrasil.model.dao.Funcao;
import br.com.transpobrasil.model.entity.Cliente;

public class Controller {
	
	ClienteDAO ItemDAO = new ClienteDAO();
	
	public boolean executar (Cliente cliente, Funcao funcao){
		boolean resposta = funcao.executa(cliente);
		cliente.setJuros((cliente.getRisco() == "B") ? 10 : 20);
		buscarListaClientes();
		return resposta;
	}
	
	public void consultarClientes(int id){
		ItemDAO.consultarClienteID(id);
	}
	
	public List<Cliente> buscarListaClientes(){
		return ItemDAO.BuscarListaClientes();
	}
	
	public boolean deletarClientes(List<Cliente> cliente){
		return ItemDAO.deletarClientes(cliente);
	}

}
