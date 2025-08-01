package br.com.jkalango.dto;
public class Criador{
    private String nome;
    private String email;
    private Int telefone;
    private String perfil;

    public Criador(String nome, String email, Int telefone, String perfil) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Int getTelefone() {
        return telefone;
    }

    public void setTelefone(Int telefone) {
        this.telefone = telefone;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    


}