package cl.bootcamp.alkewalletpractica.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.alkewalletpractica.model.Usuario;
import cl.bootcamp.alkewalletpractica.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	@GetMapping("/form")
	public ModelAndView formGet() {
		
		return new ModelAndView("formulario-usuario.jsp");
	}
	@PostMapping("/form")
	public ModelAndView formPost(@ModelAttribute Usuario usuario) {
		
		Map<String,Object> model= new HashMap<>();
		model.put("nombre", usuario);
		
		if(!usuarioService.validaUsuario(usuario)) {
			return  new ModelAndView("error-usuario.jsp");
		}
		
		return new ModelAndView("usuario.jsp",model);
	}
	
	
}