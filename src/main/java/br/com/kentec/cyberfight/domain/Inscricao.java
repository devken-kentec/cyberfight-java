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
@Table(name="inscricao")
@SuppressWarnings("serial")
public class Inscricao implements Serializable {
	
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
	
	@Column(name="status_pagamento", nullable = true, length = 16)
	private String statusPagamento;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;

	public Inscricao() {
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

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Inscricao [id=" + id + ", atleta=" + atleta + ", campeonato=" + campeonato + ", statusPagamento="
				+ statusPagamento + ", status=" + status + "]";
	}
}	
