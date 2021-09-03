import java.util.Scanner;

public class PrincipalPilha {
    private static menu(){
        System.out.println("1- Inserir");
        System.out.println("2- Remover");
        System.out.println("3- Listar");
        System.out.println("4- Sair");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();

        Arq.openRead("pilha.dat");

        while (Arq.hasNext()) {
            p.push(Arq.readLine());
        }

        Arq.close();

        do {
            int opt = menu();

            switch (opt) {
                case 1:
                    p.push(s.nextLine());
                    break;
                case 2:
                    p.pop();
                    break;
                case 3:
                    p.list();
                    break;
                default:
                    break;
            }
        } while (opt != 4);

        Arq.openWrite("pilha.dat");
        while (!p.empty()) {
            Arq.print(p.pop());
        }
    }
}
