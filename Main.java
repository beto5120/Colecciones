import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Main {
	
	public static void main(String [] args) {
		
		System.out.println("Ejemplo de uso de colecciones");
		//Listas
		List listaClientes = new ArrayList();
		//1.1
		Cliente c1 = new Cliente("Jorge Amaro", "amaro.coria@gmail.com");
		Cliente c2 = new Cliente("ALberto Fuentes", "jfuentesl@gmail.com");
		Cliente c3 = new Cliente("Carlos Loredo", "carlos.loredo@gmail.com");
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		//1.2 recorrer la lista
		//1.2.1 For normal
		for(int i = 0; i< listaClientes.size(); i++) {
			System.out.println("Cliente: "+listaClientes.get(i));
		}
		//1.2.2 foreach
		for(Object o : listaClientes) {
			Cliente c = (Cliente) o;
			System.out.println("Cliente: "+c);
		} 
		
		System.out.println("###############################");
		
		Set ClientesSet = new HashSet();
		boolean agregado;
		agregado = ClientesSet.add(c1);
		System.out.println(agregado);
		agregado = ClientesSet.add(c2);
		System.out.println(agregado);
		agregado = ClientesSet.add(c3);
		System.out.println(agregado);
		
		for(Object o : ClientesSet) {
			Cliente c = (Cliente) o;
			System.out.println("Cliente en el Set: "+c);
			
		}
		
		System.out.println("##################################");
		Map mapa = new HashMap();
		mapa.put(1, c1);
		mapa.put(2, c2);
		mapa.put(3, c3);
		Set llavesMapa = mapa.keySet();
		for(Object o : llavesMapa) {
			Object clienteDentroDeMapa = mapa.get(o);
			Cliente c = (Cliente) clienteDentroDeMapa;
			System.out.println("Cliente obtenido"+clienteDentroDeMapa);
			
		}
		
		
	}

}
