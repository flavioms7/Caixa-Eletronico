import Entity.Caixa;

import java.util.HashMap;
import java.util.Scanner;
import Exception.SaqueNaoPermitidoException;

public class Principal {

    public static void main(String[] args) {

    int opcao = 0;
    int valorSaque = 0;

    do{
        System.out.println("Escolha uma Opção:");

        System.out.println("1 - Saque:");
        System.out.println("0 - Sair:");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();


        switch (opcao){
            case 1:

                System.out.println("Digite o valor para saque:");
                valorSaque = scanner.nextInt();

                HashMap<Integer, Integer> colecaoResultado = new HashMap<Integer, Integer>();

                try {
                    Caixa caixa = new Caixa();
                    colecaoResultado = caixa.sacar(valorSaque);
                }catch (SaqueNaoPermitidoException e){

                    System.out.println("Saque não permitido. Tente Novamente");
                }
                System.out.println(colecaoResultado);

                break;
            case 0:
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

    } while (opcao != 0);

    }
}
