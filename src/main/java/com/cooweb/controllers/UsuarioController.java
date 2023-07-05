package com.cooweb.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.models.Usuario;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola mundo";
	}
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Lucas", "Diego", "Sofia");
	}
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios () {
		Usuario usuario = new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Lecea");
		usuario.setEmail("lucaslecea2003@gmail.com");
		usuario.setTelefono("2616309446");
		return usuario;
	}
	
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuario (@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Lucas");
		usuario.setApellido("Lecea");
		usuario.setEmail("lucaslecea2003@gmail.com");
		usuario.setTelefono("2616309446");
		return usuario;
	}
	
	@RequestMapping(value="lista_usuarios")
	public List<Usuario> listar_variosUsuarios(){
		List<Usuario> usuarios=new ArrayList<>();
		Usuario usuario1 = new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Lucas");
		usuario1.setApellido("Lecea");
		usuario1.setEmail("lucaslecea2003@gmail.com");
		usuario1.setTelefono("2616309446");
		Usuario usuario2 = new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Diego");
		usuario2.setApellido("Lecea");
		usuario2.setEmail("Diegolecea@gmail.com");
		usuario2.setTelefono("2616332364");
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		return usuarios;
		
	}
	
	@RequestMapping(value="lista_usuariosInyeccion")
	public List<Usuario> getUsuarios(){
		List<Usuario> users = usuarioDao.obtenerUsuarios();
		return users;
	}
	
	
}
