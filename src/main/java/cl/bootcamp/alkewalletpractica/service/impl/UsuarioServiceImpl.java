package cl.bootcamp.alkewalletpractica.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import cl.bootcamp.alkewalletpractica.model.Usuario;
import cl.bootcamp.alkewalletpractica.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{

	 private Map<String, Usuario> usuarios;
	 
	@Override
	public boolean validaUsuario(Usuario usuario) {
		return !usuario.getNombre().isBlank() &&
				   !usuario.getClave().isBlank();
	}

	@Override
	public Usuario obtenerUsuario(String nombre) {
	
		return new Usuario();
	}

	@Override
	public boolean guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void crearUsuario(Usuario usuario) {
	usuarios.put(usuario.getNombre(), usuario);
	}

	@Override
	public void ActualizarUsuario(String nombre, Usuario UsuarioActualizado) {
		  if (usuarios.containsKey(nombre)) {
	            usuarios.put(nombre, UsuarioActualizado);
	        }
	    }

	

	@Override
	public void eliminarUsuario(String nombre) {
		 usuarios.remove(nombre);
		
	}

}
