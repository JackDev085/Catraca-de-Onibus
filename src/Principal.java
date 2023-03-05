import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Onibus onibus = new Onibus();
		int sistema = 1;
		int catraca;

		while (sistema != 0) {
			// Inicio do sistema
			System.out.println("Escolha uma opção");
			System.out.println("1 - Comprar passagem");
			System.out.println("0 - encerrar o sistema");
			sistema = sc.nextInt();
			// condicional para continuar caso seja digitado 1
			// ou terminar caso seja digitad0
			if (sistema == 0) {
				break;
				// caso seja digitado outro valor o sistema reiniciará
			} else if (sistema != 1) {
				System.out.println("Número invàlido, reiniciando o sistema");
				continue;
			}

			// mostra das formas de pagamento da catraca juntamento com os preços
			System.out.println("Escolha uma opção");
			System.out.println("1 - Passagem em dinheiro (R$ 3,80)");
			System.out.println("2 - Passagem no cartão de transporte(R$ 3,80)");
			System.out.println("3 - Meia passagem R$ 1,80");
			catraca = sc.nextInt();
			// condicional para contar as passagens e somar os respctivos valores
			if (catraca != 1 && catraca != 2 && catraca != 3) {
				System.out.println("Número invàlido, reiniciando o sistema");
				continue;
			}
			/// caso digite algum valor fora dos indicados
			if (catraca == 0) {
				System.out.println("Sistema encerrado");
				continue;
			}
			// contagem passagem em dinheiro
			if (catraca == 1) {
				System.out.println("Obrigado e volte sempre");
				onibus.setPassagemDinheiro(3.80);
				onibus.setGirarCatraca(1);
				// contagem passagem no cartão
			} else if (catraca == 2) {
				System.out.println("Obrigado e volte sempre");
				onibus.setPassagemCartao(3.80);
				onibus.setGirarCatraca(1);
				// contagem passagem meia
			} else if (catraca == 3) {
				System.out.println("Obrigado e volte sempre");
				onibus.setPassagemMeia(1.80);
				onibus.setGirarCatraca(1);

			}
			// Mostra dos resultados
		}
		System.out.println(onibus.toString());
		//System.out.printf("O total de vezes que a catraca foi girada: %d" , onibus.getCatraca()+ " vezes" );

	}

}
