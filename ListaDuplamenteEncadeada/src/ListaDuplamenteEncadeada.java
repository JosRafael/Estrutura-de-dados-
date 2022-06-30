	public class ListaDuplamenteEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private No pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inálida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public void adicionaNoInicio(Object elemento) {
        if(this.totalDeElementos == 0) {
            No novo = new No(elemento);
            this.inicio = novo;
            this.fim = novo;            
        }
        else {
            No novo = new No(elemento, this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        }
        this.totalDeElementos++;
    }
   
    public void adicionaNoFinal(Object elemento) {
        if(this.totalDeElementos == 0) {
            this.adicionaNoInicio(elemento);
        }
        else {
            No novo = new No(elemento);
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
            this.fim = novo;
            this.totalDeElementos++;
        }
    }
    
    public void adiciona(int posicao, Object elemento) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.adicionaNoInicio(elemento);
			}else {
				No anterior = this.pegaNo(posicao-1);
				No proximo = anterior.getProximo();
				No novo = new No(elemento, proximo);
				anterior.setProximo(novo);
				proximo.setAnterior(novo);
				novo.setAnterior(anterior);
								
				this.totalDeElementos++;
				
			}
		}else if(posicao == this.totalDeElementos){
			this.adicionaNoFinal(elemento);
		}else{
			System.out.println("Posição inválida!");
		}	
    }
	public void removeNoInicio(Object elemento) {
        
		
        
		if(this.totalDeElementos > 1) {
           No novoInicio = this.inicio.getProximo();
           novoInicio.setAnterior(null);
           this.inicio = this.inicio.getProximo();
        }
		else {
			this.fim = null;
			this.inicio = null;
		}
       
        this.totalDeElementos--;
        
        if(this.totalDeElementos==0) {
        	this.fim=null;
        }
    }
	public void  removeNoFinal(Object elemento ) {
			No novo = new No(elemento);
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
            this.fim = novo;
            this.totalDeElementos--;
        
    }
	public void remove(int posicao) {
		if(this.posicaoValida(posicao)) {
			No no = this.pegaNo(posicao);
			No anterior = no.getAnterior();
			No proximo = no.getProximo();
			
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.totalDeElementos--;
			
		}else {
			System.out.println("Posição inválida!");
		}
		
	}
		
	
	
    
    
	
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
		
		System.out.println("Início: "+this.inicio.getElemento());
		System.out.println("Fim: "+this.fim.getElemento());
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

	public int getTotalDeElementos() {
		return totalDeElementos;
	}

	
	
	
}
