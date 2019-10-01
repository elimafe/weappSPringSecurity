package br.com.utfpr.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.utfpr.webapp.entity.GrupoEntity;
import br.com.utfpr.webapp.entity.UsuarioEntity;

@Repository
public interface GrupoRepository extends JpaRepository<GrupoEntity, Long>{

	List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);
	
}
