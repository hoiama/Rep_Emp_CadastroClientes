package dbccompany;

import org.primefaces.component.dashboard.Dashboard;

import br.com.transpobrasil.model.bean.DashBoardBean;
import br.com.transpobrasil.model.dao.ClienteDAO;
import br.com.transpobrasil.model.entity.Cliente;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testes teste = new Testes();
		teste.DAO_BuscarListaClientes();
		
		Cliente cliente = new Cliente();
		cliente.setId(42);
		cliente.setNome("hoiama Rosa");
		teste.DAO_EditarCLiente(cliente);
		
		teste.DAO_BuscarListaClientes();
	}
	
	
	DashBoardBean bean = new DashBoardBean();
	ClienteDAO dao = new ClienteDAO();
	
	
	public void DAO_BuscarListaClientes(){
		dao.BuscarListaClientes();
	}
	
	public void Bean_BuscarListaClientes(){
		bean.buscarListaClientes();
	}
	
	public void DAO_DeletarCliente(int id){
		dao.deletarClientes(id);
	}
	
	public void DAO_EditarCLiente(Cliente clienteOb){
		dao.editarCliente(clienteOb);
	}

}
