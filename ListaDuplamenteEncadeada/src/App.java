public class App {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		lista.adicionaNoInicio("Vasco");
		lista.adicionaNoInicio("Salgueiro");
		lista.adicionaNoInicio("Heraldo");
		System.out.println("--------LISTA PARCIAL--------");
		System.out.println(lista+" e o total de elementos é: "+lista.getTotalDeElementos());
		
		/*System.out.println("\n\n");
		lista.adicionaNoInicio("TESTE");
		
		System.out.println("--------LISTA PARCIAL--------");
		System.out.println(lista);
		
		System.out.println("\n\n");
		
		lista.adiciona(1, "Salgueiro");
		System.out.println("Add salgueir na pos 1");
		System.out.println(lista+" e o total de elementos é: "+lista.getTotalDeElementos());
		
		

		
		System.out.println("\n\n");
		System.out.println("Add JUAZEIRO na pos 2");
		lista.adiciona(2, "jUAZEIRO");
		
		System.out.println(lista+" e o total de elementos é: "+lista.getTotalDeElementos());
		
		
		
		

		
		System.out.println("\n\n");
		System.out.println("Add RECIFE na pos 4");
		lista.adiciona(4, "RECIFE");
				
		System.out.println(lista+" e o total de elementos é: "+lista.getTotalDeElementos());
		System.out.println("\n\n");
		System.out.println("Removendo do inicio");
		lista.removeNoInicio(lista);
		
		System.out.println(lista);
		
		System.out.println("\n\n");
		System.out.println("Removendo de qualquer posição");
		lista.removeNoFinal("Vasco" );
		*/
		
		System.out.println("\n\n");
		System.out.println("Removendo Posição");
		lista.remove(1);
		
		System.out.println(lista);
		
		
		
		
		
				
		

	}

}