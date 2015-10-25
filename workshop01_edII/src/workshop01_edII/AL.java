package workshop01_edII;

import java.util.ArrayList;
import java.util.Arrays;

public class AL {
	
	static ArrayList<String> animais = new ArrayList<String> ();
	
	public static void main(String[] args) {
		
        
        animais.add("cachorro");
        System.out.print( "Adicionando o animal cachorro: " );
        System.out.println( Arrays.toString( animais.toArray() ) ); //método do ArrayList chamado 'toArray()' que coloca todos os elementos de um ArrayList em um Array.
        
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
	
	public static String busca(String animal,ArrayList animais){
		for(int i = 0; i<animais.size();i++){
			if(animais.get(i).equals(animal)){
				return "Localizado na posição "+i ;
			}
		}
		return "Não localizado.";
	}
	   
}
        
       
