package persistencia;

import model.Agenda;

public interface IPersistencia {

	
	public void adicionarItem(Agenda a);
	
	public Agenda localizarItem(String email);
	
	public void removerItem(Agenda a);
	
	public void atualizarItem(Agenda a);
	
}
