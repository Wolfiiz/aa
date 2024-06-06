package views;

import Controllers.CidadaoController;
import java.util.List;
import models.Cidadao;

public class CidadaoView {
    private  CidadaoController controlador;

    public CidadaoView(CidadaoController controlador) {
        this.controlador = controlador;
    }

    public CidadaoView() {
    }

    public void exibirCidadaos() {
        List<Cidadao> cidadaos = controlador.listarCidadaos();
        for (Cidadao cidadao : cidadaos) {
            System.out.println("ID: " + cidadao.getId() + ", Nome: " + cidadao.getNome() + ", Email: " + cidadao.getEmail());
        }
    }

    public CidadaoController getControlador() {
        return controlador;
    }
}
