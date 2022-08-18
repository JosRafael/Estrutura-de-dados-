public class ArvoresBinarias {
    public No raiz;
    
    /**
     * Construtor
     */
    public ArvoresBinarias()
    {
	this.raiz = null;
    }
    
    /**
     * verifica se a arvore esta vazia
     * em caso positivo devolve true
     * caso contrario, devolve false
     */
    public boolean isEmpty()
    {
        if(raiz == null)
            return true;
        return false;
    }

	
    /**
     * busca a chave x na arvore
     *  - devolve um ponteiro para o no que possui a chave
     * ou null caso a chave nao exista
     */
    public No busca(int x)
    {
		//chama a função que faz a busca
        return buscar (this.raiz ,x);
    }
    // função que realiza a busca
    public No buscar(No raiz, int x){
        if(raiz == null){
            return null;
		}else{
            if(raiz.getChave() == x){
                return raiz;
            }else{
                if(raiz.getChave() > x){
                    return buscar (raiz.getEsq(), x);
                }else{
                    return buscar (raiz.getDir(), x);
                }
            }
        }
    }
    
    
    /**
     * insere a chave x na arvore
     */
    // chama a funcão que insere o novo elemento    
    public void insere(int x) {
        if(this.raiz == null){
            this.raiz = new No(x);
        } else {
            if (x < this.raiz.getChave()) {
                if (this.raiz.getEsq() != null) { 
                    inserir(this.raiz.getEsq(),x);
                }else{
                    this.raiz.setEsq(new No(x)); 
                } 
                //Verifica se o x a ser inserido é maior que o nó corrente da árvore, se sim vai para subarvore direita 
            }else if (x > this.raiz.getChave()) { 
                //Se tiver elemento no nó direito continua a busca 
                if (this.raiz.getDir() != null) { 
                    inserir(this.raiz.getDir(),x); 
                } else {
                    this.raiz.setDir(new No(x)); 
                } 
            }
        }
    }
    //funcão para inserir um novo elemento
    public void inserir(No raiz ,int x){
        if(raiz == null){
            raiz = new No(x);
        } else {
            if (x < raiz.getChave()) {
                if (raiz.getEsq() != null) { 
                    inserir(raiz.getEsq(),x); 
                }else{ 
                    //Se nó esquerdo vazio insere o novo no aqui 
                    raiz.setEsq(new No(x)); 
                } 
            }else if (x > raiz.getChave()) { 
                if (raiz.getDir() != null) { 
                    inserir(raiz.getDir(),x); 
                } else {
                    //Se nó direito vazio insere o novo nó aqui 
                    raiz.setDir(new No(x)); 
                } 
            }
        }
    }
    
    /**
     * remove a chave x da arvore
     */
    
    public void remove(int x){
        //chama a função para remover o Nó
		remove(this.raiz, x);
    }
    //Função que remove o Nó
    public No remove(No raiz, int x){
        if(this.raiz == null){
            System.out.println("Chave não existente na árvore!");
            return null;
        } else {            
            if(x < raiz.getChave()){
                raiz.setEsq(remove(raiz.getEsq(), x));
            } else if(x > raiz.getChave()){
                raiz.setDir(remove(raiz.getDir(), x));
            } else if (raiz.getEsq() != null && raiz.getDir() != null) {
                //2 filhos
                raiz.setChave(encontraMinimo(raiz.getDir()).getChave());
                raiz.setDir(removeMinimo(raiz.getDir()));
            } else {  
                raiz = (raiz.getEsq() != null) ? raiz.getEsq() : raiz.getDir();  
            }  
            return raiz;
        }
    }
    //funcão para excluir o minimo o menor valor
    public No removeMinimo(No raiz) {  
        if (raiz == null) {  
            System.out.println(" Erro ao excluir a chave!");  
        } else if (raiz.getEsq() != null) {  
            raiz.setEsq(removeMinimo(raiz.getEsq()));  
            return raiz;  
        } else {  
            return raiz.getDir();  
        }  
        return null;  
    }  
	//função que encontra minimo, ou seja o menor valor da esquerda
    public No encontraMinimo(No raiz) {  
        if (raiz != null) {  
            while (raiz.getEsq() != null) {  
                raiz = raiz.getEsq();  
            }  
        }  
        return raiz;  
    }
    
    /**
     * realiza um percurso na arvore. O percurso
     * a ser realizado é passado por parâmetro:
     * -1 = pre-ordem
     *  0 = ordem simetrica
     *  1 = pos-ordem
     * Visitar um no, nesses metodos, equivale a imprimir 
     * o valor de sua chave. Faca a impressao de todas as 
     * chaves em uma mesma linha, passando para uma nova 
     * linha somente apos imprimir todas as chaves.
     */
    public void visita(int p){
        //chama as funções
		if(p == 1){
            preOrdem(this.raiz);
        }else if(p == 0){
            emOrdem(this.raiz);
        }else if(p == -1){
            posOrdem(this.raiz);
		}
    }
	//função do precurso em pre-ordem
	public void preOrdem(No no) {
		if (no != null){
			System.out.println(no.getChave());
			preOrdem(no.getEsq());
			preOrdem(no.getDir());
		}
	}
	//função do precurso em em-ordem ou ordem simetrica
	public void emOrdem(No no) {
		if (no != null) {
			emOrdem(no.getEsq());
			System.out.println(no.getChave());
			emOrdem(no.getDir());
		}
	}
	//função do precurso em pos-ordem
	public void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.getEsq());
			posOrdem(no.getDir());
			System.out.println(no.getChave());
		}
	}

    
    
    /**
     * Mostra o estado atual da arvore
     * 
     */    
    public void mostraArvore() {
       if (isEmpty())
       {
		   //Tirei o acento de Arvore pois ocorreu um erro durante a compilação
          System.out.println("Arvore vazia!");          
       }
       else
       {
           String separator = String.valueOf("  |__");
           System.out.println(this.raiz.getChave() + "(RAIZ)"); 
           mostraSubArvore(raiz.getEsq(),  separator);
           mostraSubArvore(raiz.getDir(), separator);
       }
   }
    
    
    
    /**
     * Metodos auxiliares:
     * aqui voce pode criar metodos para auxiliar nas
     * operacoes acima. Na maioria dos casos, por serem
     * metodos auxiliares, esses metodos devem ser privados.
     */
    public No achaPai (int x) {
        No p = raiz;
        No prev = null;
        while (p != null && !(p.getChave()==x)) {  // acha o nó p com a chave x
            prev = p;
            if (p.getChave()<x)
                p = p.getDir();
            else 
                p = p.getEsq();
        }
        if (p!=null && p.getChave()==x) 
            return prev;
        return null;
    }  

    
   private void mostraSubArvore(No pt, String separator) {
      if (pt != null) {
         No father = this.achaPai(pt.getChave());
         if (pt.equals(father.getEsq()) == true) {
            System.out.println(separator+pt.getChave()+ " (ESQ)");
         }else{
            System.out.println(separator+pt.getChave()+" (DIR)");
         }
         mostraSubArvore(pt.getEsq(),  "     "+separator);
         mostraSubArvore(pt.getDir(), "     "+separator);
      }
   }
   
}