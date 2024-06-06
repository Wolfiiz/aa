package models;

import java.time.LocalDate;

public class Relatorio {
    private int id;
    private String tipo;
    private String descricao;
    private LocalDate dataCriacao;
    private int idUsuario;

    public Relatorio(int id, String tipo, String descricao, LocalDate dataCriacao, int idUsuario) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
