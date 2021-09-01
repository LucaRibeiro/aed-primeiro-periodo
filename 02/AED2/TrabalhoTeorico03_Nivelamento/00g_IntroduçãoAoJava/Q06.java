
/**
 * O banco do Zé abriu uma linha de crédito para os seus clientes. O valor
 * máximo da prestação não poderá ultrapassar 40% do salário bruto. Fazer um
 * algoritmo que permita entrar com o salário bruto e o valor da prestação e
 * informar se o empréstimo será concedido.
 */

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float salarioBruto, prestacao;
        salarioBruto = s.nextFloat();
        prestacao = s.nextFloat();

        if (prestacao <= (0.4 * salarioBruto))
            System.out.printf("Concedido");
        else
            System.out.print("Não concendido");
    }
}
