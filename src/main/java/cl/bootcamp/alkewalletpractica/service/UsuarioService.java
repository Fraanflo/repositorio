package cl.bootcamp.alkewalletpractica.service;

import cl.bootcamp.alkewalletpractica.model.Usuario;

public interface UsuarioService {
boolean validaUsuario(Usuario usuario);
	
	Usuario obtenerUsuario(String nombre);
	
	boolean guardarUsuario(Usuario usuario);
	
	public void crearUsuario(Usuario usuario);
	
	public void ActualizarUsuario(String nombre, Usuario usuarioActualizado);
	
	public void eliminarUsuario(String nombre);
}
