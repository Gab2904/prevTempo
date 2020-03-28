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
<<<<<<< HEAD
<<<<<<< HEAD
	private int umidade;
	private String dataHora;
	private String latitude;
	private String longitude;
=======
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b
=======
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b
	
	
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
<<<<<<< HEAD
<<<<<<< HEAD
	public int getUmidade() {
		return umidade;
	}
	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
=======
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b
=======
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b
}
