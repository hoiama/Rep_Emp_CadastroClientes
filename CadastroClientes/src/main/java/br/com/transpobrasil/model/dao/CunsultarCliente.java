package br.com.transpobrasil.model.dao;

import javax.persistence.EntityManager;
import br.com.transpobrasil.model.entity.Cliente;

public class CunsultarCliente extends DAO implements Funcao {

	@Override
	public boolean executa(Cliente cliente) {
		EntityManager em = getEm();
		try {
			em.getTransaction().begin();
			Cliente clienteOb = em.find(Cliente.class, cliente.getId());
			em.getTransaction().commit();
			em.close();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			return false;
		}
	}

}
