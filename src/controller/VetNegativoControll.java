package controller;

public class VetNegativoControll 
{
	public VetNegativoControll()
	{
		super();
	}
	
	public int contaNegativo(int[] vet, int tamanho)
	{
		
		if(tamanho == 0) //termino da recursiva
		{
			return vet[tamanho] < 0 ? 1 : 0; //caso seja negativo ele retorna 1, caso nao, retorna 0
		}
		int contaNeg = contaNegativo(vet, tamanho - 1); //contador de negativo
		
		return vet[tamanho] < 0 ? contaNeg + 1 : contaNeg; //retorna a soma da quantidade de negativo
	}
}
