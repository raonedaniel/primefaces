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
import br.com.ambientinformatica.primefaces.entidade.Secao;
import br.com.ambientinformatica.primefaces.servico.Servico;

@Controller("secaoController")
@Scope("conversation")
public class SecaoController {

	private Secao secao = new Secao();
	 
	@Autowired
	private Servico<Secao> secaoServico;
	
	private List<Secao> secoes = new ArrayList<Secao>();
	

   @PostConstruct
   public void init(){
      listar(null);
   }
   
	public void confirmar(ActionEvent evt){
		try {
			secaoServico.editar(secao);
         listar(evt);
         secao = new Secao();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt){
		try {
			secoes = secaoServico.getTodosOsObjetos();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	
	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}
	
	public List<Secao> getSecoes() {
		return secoes;
	}
	
	public void excluir(ActionEvent evt){ 
		try{
			secao = (Secao)UtilFaces.getValorParametro(evt, "secao");
			if(secao != null){
				secaoServico.deletaPorId(secao.getIdSecao());
				UtilFaces.addMensagemFaces("Seção removida com sucesso");
				listar(evt);
			}
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void editar(ActionEvent evt){ 
		try{
			secao = (Secao)UtilFaces.getValorParametro(evt, "contato");
			if(secao != null){
				secaoServico.editar(secao);
				secao.setHoraDeInicio(secao.getHoraDeInicio());
				UtilFaces.addMensagemFaces("Seção editada com sucesso");
				listar(evt);
			}
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

}


