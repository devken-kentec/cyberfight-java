package br.com.kentec.cyberfight.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="instrutor")
@SuppressWarnings("serial")
public class Instrutor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 100)
	private String nome;
	
	@Column(name="fone", nullable = true, length = 20)
	private String fone;
	
	@Column(name="email", nullable = true, length = 60)
	private String email;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;

	public Instrutor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Instrutor [id=" + id + ", nome=" + nome + ", fone=" + fone + ", email=" + email + ", status=" + status
				+ "]";
	}
}
