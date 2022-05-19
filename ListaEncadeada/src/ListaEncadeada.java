public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;

	
	//PARA ADICIONAR ELEMENTOS NO INICIO DA LISTA.
	public void adicionaNoInicio(Object elemento) {
		No novo = new No(elemento, this.inicio);
		this.inicio = novo;
		if(this.totalDeElementos == 0) {
			this.fim = novo;
		}
		this.totalDeElementos++;
	}
	
	//PARA ADICIONAR ELEMENTOS NO FIM DA LISTA.
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoInicio(elemento);
		}
		else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			this.fim = novo;
			this.totalDeElementos ++;
		}
	}

	/*@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", fim=" + fim.getElemento() + ", totalDeElementos=" + totalDeElementos + "]";
	}
	*/
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = this.inicio;
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}
	
	//VERIFICANDO SE A POSIÇÃO É VÁLIDA
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	private No pegaNo(int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	//ADICIONANDO ELEMENTO A LISTA ESCOLHENDO POSIÇÃO E VALOR 
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoInicio(elemento);
		}
		else if(posicao == this.totalDeElementos - 1) {
			this.adicionaNoFinal(elemento);
		}
		else {
			No anterior = this.pegaNo(posicao-1);
			No novo = new No(elemento, anterior.getProximo());
			anterior.setProximo(novo);
			this.totalDeElementos++;
		}
	}
	//PEGA NO
	public Object pega(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}
	//REMOVENDO ELEMENTO DO INICIO
	public void removeDoInicio() {
		this.inicio = this.inicio.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos==0) {
			this.fim = null;
		
		}
	}
	//REMOVENDO ELEMENTO DO FINAL
	public void removeDoFinal() {
		if(this.totalDeElementos==0) {
			System.out.println("Lista está vazia, Impossivel remover elemento!");
		}else {
			No anterior = this.pegaNo(this.totalDeElementos-1);
			anterior.setProximo(null);
			this.fim = anterior;
			this.totalDeElementos--;
		}
	}
	
	
}