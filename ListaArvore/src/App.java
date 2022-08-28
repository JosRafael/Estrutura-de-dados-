public class App {

				public static void main(String[] args) {
					ArvoresBinarias tree =  new ArvoresBinarias();

					tree.insere(1);
					tree.insere(8);
					tree.insere(4); 
					tree.insere(2);
					tree.insere(9);
					tree.insere(10);
					
					System.out.println("\nMostrando Arvore atual: ");
					tree.mostraArvore();
					
					//MOSTRANDO NUMERO DE NÓS
					System.out.println("\nNumero de nós: "+tree.numeroElementos());
					
					//MOSTRANDO NUMERO DE FOLHAS E SUAS RESPECTIVAS FOLHAS
					System.out.println("\nNúmero de folhas: " + tree.folhas());
					System.out.println("Folhas: ");tree.mostraFolhas();
			
				
					
				ArvoresBinarias tree2 = new ArvoresBinarias();
				tree2.insere(70);
				tree2.insere(36);
				tree2.insere(90);
				tree2.insere(50);
				tree2.insere(25);
				
				
				
				System.out.println("Verifica se as arvores são iguais: ") ;
				//COMPARANDO AS DUAS LISTAS
				System.out.println(tree.verificaTree(tree, tree2));
				System.out.println("\nArvore original" );
				tree.mostraArvore();
				System.out.println("\nArvore Copia" );
				tree2.mostraArvore();

			
			        
	}
}