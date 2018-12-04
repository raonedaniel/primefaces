package br.com.ambientinformatica.primefaces.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ambientinformatica.primefaces.entidade.Sala;
import br.com.ambientinformatica.primefaces.persistencia.SalaDao;

@Service
public class SalaServicoImpl implements Servico<Sala> {

	@Autowired
	private SalaDao salaDao;

	@Transactional
	public void salvar(Sala objeto) {
		try {
			salaDao.incluir(objeto);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
	}

	@Transactional
	public void editar(Sala objeto) {
		try {
			salaDao.alterar(objeto);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
	}

	@Transactional
	public void deletaPorId(Integer objetoId) {
		try {
			salaDao.excluirPorId(objetoId);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
	}

	@Transactional
	public Sala getObjeto(Integer objetoId) {
		try {
			return salaDao.consultar(objetoId);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
		return null;
	}

	@Transactional
	public List<Sala> getTodosOsObjetos() {
		try {
			return salaDao.listar();
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
		return null;
	}
}
