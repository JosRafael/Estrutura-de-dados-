public class FilasEstaticas {
	private Object elementos[];
	private int tamanho;
	
	public FilasEstaticas(int armazenamento) {
		
		this.elementos = new Object[armazenamento];
		
		this.tamanho = 0;
		} 	
	
	//TAMANHO DA PILHA
	public int size() {		
		return this.tamanho;
		} 	 	
	//PRIMEIRO DA FILA
	public String front() {
		return "Primeira senha emitida para entrar na fila foi: " + this.elementos[0];
		} 	 	

	//VERIFICANDO SE ESTA VAZIA
	public boolean isEmpty() {
		return this.tamanho==0;
		} 	 	
	private void isFull() {
		if(this.tamanho == this.elementos.length) {
			
			Object[] elementosNovos = new Object[this.elementos.length*2];
			
			for(int i = 0; i < this.elementos.length; i++) {
				
				elementosNovos[i] = this.elementos[i];
				
			} 			this.elementos = elementosNovos;
				
		}
	} 	 	
	
	//INSERINDO NA FILA
	public boolean enqueue(Object elemento) {
		this.isFull();
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho] = elemento;
			
			this.tamanho++;
			
			return true;
			}
		return false;
			} 	 	
	//REMOVENDO DA PILHA
	
	public String dequeue() {
		
		if(this.isEmpty()) {
			
			return null;
			
		}
		int inicio = 0;
		for(int i = inicio; i<this.tamanho-1; i++) {
			
			this.elementos[i] = this.elementos[i+1];
			}
		
		this.tamanho--;
		return "Elemento está fora da fila"; 	
		}
	
	
}