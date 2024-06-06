package models;

public class Funcionario extends Usuario {
    private String funcao;
    private String status;

    public Funcionario(int id, String nome, String email, String senha, String funcao, String status) {
        super(id, nome, email, senha);
        this.funcao = funcao;
        this.status = status;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getStatus() {
        return status;
    }
}
