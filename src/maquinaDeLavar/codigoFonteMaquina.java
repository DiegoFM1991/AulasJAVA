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
		
		do { //La�o de repeti��o principal
			
			System.out.println("=============================================");
			System.out.println(" MENU PRINCIPAL");
			System.out.println("=============================================");
			System.out.println(" 1 - Configurar a m�quina de lavar");
			System.out.println(" 2 - Simular a m�quina de lavar");
			System.out.println(" 0 - Sair");
			System.out.println("Digite a op��o: ");
			opcaoPrincipal = in.nextInt();
			opcaoConfig = opcaoPrincipal;
			
			switch (opcaoPrincipal) {
				
				case 0: 
					System.out.println("Voc� optou por sair do programa! At� a pr�xima...");
				break;
					
				case 1:
					while (opcaoConfig != 0) {
						System.out.println("=============================================");
						System.out.println(" CONFIGURA��O DE M�QUINA DE LAVAR ");
						System.out.println(" Por favor, entre com as informa��es abaixo: ");
						System.out.println("=============================================");
						System.out.println("Digite o modelo da m�quina: ");
						modelo = in.next();
						System.out.println("Digite o nome da m�quina: ");
						nome = in.next();
						System.out.println("Qual a voltagem da m�quina (110V ou 220V): ");
						voltagem = in.nextInt();
						System.out.println("Qual a capacidade da m�quina em Kg: ");
						kilos = in.nextDouble();
						System.out.println("Qual o tempo, em minutos, do ciclo de lava��o pesada: ");
						tempoPesada = in.nextInt();
						System.out.println("Qual o tempo, em minutos, do ciclo de lava��o normal: ");
						tempoNormal = in.nextInt();
						System.out.println("Qual o tempo, em minutos, do ciclo de lava��o leve: ");
						tempoLeve = in.nextInt();
						System.out.println("Qual o tempo, em minutos, do enx�gue: ");
						tempoEnx = in.nextInt();
						System.out.println("Qual o tempo, em minutos, da centrifuga��o: ");
						tempoCentrifuga = in.nextInt();
						System.out.println("=============================================");
						System.out.println(" CONFIGURA��O DA M�QUINA DE LAVAR ");
						System.out.println("=============================================");
						System.out.println("                                             ");
						System.out.println(" Modelo: " + modelo);
						System.out.println(" Nome: " + nome + " " + kilos + "Kg");
						System.out.println(" Voltagem: " + voltagem);
						System.out.println(" Capacidade " + kilos + "Kg");
						System.out.println(" Dura��o do Est�gio 1 - Lava��o Pesada: " + tempoPesada);
						System.out.println(" Dura��o do Est�gio 2 - Lava��o Normal: " + tempoNormal);
						System.out.println(" Dura��o do Est�gio 3 - Lava��o R�pida: " + tempoLeve);
						System.out.println(" Dura��o do Est�gio 4 - Enxague: " + tempoEnx);
						System.out.println(" Dura��o do Est�gio 5 - Centr�fuga: " + tempoCentrifuga);
					break;
				}
					break;
				
				case 2:
					
					if (modelo == null) { //� um case exclusivamente para se o usu�rio tentar simular antes de ter cadastrado qualquer m�quina
						System.out.println(" ");
						System.out.println("Voc� precisa cadastrar uma m�quina antes!");
						System.out.println(" ");
					break;
					}
					
					System.out.println("=============================================");
					System.out.println(" SIMULA��O DA M�QUINA DE LAVAR ");
					System.out.println("=============================================");
					System.out.println("                                             ");
					System.out.println(" Simulando o modelo: " + modelo + " - " + nome + " - " + kilos + "Kg - " + "Voltagem: " + voltagem + "V");
					System.out.println("                                             ");
					System.out.println("=============================================");
					System.out.println(" QUAL EST�GIO VOC� DESEJA COME�AR?           ");
					System.out.println("=============================================");
					System.out.println(" 1 - Lavagem Pesada                          ");
					System.out.println(" 2 - Lavagem Normal                          ");
					System.out.println(" 3 - Lavagem Leve                            ");
					System.out.println(" 4 - Enxague                                 ");
					System.out.println(" 5 - Centrifugar                             ");
					System.out.println(" Selecione o est�gio inicial:                ");
					
					estagio = in.nextInt(); //Aqui o usu�rio vai escolher em qual 'estagio' vai iniciar a simula��o da m�quina
					
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
									System.out.println("Estagio 5 - Em centr�fuga: " + 20 * (contadorEstagio + 1) + "%");
						}
							System.out.println(" ");
							System.out.println("Simula��o Finalizada");
							System.out.println(" ");
							break;
						
						default: //Para quando escolhe um n�mero diferente no 'estagio'
							System.out.println("Op��o inv�lida, por gentileza escolha uma das op��es abaixo");
							System.out.println("											 ");
						break;
						
				} //Fechando o switch do 'estagio'
					
				default: //Para quando escolhe um n�mero diferente no 'menuPrincipal'
					System.out.println("Op��o inv�lida, por gentileza escolha uma das op��es abaixo");
					System.out.println("											 ");
				break;
				
			} //Fechando o switch da 'opcaoPrincipal'
			
			} while (opcaoPrincipal != 0);
			
		in.close(); //Fecha o teclado
		
	} //Fecha o 'main'
	
} //Fecha a 'classe'