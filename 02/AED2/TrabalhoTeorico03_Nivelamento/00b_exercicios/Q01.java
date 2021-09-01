/**
 * Faça um método que receba um array de inteiros
 * e um número inteiro x e retorne um valor booleano
 * informando se  elemento x está contido no array
 */

public class Q01{
    public boolean contains(int[] arr, int x){
        for(int i: arr){
            if(i == x)
                return true;
        }
        return false;
    }

    static void main(String []args){
        
    }
}