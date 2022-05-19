package nivell1;

public class Execucio {

	public static void main(String[] args) {
		
		AgentDeBorsa agent = new AgentDeBorsa();
		
		AgenciaA agenciaA1 = new AgenciaA(agent);
		AgenciaA agenciaA2 = new AgenciaA(agent);
		AgenciaB agenciaB = new AgenciaB(agent);
		AgenciaC agenciaC = new AgenciaC(agent);
		
		System.out.println("Mirem que s'han subscrit les agencies");
		for (AgenciesBorsa observer: agent.observers) {
			System.out.println(observer);
		}
		
		System.out.println("\nCanviem el preu de les accions");
		agent.setPreuAccionsA(10.2);
		
		System.out.println();
		agent.setPreuAccionsB(13.2);
		
	}

}
