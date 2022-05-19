package nivell1;

import java.util.ArrayList;
import java.util.List;

public class AgentDeBorsa {

	
	List<AgenciesBorsa> observers = new ArrayList<AgenciesBorsa>();
	private double preuAccionsA;
	private double preuAccionsB;
	
	public double getPreuAccionsA() {
		return preuAccionsA;
	}
	public void setPreuAccionsA(double preuAccionsA) {
		this.preuAccionsA = preuAccionsA;
		notificarCanviAgencies("Canvi de preu de les accions A");
	}
	
	public double getPreuAccionsB() {
		return preuAccionsB;
	}
	public void setPreuAccionsB(double preuAccionsB) {
		this.preuAccionsB = preuAccionsB;
		notificarCanviAgencies("Canvi de preu de les accions B");
	}
	
	
	
	
	public void afegirAgenciesBorsa(AgenciesBorsa observer) {
		observers.add(observer);
	}
	
	public void notificarCanviAgencies(String notificacio) {
		for (AgenciesBorsa observer: observers) {
			observer.actualitzar(notificacio);
		}
	}
	
	
}
