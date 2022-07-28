public class No {
	private No proximo;
	private No anterior;
	private Object elemento;
	
	public No(Object elemento, No proximo) {
		this.proximo = proximo;
		this.elemento = elemento;
	}		

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No(Object elemento) {
		this.elemento = elemento;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
}