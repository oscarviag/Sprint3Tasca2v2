package nivell2;

import java.lang.reflect.InvocationTargetException;

public class Sabateria {
	
	String tipus_pagament;
	
	public Sabateria(String tipus_pagament) {
		super();
		this.tipus_pagament = tipus_pagament;
	}

	public void pagament(Passarella pagament)  {
			
		pagament.tipus_pagament();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Sabateria venda = new Sabateria("Compte");
		
		Class<?> obj = Class.forName("nivell2."+venda.tipus_pagament);
		
		Passarella pagament_passarella = (Passarella) obj.getDeclaredConstructor().newInstance();
		
		venda.pagament(pagament_passarella);		


	}


}
