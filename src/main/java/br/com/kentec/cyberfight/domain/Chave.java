package br.com.kentec.cyberfight.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="chave")
@SuppressWarnings("serial")
public class Chave implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_atleta", nullable = false)
	private Atleta atleta = new Atleta();
	
	@ManyToOne
	@JoinColumn(name = "id_campeonato", nullable = false)
	private Campeonato campeonato = new Campeonato();
	
	@Column(name="posicao", nullable = true, length = 10)
	private String posicao;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;

	public Chave() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Chave [id=" + id + ", atleta=" + atleta + ", campeonato=" + campeonato + ", posicao=" + posicao
				+ ", status=" + status + "]";
	}
}
