package AAAulaExercicio1;

import java.util.ArrayList;

public class Cadastro {
	

	public static void main(String[] args) {
		
		ArrayList<Usuario> cadastra = new ArrayList<>();
		
		Usuario cadastra1 = new Usuario("Ferraz", 37, 1.79);
		Usuario cadastra2 = new Usuario("Bruno", 50, 1.75);
		
		cadastra.add(cadastra1);
		cadastra.add(cadastra2);
		
		for(Usuario c : cadastra) {
			System.out.println(c);
			
		}
		
	}
	
}









			