package sistemaJogoGuerreiro;

//Aqui nós importamos as bibliotecas responsáveis por ler e guardar dados inseridos pelo usuário

import java.util.ArrayList;
import java.util.Scanner;

import sistemaJogoGuerreiro.business.ArqueiroBusiness;
import sistemaJogoGuerreiro.business.EspadachimBusiness;
import sistemaJogoGuerreiro.business.MagoBusiness;
import sistemaJogoGuerreiro.business.TemplarioBusiness;
import sistemaJogoGuerreiro.business.ValquiriaBusiness;

public class App {

	// Declaramos o método principal onde as operações serão realizadas
	public static void main(String[] args) {
		
		// Criação de objetos
		Scanner scanner = new Scanner(System.in);
		
		// Variáveis globais
		String nome;
		int forca;
		int vidas;
		
		// ArrayLists para armazenar as informações inseridas pelo usuário
        ArrayList<Arqueiro> listaArqueiro = new ArrayList<Arqueiro>();
        ArrayList<Espadachim> listaEspadachim = new ArrayList<Espadachim>();
        ArrayList<Mago> listaMago = new ArrayList<Mago>();
        ArrayList<Valquiria> listaValquiria = new ArrayList<Valquiria>();
        ArrayList<Templario> listaTemplario = new ArrayList<Templario>();
        
        // Aqui o objeto "menu" está chamando o método "mostrarMenu()"
        
        Menu.mostrarMenu();
        
        int opcao = scanner.nextInt();
        
        while (opcao != 0) {
            switch (opcao) {
            case 1:
                EspadachimBusiness espadachimBusiness = new EspadachimBusiness();
                listaEspadachim.add(espadachimBusiness.cadastrarEspadachim());
                break;
                
            case 2:
            	ArqueiroBusiness arqueiroBusiness =  new ArqueiroBusiness();
            	listaArqueiro.add(arqueiroBusiness.cadastrarArqueiro());
                break;

            case 3:
                MagoBusiness magoBusiness = new MagoBusiness();
                listaMago.add(magoBusiness.cadastrarMago());
                break;
                
            case 4:
                ValquiriaBusiness valquiriaBusiness = new ValquiriaBusiness();
                listaValquiria.add(valquiriaBusiness.cadastrarValquiria());
                break;
                
            case 5:
                TemplarioBusiness templarioBusiness = new TemplarioBusiness();
                listaTemplario.add(templarioBusiness.cadastrarTemplario());
                break;
                
            case 6:
                System.out.println("Lista de Espadachins: ");
                System.out.println(listaEspadachim.toString());
                break;
                
            case 7:
            	System.out.println("Lista de Arqueiros: ");
            	System.out.println(listaArqueiro.toString());
            	break;
            	
            case 8:
            	System.out.println("Lista de Magos: ");
            	System.out.println(listaMago.toString());
            	break;
            	
            case 9:
            	System.out.println("Lista de Valquírias: ");
            	System.out.println(listaValquiria.toString());
            	break;
            	
            case 10:
            	System.out.println("Lista de Templários: ");
            	System.out.println(listaTemplario.toString());
            	break;
                
            default:
				
				//Opção padrão caso o valor inserido seja diferente de 0, 1 ou 2
				System.out.println("\nOpção Inválida!");
				
				break;
			}
			
			// Para que o menu permaneça aparecendo e novas opções sejam selecionadas, nós chamamos o menu novamente e pedimos uma opção do usuário
			Menu.mostrarMenu();
			opcao = scanner.nextInt();
			
		}
		
		// Quando 0 for selecionado essa mensagem será impressa informando o fim da execução do programa
		System.out.println("\nPrograma Encerrado!");
		
	}
	
}
