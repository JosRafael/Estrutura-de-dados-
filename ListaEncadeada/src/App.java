public class App {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//ADICIONANDO ELEMENTOS NO INICIO DA LISTA.
		lista.adicionaNoInicio("SALGUEIRO");
		System.out.println(lista);
		lista.adicionaNoInicio("CABROB�");
		System.out.println(lista);
		
		//ADICIONANDO ELEMENTOS NO FIM DA LISTA.
		lista.adicionaNoFinal("PETROLINA");
		System.out.println(lista);
		
		//ADICIONANDO UM VALOR EM UMA DETERMINANDA POSI��O
		lista.adiciona(2, "RECIFE");
		System.out.println(lista);
		
	    //VERIFICANDO A POSI��O DESEJADA
		System.out.println("\nVerificando a pos 1: "+lista.pega(1));
		
		//REMOVENDO ITEM DA LISTA
		System.out.println("\nRemovendo o primeiro elemento.. ");
		lista.removeDoInicio();
		System.out.println(lista);
		
		//REMOVENDO DO FINAL
		System.out.println("\nRemovendo o elemento final.. ");
		lista.removeDoFinal();
		System.out.println(lista);
		
	
	}
}