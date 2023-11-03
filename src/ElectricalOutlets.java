import java.util.*;
import java.io.*;

public class ElectricalOutlets {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        for(int i = Integer.parseInt(nya.nextLine()); i > 0; i--)
            System.out.println(Arrays.stream(("1 -" + nya.nextLine()).split(" ")).mapToInt(Integer::parseInt).sum());
    }
}
