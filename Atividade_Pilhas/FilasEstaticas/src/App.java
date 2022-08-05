
public class App {

	public static void main(String[] args) {
		FilasEstaticas fila = new FilasEstaticas(4);
		
		//ADICIONANDO
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		
		//VERIFICANDO PRIMEIRO ELEMENTO DA PILHA
		System.out.println(fila.front());
		
		//VERIFICANDO O TAMANHO DA PILHA
		System.out.println("\nO tamanho da fila é : " + fila.size());
		
		//REMOVENDO ELEMENTOS
		System.out.println("\nRemovendo elementos...");
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		System.out.println("Após a remoção, a pilha contém quantos elementos? "+ fila.size());
		
		//VERIFICANDO SE A LISTA ESTÁ OU NAO VAZIA
		System.out.println("\nA lista está vazia ?" + fila.isEmpty());
		
		
		
		
		

	}

}
