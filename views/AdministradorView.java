package views;
import Controllers.AdministradorController;
import java.util.List;
import models.Administrador;

public class AdministradorView {
    private AdministradorController administradorController;

    public AdministradorView(AdministradorController administradorController) {
        this.administradorController = administradorController;
    }

    public void exibirAdministradores(List<Administrador> administradores) { // Corrija o parâmetro para List<Administrador>
        System.out.println("Administradores:");
        for (Administrador administrador : administradores) {
            System.out.println(administrador);
        }
    }
}
