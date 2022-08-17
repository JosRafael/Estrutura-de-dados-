import java.util.LinkedList;
import java.util.Scanner;

public class App {

	 public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
	        String comando;
	        String cmd[];        
	                
	        ArvoresBinarias tree = new ArvoresBinarias();
	        comando = teclado.nextLine();
	        
	        // inicio do laco principal
	        while(comando.compareToIgnoreCase("sair")!=0)
	        {
	            cmd = comando.split(" ");
	            if(cmd[0].compareToIgnoreCase("inserir")==0)
	            {
	                tree.insere(Integer.parseInt(cmd[1]));
	            }
	            else
	            {
	                if(cmd[0].compareToIgnoreCase("remover")==0)
	                {
	                    tree.remove(Integer.parseInt(cmd[1]));
	                }
	                else
	                {
	                    if(cmd[0].compareToIgnoreCase("buscar")==0)
	                    {
	                        No resp = tree.busca(Integer.parseInt(cmd[1]));
	                        
	                        // verifica se a busca retornou um no valido
	                        if(resp == null)
	                            System.out.printf("Chave nao encontrada!\n");
	                        else
	                            System.out.printf("Chave encontrada!\n");
	                    }
	                    else
	                    {
	                        if(cmd[0].compareToIgnoreCase("visitar")==0)
	                        {
	                            tree.visita(Integer.parseInt(cmd[1]));
	                        }
	                        else
	                        {
	                            if(cmd[0].compareToIgnoreCase("imprimir")==0)
	                                tree.mostraArvore();
	                        }
	                    }
	                }
	            }
	            comando = teclado.nextLine();
	        }
	    }
	}