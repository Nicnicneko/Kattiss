import java.util.*;
import java.io.*;

public class BinaryVoting {
    private static HashMap<Integer, Double> stuffs = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int[] data = new int[] {nya.nextInt(), nya.nextInt()};
        nya.nextLine();

        double[][] voters = new double[data[1]-1][2];

        for (int i = 0; i < voters.length; i++) {
            for (int j = 0; j < voters[i].length; j++) {
                voters[i][j] = nya.nextDouble();
            }
        }

        combo(voters, 0, 1, 0);

        System.out.println(stuffs);

        System.out.println(stuffs.values().stream().reduce(Double::sum).get());
    }

    private static void combo(double[][] data, int num, double chance, int i){
        if(i >= data.length){
            if(!stuffs.containsKey(num))
                stuffs.put(num, chance);
            else
                stuffs.put(num, stuffs.get(num) + chance);
        } else {
            combo(data, num + (int)data[i][1], chance * data[i][0], i +1);
            combo(data, num, chance * (1.0 - data[i][0]), i +1);
        }
    }
}
