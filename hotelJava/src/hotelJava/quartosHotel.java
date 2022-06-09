package hotelJava;

public class quartosHotel {

	private String nomeQuarto;	
	private int numeroQuarto;
	private String posicaoQuarto;
	private double valorDiaria;
	private int quantidadePessoasQuarto;
	private String fumanteQuarto;
	private Boolean quartoOcupado;
	
	public String getNomeQuarto() {
		return nomeQuarto;
	}
	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public String getPosicaoQuarto() {
		return posicaoQuarto;
	}
	public void setPosicaoQuarto(String posicaoQuarto) {
		this.posicaoQuarto = posicaoQuarto;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDaDiaria) {
		this.valorDiaria = valorDaDiaria;
	}
	public int getQuantidadePessoasQuarto() {
		return quantidadePessoasQuarto;
	}
	public void setQuantidadePessoasQuarto(int quantidadePessoasQuarto) {
		this.quantidadePessoasQuarto = quantidadePessoasQuarto;
	}
	public String getFumanteQuarto() {
		return fumanteQuarto;
	}
	public void setFumanteQuarto(String fumanteQuarto2) {
		this.fumanteQuarto = fumanteQuarto2;
	}
	public Boolean getQuartoOcupado() {
		return quartoOcupado;
	}
	public void setQuartoOcupado(Boolean quartoOcupado) {
		this.quartoOcupado = quartoOcupado;
	}
	public boolean isOcupado() {
		return false;
	}
}