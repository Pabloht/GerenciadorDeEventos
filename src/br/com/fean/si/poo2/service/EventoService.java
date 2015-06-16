package br.com.fean.si.poo2.service;

import br.com.fean.si.poo2.dao.EventoDAO;
import br.com.fean.si.poo2.model.Evento;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class EventoService {

    private EventoDAO eventoDAO = new EventoDAO();

    public boolean incluirEvento(String nome, String local, Date dataInicio, Date dataFim) {
        boolean retorno = false;
        Evento evento = new Evento(dataInicio, dataFim, local, nome);
        try {
            eventoDAO.incluirEvento(evento);
            retorno = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na inclusão do evento... " + e);
        }
        return retorno;
    }

    public boolean alterarEvento(Integer id, String nome, String local, Date dataInicio, Date dataFim) {
        boolean retorno = false;
        Evento evento = new Evento(id, dataInicio, dataFim, local, nome);
        try {
            eventoDAO.alterarEvento(evento);
            retorno = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na alteração do evento... " + e);
        }
        return retorno;
    }

    public void apagarEvento(int id) {
        try {
            eventoDAO.apagarEvento(retornarEvento(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao apagar o evento... " + e);
        }
    }

    public Evento retornarEvento(int id) {
        Evento evento = null;
        try {
            eventoDAO.retornarEvento(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no retorno do evento... " + e);
        }
        return evento;
    }

    public ArrayList<Evento> listarEventos() {
        ArrayList<Evento> eventos = new ArrayList<Evento>();
        try {
            eventos = eventoDAO.listarEventos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na listagem de eventos... " + e);
        }
        return eventos;
    }
}
