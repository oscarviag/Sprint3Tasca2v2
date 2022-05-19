package nivell1;

public class AgenciaB extends AgenciesBorsa{

	public AgenciaB(AgentDeBorsa agent) {
		this.agent = agent;
		this.agent.afegirAgenciesBorsa(this);
	}
	
	@Override
	public void actualitzar(String notificacio) {
		
		System.out.println (notificacio + " : Canvi del preu de les accions notificat a l'Agencia B");
	}

}
