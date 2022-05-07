package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Usuario;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioUsuario {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario RegistrarUsuario(Usuario usuario){
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> ObtenerListaUsuarios(){
        return repositorioUsuario.findAll();
    }
}
