package view;

import controller.VetNegativoControll;

public class Main {

	public static void main(String[] args) 
	{
		int[] vet = {-26, 4, -32, -25, -23};
		
		VetNegativoControll numN = new VetNegativoControll();
		
		System.out.println(numN.contaNegativo(vet, vet.length - 1)); //entrada dos valores
		
		
		
		
	}
	

}
