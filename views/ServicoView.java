package views;

import Controllers.ServicoController;
import java.util.List;
import models.Servico;

public class ServicoView {
    private ServicoController controlador;

    public ServicoView(ServicoController controlador) {
        this.controlador = controlador;
    }

    public void exibirServicos() {
        List<Servico> servicos = controlador.listarServicos();
        for (Servico servico : servicos) {
            System.out.println("ID: " + servico.getId() + ", Tipo: " + servico.getTipo() + ", Descrição: " + servico.getDescricao() + ", Status: " + servico.getStatus() + ", Data de Agendamento: " + servico.getDataAgendamento());
        }
    }
}
