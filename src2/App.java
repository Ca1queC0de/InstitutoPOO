package sistemaJogoGuerreiro;

//Aqui nós importamos as bibliotecas responsáveis por ler e guardar dados inseridos pelo usuário

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	// Declaramos o método principal onde as operações serão realizadas
	public static void main(String[] args) {
		
		// Criação de objetos
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		
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
        menu.mostrarMenu();
        
        int opcao = scanner.nextInt();
        
        while (opcao != 0) {
            switch (opcao) {
            case 1:
                
                System.out.println("\nCriando Espadachim...\n");
                System.out.print("Nome do Espadachim: ");
                nome = scanner.next();
                System.out.print("Força: ");
                forca = scanner.nextInt();
                System.out.print("Vida: ");
                vidas = scanner.nextInt();
                System.out.print("Habilidade com espadas: ");
                int habilidadeEspadas = scanner.nextInt();
                System.out.print("Velocidade: ");
                int velocidade = scanner.nextInt();
                
                Espadachim espadachim = new Espadachim(nome, vidas);
                
                espadachim.setForca(forca);
                espadachim.setHabilidadeEspada(habilidadeEspadas);
                espadachim.setVelocidade(velocidade);
                
                listaEspadachim.add(espadachim);
                break;
                
            case 2:
                
                System.out.println("\nCriando Arqueiro...\n");
                System.out.print("Nome do Arqueiro: ");
                nome = scanner.next();
                System.out.print("Força: ");
                forca = scanner.nextInt();
                System.out.print("Vida: ");
                vidas = scanner.nextInt();
                System.out.print("Habilidade com arcos: ");
                int habilidadeArco = scanner.nextInt();
                System.out.print("Alcance: ");
                int alcance = scanner.nextInt();
                
                Arqueiro arqueiro = new Arqueiro(nome, vidas);
                
                arqueiro.setForca(forca);
                arqueiro.setHabilidadeArco(habilidadeArco);
                arqueiro.setAlcance(alcance);
                
                listaArqueiro.add(arqueiro);
                break;

            case 3:
                
                System.out.println("\nCriando Mago...\n");
                System.out.print("Nome do Mago: ");
                nome = scanner.next();
                System.out.print("Força: ");
                forca = scanner.nextInt();
                System.out.print("Vida: ");
                vidas = scanner.nextInt();
                System.out.print("Tipo do Feitiço: ");
                String tipoFeitico = scanner.next();
                System.out.print("Nível da Magia: ");
                int nivelMagia = scanner.nextInt();
                
                Mago mago = new Mago(nome, vidas);
                
                mago.setForca(forca);  
                mago.setTipoFeitico(tipoFeitico);
                mago.setNivelMagia(nivelMagia);
                
                listaMago.add(mago);
                break;
                
            case 4:
                
                System.out.println("\nCriando Valquíria...\n");
                System.out.print("Nome da Valquíria: ");
                nome = scanner.next();
                System.out.print("Força: ");
                forca = scanner.nextInt();
                System.out.print("Vida: ");
                vidas = scanner.nextInt();
                System.out.print("Dano do Machado: ");
                int danoMachado = scanner.nextInt();
                System.out.print("Raio de Alcance do Machado: ");
                int raioAlcance = scanner.nextInt();
                
                Valquiria valquiria = new Valquiria(nome, vidas);
                
                valquiria.setForca(forca);
                valquiria.setDanoMachado(danoMachado);
                valquiria.setRaioAlcance(raioAlcance);
    
                listaValquiria.add(valquiria);
                break;
                
            case 5:
                
                System.out.println("\nCriando Templário...\n");
                System.out.print("Nome do Templário: ");
                nome = scanner.next();
                System.out.print("Força: ");
                forca = scanner.nextInt();
                System.out.print("Vida: ");
                vidas = scanner.nextInt();
                System.out.print("Nível da Armadura: ");
                int nivelArmadura = scanner.nextInt();
                System.out.print("Velocidade do Cavalo: ");
                int velocidadeCavalo = scanner.nextInt();
                
                Templario templario = new Templario(nome, vidas);
                
                templario.setForca(forca);
                templario.setNivelArmadura(nivelArmadura);
                templario.setVelocidadeCavalo(velocidadeCavalo);
                
                listaTemplario.add(templario);
                break;
                
            default:
				
				//Opção padrão caso o valor inserido seja diferente de 0, 1 ou 2
				System.out.println("\nOpção Inválida!");
				
				break;
			}
			
			// Para que o menu permaneça aparecendo e novas opções sejam selecionadas, nós chamamos o menu novamente e pedimos uma opção do usuário
			menu.mostrarMenu();
			opcao = scanner.nextInt();
			
		}
		
		// Quando 0 for selecionado essa mensagem será impressa informando o fim da execução do programa
		System.out.println("\nPrograma Encerrado!");
		
	}
	
}
