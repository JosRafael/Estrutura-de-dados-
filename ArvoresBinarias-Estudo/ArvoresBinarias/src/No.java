public class No {
    private int chave;  //chave
    private No esq;     // ponteiro para o filho esquerdo
    private No dir;     // ponteiro para o filho direito
    
    /**
     * Construtor que recebe a nova chave por parametro     
     */
    public No(int chave)
    {
        this.chave = chave;
        this.esq = null;
        this.dir = null;
    }
    
            
    /**
     * Setters e Getters
     */
    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getChave() {
        return chave;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public No getDir() {
        return dir;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getEsq() {
        return esq;
    } 
}