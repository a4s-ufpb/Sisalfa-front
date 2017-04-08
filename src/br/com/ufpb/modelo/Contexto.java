package br.com.ufpb.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contexto") 
public class Contexto extends AbstractEntity {
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String imagem;
	@Column(nullable = false)
	private String som;
	@Column(nullable = false) 
	private String video;
	@JoinColumn(nullable=false)
	@OneToOne(cascade={CascadeType.PERSIST},fetch=FetchType.LAZY)
	private Usuario usuario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
