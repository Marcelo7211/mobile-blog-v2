package com.generation.blogpessoal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Valor não pode ser em branco ou nulo.")
	@Size(max = 60, message = "Quantidade de caracteres permitido é 60.")
	private String titulo;
	
	@NotBlank(message = "Valor não pode ser em branco ou nulo")
	@Size(max = 1000, message = "Quantidade de caracteres permitido é 1000.")
	private String descricao;
	
	@Size(max = 10000, message = "Quantidade de caracteres permitido é 10000.")
	private String imagem;
	
	@UpdateTimestamp
	private LocalDate dataHora;
	
	@NotBlank(message = "Valor não pode ser em branco ou nulo")
	@Size(max = 90, message = "Quantidade de caracteres permitido é 1000.")
	private String autor;
	
	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Tema tema;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public LocalDate getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
}
