import java.util.*;
import java.io.*;

public class CowCrane {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int[] data = {nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt()};
        //a_start, b_start, a_end, b_end, a_time, b_time
        System.out.println(move(false, false, data[0], data[1], -1, -1, 0, 0, data) ? "possible" : "impossible");
    }

    private static boolean move(boolean a, boolean b, int m_pos, int l_pos, int m, int l, int time, int pos, int[] data){
        if(m > -1 && l > -1) {
            //System.out.printf("a:%b b:%b m_pos:%d l_pos:%d m:%d l:%d time:%d pos:%d\n", a, b, m_pos, l_pos, m, l, time, pos);
            return m <= data[4] && l <= data[5];
        }

        return (!a && !b && m == -1 && move(true, b, m_pos, l_pos, m, l, time + Math.abs(pos - m_pos), m_pos, data)) |
                (!b && !a && l == -1 && move(a, true, m_pos, l_pos, m, l, time + Math.abs(pos - l_pos), l_pos, data)) |
                (a && m_pos != l_pos && move(false, b, l_pos, l_pos, m, l, time + Math.abs(pos - l_pos), l_pos, data)) |
                (b && l_pos != m_pos && move(a, false, m_pos, m_pos, m, l, time + Math.abs(pos - m_pos), m_pos, data)) |
                (a && move(false, b, data[2], l_pos, time + Math.abs(pos - data[2]), l, time + Math.abs(pos - data[2]), data[2], data)) |
                (b && move(a, false, m_pos, data[3], m, time + Math.abs(pos - data[3]), time + Math.abs(pos - data[3]), data[3], data));
    }
}
