package br.com.utfpr.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.utfpr.webapp.entity.GrupoEntity;
import br.com.utfpr.webapp.entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {

	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);
}
