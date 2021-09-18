using System;

namespace App
{
    class Program
    {
        static void Main(string[] args)
        {
            float media_turma = 0, media_mulheres = 0, media_homens = 0, menor = 0, maior = 0, soma = 0;
            int contador_turma = 0, contador_homens = 0, contador_mulheres = 0;


            while (true)
            {
                Console.Write("\nInforme o código: ");
                int codigo = int.Parse(Console.ReadLine());

                Console.Write("Informe a altura: ");
                float altura = float.Parse(Console.ReadLine());

                if (altura < 0)
                    break;


                Console.WriteLine("------------------------");
                Console.WriteLine("Codigo: " + codigo);
                Console.WriteLine("Altura: " + altura);


                if (codigo == 1)
                {
                    soma = (media_homens * contador_homens) + altura;
                    contador_homens++;
                    media_homens = soma / contador_homens;
                }
                else if (codigo == 2)
                {
                    soma = (media_mulheres * contador_mulheres) + altura;
                    contador_mulheres++;
                    media_mulheres = soma / contador_mulheres;
                }

                if (altura < menor || contador_turma == 0)
                    menor = altura;

                if (altura > maior || contador_turma == 0)
                    maior = altura;

                soma = (contador_turma * media_turma) + altura;
                contador_turma++;
                media_turma = soma / contador_turma;
            }

            Console.WriteLine("--------Resultados--------");
            Console.WriteLine("Maior altura: " + maior);
            Console.WriteLine("Menor altura: " + menor);
            Console.WriteLine("Média da altura das mulheres: " + media_mulheres);
            Console.WriteLine("Média da altura dos homens: " + media_homens);
            Console.WriteLine("Média da altura da turma : " + media_turma);
        }
    }
}
