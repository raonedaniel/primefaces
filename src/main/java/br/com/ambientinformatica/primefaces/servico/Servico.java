package br.com.ambientinformatica.primefaces.servico;

import java.util.List;

public interface Servico<T> {

	public void salvar(T objeto);
	public void editar(T objeto);
	public void deletaPorId(Integer objetoId);
	public T getObjeto(Integer objetoId);
	public List<T> getTodosOsObjetos();
	
}
