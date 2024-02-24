package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	
	@Autowired
	private ClienteDAO clienteDAO;

	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
	}

	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne(id);
	}

	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		
		clienteDAO.add(cliente);

	}

	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
		
		clienteDAO.up(cliente);

	}

	public void del(int id) {
		// TODO Auto-generated method stub
		
		clienteDAO.del(id);

	}
	
	public void add(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono, String correo) {
		
		
	Cliente cliente=new Cliente(idCliente,cedula,nombre,apellido,direccion,telefono,correo);	
	clienteDAO.add(cliente);
	
	}
	
	public void up(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono, String correo) {
		
		
		Cliente cliente=new Cliente(idCliente,cedula,nombre,apellido,direccion,telefono,correo);	
		clienteDAO.up(cliente);
		
	}

}
