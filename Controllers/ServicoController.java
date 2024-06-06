package Controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import models.Servico;

public class ServicoController {
    private List<Servico> servicos;

    public ServicoController() {
        this.servicos = new ArrayList<>();
    }

    public Servico adicionarServico(int id, String tipo, String descricao, String status, LocalDate dataAgendamento) {
        Servico servico = new Servico(id, tipo, descricao, status, dataAgendamento);
        this.servicos.add(servico);
        return servico;
    }

    public List<Servico> listarServicos() {
        return this.servicos;
    }
}
