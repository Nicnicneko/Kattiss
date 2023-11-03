import java.util.*;
import java.io.*;

public class Mosquito {
    public static void main(String[] args) throws IOException {
        //BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        Scanner nya = new Scanner(System.in);
        while(nya.hasNextLine()) {
            System.out.println(new World(nya.nextLine()).run());
        }
    }

    public static class World {
        int mosquitoes;
        int pupae;
        int larvae;
        int eggs;
        int l_surv;
        int p_surv;
        int week;

        public World(String input) {
            int[] data = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            mosquitoes = data[0];
            pupae = data[1];
            larvae = data[2];
            eggs = data[3];
            l_surv = data[4];
            p_surv = data[5];
            week = data[6];
        }

        public int run() {
            while(week-->0) {
                int prev = mosquitoes;
                mosquitoes = pupae/p_surv;
                pupae = larvae/l_surv;
                larvae = prev * eggs;
            }
            return mosquitoes;
        }
    }
}
