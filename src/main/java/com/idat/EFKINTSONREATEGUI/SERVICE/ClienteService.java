package com.idat.EFKINTSONREATEGUI.SERVICE;

import java.util.List;

import com.idat.EFKINTSONREATEGUI.MODEL.Cliente;



public interface ClienteService {
	List<Cliente> listar();
	Cliente ObtenerId(Integer id);	
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);	

}