package br.com.ambientinformatica.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Secao;

@Repository("secaoDao")
public class SecaoDaoJpa extends PersistenciaJpa<Secao> implements SecaoDao {

	private static final long serialVersionUID = 1L;

}
