package br.edu.up.teste.models;

import java.util.UUID;

public class Tarefa {
    private UUID uuid;
    private String titulo;
    private String descricao;
    private String prioridade;
    private Usuario usuario;

    public Tarefa() {
    }

    public Tarefa(UUID uuid, String titulo, String descricao, String prioridade, Usuario usuario) {
        this.uuid = uuid;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.usuario = usuario;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}