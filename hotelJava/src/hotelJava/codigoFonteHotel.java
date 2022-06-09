package hotelJava;
import java.util.Scanner;
import java.util.ArrayList;

public class codigoFonteHotel {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int opcaoMenu;
		int opcaoMenuCliente;
		int opcaoMenuQuarto;
		int codigoCliente;
		int codigoQuarto;
		int codigoExclusaoCliente;
		int codigoExclusaoQuarto;
		int capacidadeQuarto;
		int codigoEdicaoCliente;
		int codigoEdicaoQuarto;
		int codigoQuartoCheckin;
		int codigoQuartoCheckOut;
		String posicaoQuarto;
		String nomeQuarto;
		String nomeCliente;
		String dataNasc;
		String emailCliente;
		String telefoneCliente;
		String cidadeCliente;
		String estadoCliente;
		String fumanteCliente;
		String fumanteQuarto;
		double valorDaDiaria;
		ArrayList<clientesHotel> listaDeClientes = new ArrayList<>();
		ArrayList<quartosHotel> listaDeQuartos = new ArrayList<>();

		do {

			System.out.println("\n================================");
			System.out.println("Sistema de Gerenciamento de Hotel");
			System.out.println("=================================\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastro de Cliente");
			System.out.println("2 - Cadastro de Quarto");
			System.out.println("3 - Listar Quartos Disponíveis Para Alocação");
			System.out.println("4 - Realizar Check-in");
			System.out.println("5 - Realizar Check-out");
			
			opcaoMenu = in.nextInt();
			
			switch (opcaoMenu) {
			case 1: // Menu do Cliente
				do {
					System.out.println("1 - Adicionar Cliente");
					System.out.println("2 - Editar Cliente");
					System.out.println("3 - Excluir Cliente");
					System.out.println("4 - Listar Cliente");
					System.out.println("0 - Retornar ao Menu Inicial");
					opcaoMenuCliente = in.nextInt();
					
					switch (opcaoMenuCliente) {
					case 1: // Adicionar Cliente
						System.out.println("Digite o código do cliente: ");
						codigoCliente = in.nextInt();
						System.out.println("Digite o nome do cliente: ");
						nomeCliente = in.next();
						System.out.println("Digite a data de nascimento do cliente: ");
						dataNasc = in.next();
						System.out.println("Digite o e-mail do cliente: ");
						emailCliente = in.next();
						System.out.println("Digite o telefone do cliente: ");
						telefoneCliente = in.next();
						System.out.println("Digite a cidade do cliente: ");
						cidadeCliente = in.next();
						System.out.println("Digite a UF do cliente: ");
						estadoCliente = in.nextLine();
						System.out.println("Digite [S] cliente Fumante ou [N] cliente não Fumante");
						fumanteCliente = in.nextLine();

						clientesHotel cliente = new clientesHotel();
						cliente.setCodigoCliente(codigoCliente);
						cliente.setNomeCliente(nomeCliente);
						cliente.setDataNasc(dataNasc);
						cliente.setEmailCliente(emailCliente);
						cliente.setTelefoneCliente(telefoneCliente);
						cliente.setCidadeCliente(cidadeCliente);
						cliente.setEstadoCliente(estadoCliente);
						cliente.setFumanteCliente(fumanteCliente);

						listaDeClientes.add(cliente);
						
						break;
						
					case 2: // Editar Cliente
						System.out.println("Digite o código identificador do cliente que vocÊ gostaria de EDITAR: ");
						codigoEdicaoCliente = in.nextInt();
						in.nextLine();
						clientesHotel clienteAlteracao = null;
						for (int i = 0; i < listaDeClientes.size(); i++) {
							if (listaDeClientes.get(i).getCodigoCliente() == codigoEdicaoCliente) {
								clienteAlteracao = listaDeClientes.get(i);
								break;
							}
						}

						if (clienteAlteracao != null) {

							System.out.println("Digite o nome do cliente:");
							nomeCliente = in.nextLine();
							System.out.println("Digite a data de nascimento do cliente:");
							dataNasc = in.nextLine();
							System.out.println("Digite o e-mail do cliente");
							emailCliente = in.nextLine();
							System.out.println("Digite o telefone do cliente:");
							telefoneCliente = in.nextLine();
							System.out.println("Digite a cidade do cliente:");
							cidadeCliente = in.nextLine();
							System.out.println("Digite a UF do cliente:");
							estadoCliente = in.nextLine();
							System.out.println("Digite [S] cliente Fumante ou [N] cliente não Fumante");
							fumanteCliente = in.nextLine();

							clienteAlteracao.setNomeCliente(nomeCliente);
							clienteAlteracao.setDataNasc(dataNasc);
							clienteAlteracao.setEmailCliente(emailCliente);
							clienteAlteracao.setTelefoneCliente(telefoneCliente);
							clienteAlteracao.setCidadeCliente(cidadeCliente);
							clienteAlteracao.setEstadoCliente(estadoCliente);
							clienteAlteracao.setFumanteCliente(fumanteCliente);
							
							System.out.println("Cliente alterado com sucesso.");
						} else {
							System.out.println("Cliente não encontrado.");
						}
						break;
						
					case 3: // Excluir Cliente
						System.out.println("Digite o código identificador do cliente que vocÊ gostaria de EXCLUIR: ");
						codigoExclusaoCliente = in.nextInt();
						clientesHotel clienteExclusao = null;
						for (int i = 0; i < listaDeClientes.size(); i++) {
							if (listaDeClientes.get(i).getCodigoCliente() == codigoExclusaoCliente) {
								clienteExclusao = listaDeClientes.get(i);
								break;
							}
						}
						if (clienteExclusao != null) {
							listaDeClientes.remove(clienteExclusao);
						} else {
							System.out.println("Cliente não encontrado.");
						}
						break;
						
					case 4:// Listar Clientes
						for (int i = 0; i < listaDeClientes.size(); i++) {
							System.out.println("Código do Cliente: " + listaDeClientes.get(i).getCodigoCliente());
							System.out.println("Nome do Cliente: " + listaDeClientes.get(i).getNomeCliente());
							System.out.println("Email do Cliente: " + listaDeClientes.get(i).getEmailCliente());
							System.out.println("----------------------------");
						}
						break;
					case 0:
						break;
					default:
						System.out.println("Número inválido");
						break;
					}
				} while (opcaoMenuCliente != 0);
				break;

			case 2: // Opção Menu Quarto
				do {
					System.out.println("1 - Adicionar Quarto");
					System.out.println("2 - Editar Quarto");
					System.out.println("3 - Excluir Quarto");
					System.out.println("4 - Listar Quarto");
					System.out.println("0 - Retornar ao Menu Inicial");
					opcaoMenuQuarto = in.nextInt();
					in.nextLine();

					switch (opcaoMenuQuarto) {
					case 1:
						System.out.println("Digite o código do quarto:");
						codigoQuarto = in.nextInt();
						in.nextLine();
						System.out.println("Digite o nome do quarto:");
						nomeQuarto = in.nextLine();
						System.out.println("Digite a posição do quarto:");
						posicaoQuarto = in.nextLine();
						System.out.println("Digite a capacidade do quarto:");
						capacidadeQuarto = in.nextInt();
						in.nextLine();
						System.out.println("Digite se aceita fumante [S] ou [N]:");
						fumanteQuarto = in.nextLine();
						System.out.println("Digite o valor da diária:");
						valorDaDiaria = in.nextDouble();

						quartosHotel quarto = new quartosHotel();
						quarto.setNumeroQuarto(codigoQuarto);
						quarto.setNomeQuarto(nomeQuarto);
						quarto.setPosicaoQuarto(posicaoQuarto);
						quarto.setQuantidadePessoasQuarto(capacidadeQuarto);
						quarto.setFumanteQuarto(fumanteQuarto);
						quarto.setValorDiaria(valorDaDiaria);
						quarto.setQuartoOcupado(false);
						listaDeQuartos.add(quarto);
						break;
						
					case 2: // Editar Quarto
						System.out.println("Digite o código identificador do quarto que vocÊ gostaria de EDITAR: ");
						codigoEdicaoQuarto = in.nextInt();
						in.nextLine();
						quartosHotel quartoAlteracao = null;
						for (int i = 0; i < listaDeQuartos.size(); i++) {
							if ((listaDeQuartos.get(i).getNomeQuarto()).equals(codigoEdicaoQuarto)) {
								quartoAlteracao = listaDeQuartos.get(i);
								break;
							}
						}
						if (quartoAlteracao != null) {
							System.out.println("Digite o nome do quarto:");
							nomeQuarto = in.nextLine();
							System.out.println("Digite a posição do quarto:");
							posicaoQuarto = in.nextLine();
							System.out.println("Digite a capacidade do quarto:");
							capacidadeQuarto = in.nextInt();
							in.nextLine();
							System.out.println("Digite se aceita fumante [S] ou [N]:");
							fumanteQuarto = in.nextLine();
							System.out.println("Digite o valor da diária:");
							valorDaDiaria = in.nextDouble();

							quartoAlteracao.setNomeQuarto(nomeQuarto);
							quartoAlteracao.setPosicaoQuarto(posicaoQuarto);
							quartoAlteracao.setQuantidadePessoasQuarto(capacidadeQuarto);
							quartoAlteracao.setFumanteQuarto(fumanteQuarto);
							quartoAlteracao.setValorDiaria(valorDaDiaria);
							System.out.println("Quarto alterado com sucesso.");
						} else {
							System.out.println("Quarto não encontrado.");
						}
						break;
						
					case 3: // Excluir Quarto
						System.out.println("Digite o código identificador do quarto que você gostaria de EXCLUIR: ");
						codigoExclusaoQuarto = in.nextInt();
						quartosHotel quartoExclusao = null;
						for (int i = 0; i < listaDeQuartos.size(); i++) {
							if ((listaDeQuartos.get(i).getNomeQuarto()).equals(codigoExclusaoQuarto)) {
								quartoExclusao = listaDeQuartos.get(i);
								break;
							}
						}
						if (quartoExclusao != null) {
							listaDeQuartos.remove(quartoExclusao);
						} else {
							System.out.println("Quarto não encontrado.");
						}
						break;
						
					case 4: // Listar Quartos
						for (int i = 0; i < listaDeQuartos.size(); i++) {
							System.out.println("Código do Quarto: " + listaDeQuartos.get(i).getNomeQuarto());
							System.out.println("Nome do Quarto: " + listaDeQuartos.get(i).getNomeQuarto());
							System.out.println("----------------------");
						}
						break;
						
					case 0:
						break;
						
					default:
						System.out.println("Número inválido");
						break;
					}
				} while (opcaoMenuQuarto != 0);
				break;
				
			case 3: // Listar quartos disponíveis
				for (int i = 0; i < listaDeQuartos.size(); i++) {
					if (listaDeQuartos.get(i).isOcupado() == false) {
						System.out.println("Código do Quarto: " + listaDeQuartos.get(i).getNomeQuarto());
						System.out.println("Nome do Quarto: " + listaDeQuartos.get(i).getNomeQuarto());
						System.out.println("----------------------");
					}
				}
				break;

			case 4: // check-in
				System.out.println("CHECK-IN");
				System.out.println("Qual o código do quarto?");
				codigoQuartoCheckin = in.nextInt();
				in.nextLine();

				quartosHotel quartoCheckin = null;
				for (int i = 0; i < listaDeQuartos.size(); i++) {
					if ((listaDeQuartos.get(i).getNomeQuarto()).equals(codigoQuartoCheckin)) {
						quartoCheckin = listaDeQuartos.get(i);
						break;
					}
				}
				if (quartoCheckin != null) {
					quartoCheckin.setQuartoOcupado(true);
					System.out.println("Check-in realizado com sucesso.");
				} else {
					System.out.println("Quarto não encontrado.");
				}
				break;
				
			case 5: // check-out
				System.out.println("CHECK-OUT");
				System.out.println("Qual o código do quarto?");
				codigoQuartoCheckOut = in.nextInt();
				in.nextLine();
				
				quartosHotel quartoCheckOut = null;
				for (int i = 0; i < listaDeQuartos.size(); i++) {
					if ((listaDeQuartos.get(i).getNomeQuarto()).equals(codigoQuartoCheckOut)) {
						quartoCheckOut = listaDeQuartos.get(i);
						break;
					}
				}
				if (quartoCheckOut != null) {
					quartoCheckOut.setQuartoOcupado(false);
					System.out.println("Check-out realizado com sucesso.");
				} else {
					System.out.println("Quarto não encontrado.");
				}
				break;
				
			case 0:
				System.out.println("Encerrado");
				break;
				
			default:
				System.out.println("Opção inválida");
			} in.close();
		} while (opcaoMenu != 0);
	}
}