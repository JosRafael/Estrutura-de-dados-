public class Fila {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	//CRIA A FILA
	public Fila() {
		this.inicio = null;
		this.fim = null;
		this.totalDeElementos = 0;
	}
	
	//ENFILEIRAR - INSERIR
	public void enqueue(Object elemento) {
		No novo = new No(elemento);
		if(this.isEmpty()) {
			this.inicio = novo;
		}else {
			this.fim.setProximo(novo);
		}
		this.fim = novo;
		this.totalDeElementos++;
	}
	//DESENFILEIRAR - REMOVER
	public void dequeue() {
		if(!this.isEmpty()) {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
			if(totalDeElementos == 0) this.fim = null;
		}		
	}
	
	//VERIFICA SE É VAZIA
	public boolean isEmpty() {
		return this.totalDeElementos==0;
	}
	
	//TAMANHO DA LISTA
	public int size() {
		return this.totalDeElementos;
	}
	
	//PRIMEIRO DA FILA
	public Object front() {
		return this.inicio.getElemento();
	}	
	
	//TOSTRING - IMPRIMIR
	 @Override
		public String toString() {
			if(this.totalDeElementos==0) {
				return "[]";
			}
			StringBuilder builder = new StringBuilder("[");
			No atual = this.inicio;
			for(int i=0; i<this.totalDeElementos-1; i++) {
				builder.append(atual.getElemento());
				builder.append(", ");
				atual = atual.getProximo();
			}
			builder.append(atual.getElemento());
			builder.append("]");
			
			//System.out.println("Início: "+this.inicio.getElemento());
			//System.out.println("Fim: "+this.fim.getElemento());
			return builder.toString();
		}
	
	public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getFim() {
		return fim;
	}
	public void setFim(No fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return totalDeElementos;
	}
	public void setTamanho(int tamanho) {
		this.totalDeElementos = tamanho;
	}
	
}