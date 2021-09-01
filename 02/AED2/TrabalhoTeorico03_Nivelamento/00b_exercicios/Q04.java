/**
 * Faça um método que receba um array de inteiros
 * e mostre na tela  o maior e o menor elemento do array
 */

public class Q04 {
    public void printMajorMinor(int []arr){
        int minor = arr[0], major = arr[0];

        for(int x: arr){
            if(x > major)
                major = x;
            if(x < minor)
                minor = x;
        }

        System.out.printf("%d %d\n", major, minor);
    }
    public static void main(String []args){}
}
