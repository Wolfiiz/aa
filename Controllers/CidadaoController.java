package Controllers;

import java.util.ArrayList;
import java.util.List;
import models.Cidadao;

public class CidadaoController {
    private List<Cidadao> cidadao;

    public CidadaoController() {
        this.cidadao = new ArrayList<>();
    }

    public Cidadao adicionarCidadao(int id, String nome, String email, String senha) {
        Cidadao cidadao = new Cidadao(id, nome, email, senha);
        this.cidadao.add(cidadao);
        return cidadao;
    }

    public List<Cidadao> listarCidadaos() {
        return this.cidadao;
    }
}
