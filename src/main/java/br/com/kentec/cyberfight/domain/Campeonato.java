package br.com.kentec.cyberfight.domain;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="campeonato")
@SuppressWarnings("serial")
public class Campeonato implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="descricao", nullable = false, length = 256)
	private String descricao;
	
	@Column(name="data", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate data;
	
	@Column(name="horario", nullable = true, length = 10)
	private String horario;
	
	@Column(name="local", nullable = true, length = 128)
	private String local;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;

	public Campeonato() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Campeonato [id=" + id + ", descricao=" + descricao + ", data=" + data + ", horario=" + horario
				+ ", local=" + local + ", status=" + status + "]";
	}
}
