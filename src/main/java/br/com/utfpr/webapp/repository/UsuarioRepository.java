package br.com.utfpr.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.utfpr.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);
	
}
