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
import br.com.ambientinformatica.primefaces.entidade.Sala;
import br.com.ambientinformatica.primefaces.servico.Servico;

@Controller("SalaController")
@Scope("conversation")
public class SalaController {

	private Sala sala = new Sala();
	 
	@Autowired
	private Servico<Sala> salaServico;
	
	private List<Sala> salas = new ArrayList<Sala>();
	

   @PostConstruct
   public void init(){
      listar(null);
   }
   
	public void confirmar(ActionEvent evt){
		try {
			salaServico.editar(sala);
         listar(evt);
         sala = new Sala();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt){
		try {
			salas = salaServico.getTodosOsObjetos();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public List<Sala> getSalas() {
		return salas;
	}
	
	public void excluir(ActionEvent evt){ 
		try{
			sala = (Sala)UtilFaces.getValorParametro(evt, "sala");
			if(sala != null){
				salaServico.deletaPorId(sala.getIdSala());
				UtilFaces.addMensagemFaces("Sala removida com sucesso");
				listar(evt);
			}
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void editar(ActionEvent evt){ 
		try{
			sala = (Sala)UtilFaces.getValorParametro(evt, "sala");
			if(sala != null){
				salaServico.editar(sala);
				sala.setNumero(sala.getNumero());
				UtilFaces.addMensagemFaces("Sala editada com sucesso");
				listar(evt);
			}
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

}


