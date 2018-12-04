package br.com.ambientinformatica.primefaces.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ambientinformatica.primefaces.entidade.Secao;
import br.com.ambientinformatica.primefaces.persistencia.SecaoDao;

@Service
public class SecaoServicoImpl implements Servico<Secao> {
	
	@Autowired
	private SecaoDao secaoDao;

	@Transactional
	public void salvar(Secao objeto) {
		try {
			secaoDao.incluir(objeto);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
	}

	@Transactional
	public void editar(Secao objeto) {
		try {
			secaoDao.alterar(objeto);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
	}

	@Transactional
	public void deletaPorId(Integer objetoId) {
		try {
			secaoDao.excluirPorId(objetoId);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
	}

	@Transactional
	public Secao getObjeto(Integer objetoId) {
		try {
			return secaoDao.consultar(objetoId);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
		return null;
	}

	@Transactional
	public List<Secao> getTodosOsObjetos() {
		try {
			return secaoDao.listar();
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}
		return null;
	}
}
