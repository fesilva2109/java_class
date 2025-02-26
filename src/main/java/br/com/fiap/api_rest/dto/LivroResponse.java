package br.com.fiap.api_rest.dto;

import org.springframework.hateoas.Link;

public class LivroResponse {
    private String infoLivro;
    private Link link;

    public LivroResponse() {
    }

    public LivroResponse(String infoLivro) {
        this.infoLivro = infoLivro;

    }
    public String getInfoLivro() {
        return infoLivro;
    }

    public void setInfoLivro(String infoLivro) {
        this.infoLivro = infoLivro;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }


}
