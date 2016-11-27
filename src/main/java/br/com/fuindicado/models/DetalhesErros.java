package br.com.fuindicado.models;

public class DetalhesErros {
	
private String titulo;
	
	private String developerMessage;
	
	private Long status;
	
	private Long timestamp;
	
	public DetalhesErros() {}

	public DetalhesErros(String titulo, String developerMessage, Long status, Long timestamp) {
		this.titulo = titulo;
		this.developerMessage = developerMessage;
		this.status = status;
		this.timestamp = timestamp;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
