package br.com.ambientinformatica.primefaces.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Secao {

	@Id
	@GeneratedValue(generator="secao_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="secao_seq", sequenceName="secao_seq", allocationSize=1, initialValue=1)
	private Integer idSecao;
	
	private String horaDeInicio;
	
	@ManyToOne
	private Sala fkSala;
	
//	@ManyToOne
//	private Filme fkFilme;
//	
//	@OneToMany(
//			mappedBy = "fkSecao",
//			cascade = CascadeType.REMOVE, 
//			orphanRemoval = true,
//			targetEntity = Ingresso.class,
//			fetch = FetchType.LAZY) 
//	private List<Ingresso> ingressos;
	
	public Integer getIdSecao() {
		return idSecao;
	}

	public void setIdSecao(Integer idSecao) {
		this.idSecao = idSecao;
	}

	public String getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public Sala getFkSala() {
		return fkSala;
	}

	public void setFkSala(Sala fkSala) {
		this.fkSala = fkSala;
	}

//	public Filme getFkFilme() {
//		return fkFilme;
//	}
//
//	public void setFkFilme(Filme fkFilme) {
//		this.fkFilme = fkFilme;
//	}
//
//	public List<Ingresso> getIngressos() {
//		return ingressos;
//	}
//
//	public void setIngressos(List<Ingresso> ingressos) {
//		this.ingressos = ingressos;
//	}
	
}
