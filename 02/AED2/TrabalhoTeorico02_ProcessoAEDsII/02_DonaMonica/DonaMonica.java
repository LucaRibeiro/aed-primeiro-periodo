import java.util.Scanner;

public class DonaMonica {
    private static int getAge(int x, int y, int z) {
        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;

        return z;
    }

    private static int calcAge(int m, int x, int y) {
        return (m - (x + y));
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int m, x, y, z;

        while(true){

            m = s.nextInt();
            
            if (m == 0)
                break;

            x = s.nextInt();
            y = s.nextInt();
        
            z = calcAge(m,x,y);
        System.out.println(getAge(x,y,z));
        }
    }
}
