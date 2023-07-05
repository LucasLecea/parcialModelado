package com.cooweb.dao;

import java.util.List;


import com.cooweb.models.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	public List<Usuario> obtenerUsuarios();
}
