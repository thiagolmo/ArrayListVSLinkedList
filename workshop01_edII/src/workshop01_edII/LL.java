package workshop01_edII;

import java.util.Arrays;
import java.util.LinkedList;

public class LL {

	
	static LinkedList<String> animais = new LinkedList<String> ();
	
	public static void main(String[] args) {
		
        
        animais.add("cachorro");
        System.out.print( "Adicionando o animal cachorro: " );
        System.out.println( Arrays.toString( animais.toArray() ) );
        
        animais.add("gato");
        System.out.print( "Adicionando o animal gato: " );
        System.out.println( Arrays.toString( animais.toArray() ) );
        
        animais.add("coelho");
        System.out.print( "Adicionando o animal coelho: " );
        System.out.println( Arrays.toString( animais.toArray() ) );
        
        System.out.print( "Quem está na índice 0: " );
        System.out.println( animais.get(0) );
        
        System.out.print( "Adicionando peixe onde estava o cachorro: " );
        animais.add( animais.indexOf("cachorro"), "peixe");
        System.out.println( Arrays.toString( animais.toArray() ) );
        
        System.out.print( "Número de elementos na lista: " );
        System.out.println( animais.size() );
        
        System.out.print( "Buscando animal cachorro: " );
    	System.out.println(busca("peixe",animais));
        
        System.out.print( "Removendo o peixe: " );
        animais.remove("peixe");
        System.out.println( Arrays.toString( animais.toArray() ) );
        
        System.out.print( "Removendo tudo: " );
        animais.clear();
        System.out.println( Arrays.toString( animais.toArray() ) );
   
	}
	
	public static String busca(String animal,LinkedList animais){
		for(int i = 0; i<animais.size();i++){
			if(animais.get(i).equals(animal)){
				return "Localizado na posição "+i ;
			}
		}
		return "Não localizado.";
	}
	   
}
