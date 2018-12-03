package br.com.ambientinformatica.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.ambientinformatica.primefaces.entidade.Contato;
import br.com.ambientinformatica.primefaces.persistencia.ContatoDao;

@Controller("ContatoControl")
@Scope("conversation")
public class ContatoControl {

	private Contato contato = new Contato();
	 
	@Autowired
	private ContatoDao contatoDao;
	
	private List<Contato> contatos = new ArrayList<Contato>();
	

   @PostConstruct
   public void init(){
      listar(null);
   }
   
	public void confirmar(ActionEvent evt){
		try {
			contatoDao.alterar(contato);
         listar(evt);
         contato = new Contato();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt){
		try {
			contatos = contatoDao.listar();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void excluir(ActionEvent evt){ 
		try{
			contato = (Contato)UtilFaces.getValorParametro(evt, "contato");
			if(contato != null){
				contatoDao.excluirPorId(contato.getId());
				UtilFaces.addMensagemFaces("Contato removido com sucesso");
				listar(evt);
			}
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void editar(ActionEvent evt){ 
		try{
			contato = (Contato)UtilFaces.getValorParametro(evt, "contato");
			if(contato != null){
				contatoDao.alterar(contato);
				contato.setNome(contato.getNome());
				UtilFaces.addMensagemFaces("Contato editado com sucesso");
				listar(evt);
			}
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

}


