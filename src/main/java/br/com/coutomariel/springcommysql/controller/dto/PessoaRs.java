package br.com.coutomariel.springcommysql.controller.dto;

import br.com.coutomariel.springcommysql.model.Pessoa;

public class PessoaRs {
    private Long id;
    private String nome;
    private String sobreNome;

    public static PessoaRs converter(Pessoa p){
        var pessoa = new PessoaRs();
        pessoa.setId(p.getId());
        pessoa.setNome(p.getNome());
        pessoa.setSobreNome(p.getSobreNome());
        return pessoa;
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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
