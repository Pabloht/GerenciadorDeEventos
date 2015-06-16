package br.com.fean.si.poo2.service;

import br.com.fean.si.poo2.dao.MinistranteDAO;
import br.com.fean.si.poo2.model.Ministrante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MinistranteService {

    private MinistranteDAO ministranteDAO = new MinistranteDAO();

    public boolean incluirMinistrante(String email, String nome, String telefone) {
        boolean retorno = false;
        Ministrante ministrante = new Ministrante(email, nome, telefone);
        try {
            ministranteDAO.incluirMinistrante(ministrante);
            retorno = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na inclusão do ministrante... " + e);
        }
        return retorno;
    }

    public boolean alterarMinistrante(Integer id, String email, String nome, String telefone) {
        boolean retorno = false;
        Ministrante ministrante = new Ministrante(id, email, nome, telefone);
        try {
            ministranteDAO.alterarMinistrante(ministrante);
            retorno = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na alteração do ministrante... " + e);
        }
        return retorno;
    }

    public void apagarMinistrante(int id) {
        try {
            ministranteDAO.apagarMinistrante(retornarMinistrante(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao apagar o ministrante... " + e);
        }
    }

    public Ministrante retornarMinistrante(int id) {
        Ministrante evento = null;
        try {
            ministranteDAO.retornarMinistrante(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no retorno do ministrante... " + e);
        }
        return evento;
    }

    public ArrayList<Ministrante> listarMinistrantes() {
        ArrayList<Ministrante> ministrantes = new ArrayList<Ministrante>();
        try {
            ministrantes = ministranteDAO.listarMinistrante();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na listagem de ministrantes... " + e);
        }
        return ministrantes;
    }
}
