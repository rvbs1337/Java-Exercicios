package br.edu.unicesumar;

public class Pessoa {
    private String nome;
    private Integer dataNasc;
    private Integer idade;

    public Pessoa(String novoNome, Integer novaData, Integer novaIdade){
        this.nome = novoNome;
        this.dataNasc = novaData;
        this.idade = novaIdade;
    }

    public Pessoa(String novoNome){
        this.nome = novoNome;
    }

    public Pessoa(String novoNome, Integer novaIdade){
        this.nome = novoNome;
        this.idade = novaIdade;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public Integer getDataNasc(){
        return this.dataNasc;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setDataNasc(Integer novaData){
        this.dataNasc = novaData;
    }

    public void setIdade(Integer novaIdade){
        this.idade = novaIdade;
    }
}
