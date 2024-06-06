package views;

import Controllers.FuncionarioController;
import java.util.List;
import models.Funcionario;

public class FuncionarioView {
    private FuncionarioController controlador;

    public FuncionarioView(FuncionarioController controlador) {
        this.controlador = controlador;
    }

    public void exibirFuncionarios() {
        List<Funcionario> funcionarios = controlador.listarFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", Email: " + funcionario.getEmail() + ", Função: " + funcionario.getFuncao() + ", Status: " + funcionario.getStatus());
        }
    }
}
