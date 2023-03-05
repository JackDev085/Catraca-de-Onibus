

public class Onibus {
	//atributos
	private int catraca = 0;
	private double passagemDinheiro;
	private double passagemCartao;
	private double passagemMeia;
	private double girarCatraca;
	private static double totalPassagem = 0;

	//sets and gets
	

	public void setGirarCatraca(int girarCatraca) {
		this.girarCatraca = catraca++;

	}

	public int getCatraca() {
		return catraca;
	}

	public double getPassagemDinheiro() {
		return passagemDinheiro;
	}

	public void setPassagemDinheiro(double passagemDinheiro) {
		this.passagemDinheiro += passagemDinheiro;
		Onibus.totalPassagem += passagemDinheiro;
	}

	public double getPassagemCartao() {
		return passagemCartao;
	}

	public void setPassagemCartao(double passagemCartao) {
		this.passagemCartao += passagemCartao;
		Onibus.totalPassagem += passagemCartao;
	}

	public double getPassagemMeia() {
		return passagemMeia;
	}

	public void setPassagemMeia(double passagemMeia) {
		this.passagemMeia += passagemMeia;
		Onibus.totalPassagem += passagemMeia;
	}
	//implementando o to string para aparecer na parte principal
	@Override
	public String toString() {
		return 	"===============\n" 
				+ "O total de vezes que a catraca foi girada: " + catraca + " vezes" + "\n"
				+ "O total de ganhos com passagens em DINHEIRO: " + passagemDinheiro + "0 R$\n"
				+ "O total de ganhos com passagens em CARTÃO: " + passagemCartao + "0 R$\n"
				+ "O total de ganhos com MEIAS passagens: " + passagemMeia + "0 R$\n" 
				+ "Total recebido: "+ totalPassagem + "0 R$\n" 
				+ "===============";
	}

}
