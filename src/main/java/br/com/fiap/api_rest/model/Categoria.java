package br.com.fiap.api_rest.model;

public enum Categoria {
    ROMANCE("Romance"),
    FICCAO ("Ficção"),
    FANTASIA ("Fantasia");
    private String descrição;

    Categoria(String descrição) {
        this.descrição = descrição;
    }
    public String getDescrição(){
        return descrição;
    }
}
