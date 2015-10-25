package teste;

import java.util.ArrayList;
import java.util.LinkedList;

public class testeAlLl {
	static ArrayList numeroA = new ArrayList ();
	static LinkedList numeroL = new LinkedList ();
	
	
	public static void main(String[] args) {

	adicionarArrayList();
	adicionarLinkedList();
	removeArrayList();
	removeLinkedList();
	getArrayList();
	getLinkedList();
	 
	}
	
	public static void adicionarArrayList(){
		long start = System.currentTimeMillis();  
		for (int i=0;i<10000000;i++){
			numeroA.add(i);
			}
		long elapsed = System.currentTimeMillis();
		System.out.printf("Adicionar ArrayList %.3f ms%n", (elapsed - start) / 1000d); 
		}
	
	public static void removeArrayList(){
		long start = System.currentTimeMillis();  
		for (int i=0;i<1000;i++){
			numeroA.remove(i);
			}
		long elapsed = System.currentTimeMillis();
		System.out.printf("Remover ArrayList %.3f ms%n", (elapsed - start) / 1000d); 
		}
	
	public static void getArrayList(){
		long start = System.currentTimeMillis();  
		for (int i=0;i<100000;i++){
			numeroA.get(i);
			}
		long elapsed = System.currentTimeMillis();
		System.out.printf("Get ArrayList %.3f ms%n", (elapsed - start) / 1000d); 
		}
	
	public static void adicionarLinkedList(){
		long start = System.currentTimeMillis();  
			for (int i=0;i<10000000;i++){
			numeroL.add(i);
			}
		long elapsed = System.currentTimeMillis();
		System.out.printf("Adicionar LinkedList %.3f ms%n", (elapsed - start) / 1000d); 
		
	}
	public static void removeLinkedList(){
		long start = System.currentTimeMillis();  
			for (int i=0;i<1000;i++){
			numeroL.remove(i);
			}
		long elapsed = System.currentTimeMillis();
		System.out.printf("Remover LinkedList %.3f ms%n", (elapsed - start) / 1000d); 
		
	}
	
	public static void getLinkedList(){
		long start = System.currentTimeMillis();  
			for (int i=0;i<100000;i++){
			numeroL.get(i);
			}
		long elapsed = System.currentTimeMillis();
		System.out.printf("Get LinkedList %.3f ms%n", (elapsed - start) / 1000d); 
		
	}
}
