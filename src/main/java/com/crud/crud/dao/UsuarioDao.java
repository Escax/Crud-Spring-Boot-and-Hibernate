package com.crud.crud.dao;

import com.crud.crud.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);
}
