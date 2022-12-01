package app;

import model.Agenda;
import persistencia.AgendaDAO;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AgendaDAO.getInstance().adicionarItem(new Agenda(0, "Maria", "m@m", "81999999"));
		
	}
	
}

