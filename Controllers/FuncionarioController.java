package Controllers;

import models.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        this.funcionarios = new ArrayList<>();
    }

    public Funcionario adicionarFuncionario(int id, String nome, String email, String senha, String funcao, String status) {
        Funcionario funcionario = new Funcionario(id, nome, email, senha, funcao, status);
        this.funcionarios.add(funcionario);
        return funcionario;
    }

    public List<Funcionario> listarFuncionarios() {
        return this.funcionarios;
    }
}
