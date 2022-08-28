public class ArvoresBinarias {
    public No raiz;
    
    public ArvoresBinarias()
    {
	raiz = null;
    }
    public boolean isEmpty()
    {
        if(raiz == null)
            return true;
        return false;
    }

   
    
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
   
    //função para mostrar as folhas
	public void mostraFolhas() {
		encontraFolhas(raiz);
	}

	private void encontraFolhas(No raiz) {
		
		if (raiz == null)
			return;
		else if ((raiz.getEsq() == null) && (raiz.getDir() == null))
			System.out.println(raiz.getChave());
		encontraFolhas(raiz.getEsq());
		encontraFolhas(raiz.getDir());
	}
	  
	public int folhas() {
        return folhas(this.raiz);
    }
	//função para contar as folhas
    private int folhas(No raiz) {
        //contador
    	int cont = 0;
        if (raiz == null) {
            return cont;
        }
        else if (raiz.getEsq() == null && raiz.getDir() == null)
            return 1;
        
        return folhas(raiz.getEsq()) + folhas(raiz.getDir());
      
}
    public static boolean verificaTree(No tree, No tree2)
    {
        // se ambas as árvores estiverem vazias, retorna true
        if (tree == null && tree2 == null) {
            return true;
        }
  
        // se ambas as árvores não estiverem vazias e o valor de seu nó raiz corresponder,
        //recorre para sua subárvore esquerda e direita
        return (tree != null && tree2 != null) && (tree.getChave() == tree2.getChave()) &&
        		verificaTree(tree.getEsq(), tree2.getEsq()) &&
        		verificaTree(tree.getDir(), tree2.getDir());
    }

    
	// Contar quantos elementos existe na árvore
	public int numeroElementos() {
        return numeroElementos(raiz);
    }

    private int numeroElementos(No raiz) {
        if(raiz == null)
            return 0;
        else
        return 1 + numeroElementos(raiz.getEsq()) + numeroElementos(raiz.getDir());
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
    
    private No achaPai (int x) {
        No p = raiz;
        No pre= null;
        while (p != null && !(p.getChave()==x)) {  // acha o nó p com a chave x
            pre = p;
            if (p.getChave()<x)
                p = p.getDir();
            else 
                p = p.getEsq();
        }
        if (p!=null && p.getChave()==x) 
            return pre;
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