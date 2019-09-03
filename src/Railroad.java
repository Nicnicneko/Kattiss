import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        Scanner nya = new Scanner(System.in);

        System.out.println((nya.nextInt()*4 + nya.nextInt()*3)%2 == 0? "possible": "impossible");
    }
}
