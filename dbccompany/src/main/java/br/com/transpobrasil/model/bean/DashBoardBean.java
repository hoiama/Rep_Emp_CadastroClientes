package br.com.transpobrasil.model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.RowEditEvent;
import br.com.transpobrasil.controller.Controller;
import br.com.transpobrasil.model.dao.EditarCliente;
import br.com.transpobrasil.model.dao.Funcao;
import br.com.transpobrasil.model.dao.SalvarCliente;
import br.com.transpobrasil.model.entity.Cliente;

@ManagedBean(name = "DashBoardBean")
@ViewScoped
public class DashBoardBean  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Cliente cliente = new Cliente();
	private List<String> listaRiscos;
	private List<Cliente> listaClientes = new ArrayList<>();
	private List<Cliente> clientesSelecionados = new ArrayList<>();
	Controller serviceController = new Controller();
	
	Funcao salvar = new SalvarCliente();
	Funcao editar = new EditarCliente();
	
	public void salvar (){
		serviceController.executar(cliente, salvar);
	}
	
	public void editar (RowEditEvent event){ 
		serviceController.executar((Cliente) event.getObject(), editar);
	}
	
	public void deletar(){
		serviceController.deletarClientes(clientesSelecionados);
	}
	
	public void buscarListaClientes() {
		setListaClientes(serviceController.buscarListaClientes());	
	}
	
	public void limparTela() {
		cliente = new Cliente();	
	}

	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<String> getListaRiscos() {
		return listaRiscos;
	}

	public void setListaRiscos(List<String> listaRiscos) {
		this.listaRiscos = listaRiscos;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Cliente> getClientesSelecionados() {
		return clientesSelecionados;
	}

	public void setClientesSelecionados(List<Cliente> clientesSelecionados) {
		this.clientesSelecionados = clientesSelecionados;
	}

	

	

}
