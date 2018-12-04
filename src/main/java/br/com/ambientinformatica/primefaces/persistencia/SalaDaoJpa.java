package br.com.ambientinformatica.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Sala;

@Repository("salaDao")
public class SalaDaoJpa extends PersistenciaJpa<Sala> implements SalaDao{

   private static final long serialVersionUID = 1L;

}
