package br.com.ambientinformatica.primefaces.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Sala {
	
	@Id
	@GeneratedValue(generator="sala_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="sala_seq", sequenceName="sala_seq", allocationSize=1, initialValue=1)
	private Integer idSala;
	
	private String numero;
	
	private long quantidadeDeLugares;
	
	@OneToMany(
			mappedBy = "fkSala",
			cascade = CascadeType.REMOVE, 
			orphanRemoval = true,
			targetEntity = Secao.class,
			fetch = FetchType.LAZY) 
	private List<Secao> secoes;
	
//	private String quantidadeDeLugares;

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public long getQuantidadeDeLugares() {
		return quantidadeDeLugares;
	}

	public void setQuantidadeDeLugares(long quantidadeDeLugares) {
		this.quantidadeDeLugares = quantidadeDeLugares;
	}

	public List<Secao> getSecoes() {
		return secoes;
	}

	public void setSecoes(List<Secao> secoes) {
		this.secoes = secoes;
	}
	
}
