package br.com.primeiroProjeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.primeiroProjeto.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
