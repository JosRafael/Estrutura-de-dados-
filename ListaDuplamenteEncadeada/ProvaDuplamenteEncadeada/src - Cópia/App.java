public class App {

	public static void main(String[] args) {
		
		ListaDuplaEncadeada lista = new ListaDuplaEncadeada();
		
		System.out.println("--------LISTA DUPLA ENCADEADA--------");
		
		lista.adicionaNoFinal("1");
		lista.adicionaNoFinal("2");
		lista.adicionaNoFinal("3");
		lista.adicionaNoFinal("4");
		lista.adicionaNoFinal("5");
		lista.adicionaNoFinal("6");
		
		
		//1-Questao
		System.out.println("\n1-Maior Número");
		lista.encontraNesimo(2);
		
		
		//2-Questão
		
		System.out.println("\n2-Lista Dividida");
		lista.divideLista(2);
		System.out.println(lista);
					
	
	}

}