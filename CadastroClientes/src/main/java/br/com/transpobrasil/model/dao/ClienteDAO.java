package br.com.transpobrasil.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.transpobrasil.controller.Controller;
import br.com.transpobrasil.model.entity.Cliente;

public class ClienteDAO extends DAO {

	public Cliente consultarClienteID(int id) {
		EntityManager em = getEm();
		em.getTransaction().begin();
		Cliente clienteOb = (Cliente) em.find(Cliente.class, id);
		em.getTransaction().commit();
		em.close();
		return clienteOb;	
	}
	
	public List<Cliente> BuscarListaClientes(){
		EntityManager em = getEm();
		em.getTransaction().begin();
		String queryJPQL = "select c from Cliente c";
		Query query = em.createQuery(queryJPQL);
		List<Cliente> listaCliente = query.getResultList();	
		em.close();
		
		return listaCliente;
	}

	public boolean deletarClientes(List<Cliente> cliente) {
		EntityManager em = getEm();
		
		for (Cliente clienteOb : cliente) {
			em.getTransaction().begin();
			Cliente clienteDel = em.find(Cliente.class, clienteOb.getId());
			em.remove(clienteDel);
			em.getTransaction().commit();
			em.close();
		}
		return true;
	}
	
}
