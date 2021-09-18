import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float media_turma = 0, media_mulheres = 0, media_homens = 0, menor = 0, maior = 0, soma;
        int contador_turma = 0, contador_homens = 0, contador_mulheres = 0;

        int codigo;
        float altura;

        while (true) {
            System.out.print("\nInforme o codigo:");
            codigo = scan.nextInt();

            System.out.print("Informe a altura:");
            altura = scan.nextFloat();

            if (altura < 0)
                break;

            System.out.println("------------------------");
            System.out.println("Codigo: " + codigo);
            System.out.println("Altura: " + altura);

            soma = (contador_turma * media_turma) + altura;
            contador_turma++;
            media_turma = soma / contador_turma;

            if (codigo == 1) {
                soma = (media_homens * contador_homens) + altura;
                contador_homens++;
                media_homens = soma / contador_homens;
            } else if (codigo == 2) {
                soma = (media_mulheres * contador_mulheres) + altura;
                contador_mulheres++;
                media_mulheres = soma / contador_mulheres;
            }

            if (altura < menor || contador_turma == 1)
                menor = altura;

            if (altura > maior || contador_turma == 1)
                maior = altura;

        }

        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
        System.out.println("Média da altura das mulheres: " + media_mulheres);
        System.out.println("Média da altura dos homens: " + media_homens);
        System.out.println("Média da altura da turma : " + media_turma);

        scan.close();
    }
}
