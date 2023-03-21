package exercicio2;

import java.util.Scanner;

public class Livraria {
	
	private static Scanner input = new Scanner(System.in);
    private static double impostoISS = 0.3;
    private static double impostoXLP = 0.05;
    private static double impostoSAH1 = 0.05;
    private static double impostoSAH2 = 0.025;

	public static void main(String[] args) {
		 int opcao;

	        do {
	            exibirMenu();
	            opcao = input.nextInt();

	            switch (opcao) {
	                case 1:
	                    cadastrarLivro();
	                    break;
	                case 2:
	                    venderLivro();
	                    break;
	                case 3:
	                    imprimirBalanco();
	                    break;
	                case 4:
	                    alterarImpostos();
	                    break;
	                case 5:
	                    System.out.println("Obrigado por utilizar a Livraria P2!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 5);
	    }

	    public static void exibirMenu() {
	        System.out.println("= = = = Bem-vindo(a) à Livraria P2 = = = =");
	        System.out.println("Digite a opção desejada:");
	        System.out.println("1 - Cadastrar um Livro");
	        System.out.println("2 - Vender um Livro");
	        System.out.println("3 - Imprimir Balanço");
	        System.out.println("4 - Alterar porcentagem dos impostos");
	        System.out.println("5 - Sair");
	        System.out.print("Opção: ");
	    }

	    public static void cadastrarLivro() {
	        System.out.println("= = = = Cadastro de Livros = = = =");
	        System.out.print("Digite o nome do livro: ");
	        String nome = input.next();
	        System.out.print("Digite o preço unitário do livro: ");
	        double preco = input.nextDouble();
	        System.out.print("Digite a quantidade de livros: ");
	        int quantidade = input.nextInt();

	        double impostoISSValor = preco * impostoISS;
	        double impostoXLPValor = preco * impostoXLP;
	        double impostoSAHValor;
	        
	        if(preco >= 50) {
	        	 impostoSAHValor = preco * impostoSAH1;
	        } else if (preco < 150) {
	            impostoSAHValor = preco * impostoSAH2;
	        } else {
	            impostoSAHValor = 0;
	        }
	        
	        }
	

}
