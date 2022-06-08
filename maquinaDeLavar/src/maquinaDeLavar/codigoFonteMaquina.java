package maquinaDeLavar;
import java.util.Scanner;
public class codigoFonteMaquina {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		
		int opcaoPrincipal = 0; 
		int opcaoConfig = 0;
		int voltagem = 0;
		int estagio = 0;
		int tempoPesada = 0;
		int tempoLeve = 0;
		int tempoNormal = 0;
		int tempoEnx = 0;
		int tempoCentrifuga = 0;
		int contadorEstagio = 0;
		String modelo = null;
		String nome = null;
		double kilos = 0;
		
		do { //Laço de repetição principal
			
			System.out.println("=============================================");
			System.out.println(" MENU PRINCIPAL");
			System.out.println("=============================================");
			System.out.println(" 1 - Configurar a máquina de lavar");
			System.out.println(" 2 - Simular a máquina de lavar");
			System.out.println(" 0 - Sair");
			System.out.println("Digite a opção: ");
			opcaoPrincipal = in.nextInt();
			opcaoConfig = opcaoPrincipal;
			
			switch (opcaoPrincipal) {
				
				case 0: 
					System.out.println("Você optou por sair do programa! Até a próxima...");
				break;
					
				case 1:
					while (opcaoConfig != 0) {
						System.out.println("=============================================");
						System.out.println(" CONFIGURAÇÃO DE MÁQUINA DE LAVAR ");
						System.out.println(" Por favor, entre com as informações abaixo: ");
						System.out.println("=============================================");
						System.out.println("Digite o modelo da máquina: ");
						modelo = in.next();
						System.out.println("Digite o nome da máquina: ");
						nome = in.next();
						System.out.println("Qual a voltagem da máquina (110V ou 220V): ");
						voltagem = in.nextInt();
						System.out.println("Qual a capacidade da máquina em Kg: ");
						kilos = in.nextDouble();
						System.out.println("Qual o tempo, em minutos, do ciclo de lavação pesada: ");
						tempoPesada = in.nextInt();
						System.out.println("Qual o tempo, em minutos, do ciclo de lavação normal: ");
						tempoNormal = in.nextInt();
						System.out.println("Qual o tempo, em minutos, do ciclo de lavação leve: ");
						tempoLeve = in.nextInt();
						System.out.println("Qual o tempo, em minutos, do enxágue: ");
						tempoEnx = in.nextInt();
						System.out.println("Qual o tempo, em minutos, da centrifugação: ");
						tempoCentrifuga = in.nextInt();
						System.out.println("=============================================");
						System.out.println(" CONFIGURAÇÃO DA MÁQUINA DE LAVAR ");
						System.out.println("=============================================");
						System.out.println("                                             ");
						System.out.println(" Modelo: " + modelo);
						System.out.println(" Nome: " + nome + " " + kilos + "Kg");
						System.out.println(" Voltagem: " + voltagem);
						System.out.println(" Capacidade " + kilos + "Kg");
						System.out.println(" Duração do Estágio 1 - Lavação Pesada: " + tempoPesada);
						System.out.println(" Duração do Estágio 2 - Lavação Normal: " + tempoNormal);
						System.out.println(" Duração do Estágio 3 - Lavação Rápida: " + tempoLeve);
						System.out.println(" Duração do Estágio 4 - Enxague: " + tempoEnx);
						System.out.println(" Duração do Estágio 5 - Centrífuga: " + tempoCentrifuga);
					break;
				}
					break;
				
				case 2:
					
					if (modelo == null) { //É um case exclusivamente para se o usuário tentar simular antes de ter cadastrado qualquer máquina
						System.out.println(" ");
						System.out.println("Você precisa cadastrar uma máquina antes!");
						System.out.println(" ");
					break;
					}
					
					System.out.println("=============================================");
					System.out.println(" SIMULAÇÃO DA MÁQUINA DE LAVAR ");
					System.out.println("=============================================");
					System.out.println("                                             ");
					System.out.println(" Simulando o modelo: " + modelo + " - " + nome + " - " + kilos + "Kg - " + "Voltagem: " + voltagem + "V");
					System.out.println("                                             ");
					System.out.println("=============================================");
					System.out.println(" QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR?           ");
					System.out.println("=============================================");
					System.out.println(" 1 - Lavagem Pesada                          ");
					System.out.println(" 2 - Lavagem Normal                          ");
					System.out.println(" 3 - Lavagem Leve                            ");
					System.out.println(" 4 - Enxague                                 ");
					System.out.println(" 5 - Centrifugar                             ");
					System.out.println(" Selecione o estágio inicial:                ");
					
					estagio = in.nextInt(); //Aqui o usuário vai escolher em qual 'estagio' vai iniciar a simulação da máquina
					
					switch (estagio) { 
						
						case 1:
							System.out.println(" ");
							for (contadorEstagio = 0; contadorEstagio < 5; contadorEstagio++) {
								Thread.sleep(500);
									System.out.println("Estagio 1 - Em lavacao pesada: " + 20 * (contadorEstagio + 1) + "%");
						}
						case 2:
							System.out.println(" ");
							for (contadorEstagio = 0; contadorEstagio < 5; contadorEstagio++) {
								Thread.sleep(500);
									System.out.println("Estagio 2 - Em lavacao normal: " + 20 * (contadorEstagio + 1) + "%");
						}
						case 3:
							System.out.println(" ");
							for (contadorEstagio = 0; contadorEstagio < 5; contadorEstagio++) {
								Thread.sleep(500);
									System.out.println("Estagio 3 - Em lavacao leve: " + 20 * (contadorEstagio + 1) + "%");
						}
						case 4:
							System.out.println(" ");
							for (contadorEstagio = 0; contadorEstagio < 5; contadorEstagio++) {
								Thread.sleep(500);
									System.out.println("Estagio 4 - Em enxague: " + 20 * (contadorEstagio + 1) + "%");
						}
						case 5:
							System.out.println(" ");
							for (contadorEstagio = 0; contadorEstagio < 5; contadorEstagio++) {
								Thread.sleep(500);
									System.out.println("Estagio 5 - Em centrífuga: " + 20 * (contadorEstagio + 1) + "%");
						}
							System.out.println(" ");
							System.out.println("Simulação Finalizada");
							System.out.println(" ");
							break;
						
						default: //Para quando escolhe um número diferente no 'estagio'
							System.out.println("Opção inválida, por gentileza escolha uma das opções abaixo");
							System.out.println("											 ");
						break;
						
				} //Fechando o switch do 'estagio'
					
				default: //Para quando escolhe um número diferente no 'menuPrincipal'
					System.out.println("Opção inválida, por gentileza escolha uma das opções abaixo");
					System.out.println("											 ");
				break;
				
			} //Fechando o switch da 'opcaoPrincipal'
			
			} while (opcaoPrincipal != 0);
			
		in.close(); //Fecha o teclado
		
	} //Fecha o 'main'
	
} //Fecha a 'classe'