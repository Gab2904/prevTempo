package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperatura implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nomeSemana;
	private Double tempMin;
	private Double tempMax;
	private String descricao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeSemana() {
		return nomeSemana;
	}
	public void setNome(String nomeSemana) {
		this.nomeSemana = nomeSemana;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
