package henrique.castro._6.projeto_henrique_spring202402.service;

import java.util.List;

import henrique.castro._6.projeto_henrique_spring202402.entity.Usuario;

public interface UsuarioService {

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodos();

    public Usuario buscarPeloId(Long id);
    
}