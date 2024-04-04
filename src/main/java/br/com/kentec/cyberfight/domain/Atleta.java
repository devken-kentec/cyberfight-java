package br.com.kentec.cyberfight.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="atleta")
@SuppressWarnings("serial")
public class Atleta implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 100)
	private String nome;
	
	@Column(name="cpf", nullable = true, length = 11)
	private String cpf;
	
	@Column(name="data_nascimento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataNascimento;
	
	@Column(name="sexo", nullable = true, length = 15)
	private String sexo;
	
	@Column(name="endereco", nullable = true, length = 256)
	private String endereco;
	
	@Column(name="fone", nullable = true, length = 20)
	private String fone;
	
	@Column(name="email", nullable = true, length = 60)
	private String email;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "id_instrutor", nullable = true)
	private Instrutor instrutor = new Instrutor();
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", nullable = true)
	private Categoria categoria = new Categoria();
	
	@ManyToOne
	@JoinColumn(name = "id_instituicao", nullable = true)
	private Instituicao instituicao = new Instituicao();

	public Atleta() {
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	@Override
	public String toString() {
		return "Atleta [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo
				+ ", endereco=" + endereco + ", fone=" + fone + ", email=" + email + ", status=" + status
				+ ", instrutor=" + instrutor + ", categoria=" + categoria + ", instituicao=" + instituicao + "]";
	}
}
