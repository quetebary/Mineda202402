package henrique.castro._6.projeto_henrique_spring202402.repository;

import org.springframework.data.repository.CrudRepository;

import henrique.castro._6.projeto_henrique_spring202402.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    
}