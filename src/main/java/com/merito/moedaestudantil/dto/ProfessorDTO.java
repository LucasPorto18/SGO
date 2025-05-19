package com.merito.moedaestudantil.dto;

public class ProfessorDTO {
    public String nome;
    public String cpf;
    public String departamento;
    public String senha;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}