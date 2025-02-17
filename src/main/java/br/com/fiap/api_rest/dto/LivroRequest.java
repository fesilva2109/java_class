package br.com.fiap.api_rest.dto;

public class LivroRequest {
    private String titulo;
    private String autor;

    public LivroRequest() {
    }

    public LivroRequest(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
