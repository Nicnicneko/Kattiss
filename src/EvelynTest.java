/*
 * hmmmm hello?
 */

import java.util.*;

public class EvelynTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x0 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //m, l
        int[] xF = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] tF = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int minT = Math.min(tF[0], tF[1]);
        int maxT = Math.max(tF[0], tF[1]);

        int x = 0; //pos of crane
        boolean hasRightCow = false;
        boolean hasWrongCow = false;

        int index1, index2, inc;

        if (minT != maxT) {
            index1 = Arrays.toString(tF).replaceAll("[\\[\\],]", "").indexOf(Integer.toString(minT)) == 0 ? 0 : 1;
            index2 = index1 == 0 ? 1 : 0;
        }
        else {
            index1 = 0;
            index2 = 1;
        }

        inc = x0[index1] > 0 ? 1 : x0[index1] == 0 ? xF[index1] > 0 ? 1 : -1 : -1;
        int t;
        for (t = 0; t < minT; t++) {
            if (x == x0[index1]) { //if right cow is found
                if (hasWrongCow) { //check if crane already holding the wrong cow
                    hasWrongCow = false; //if so, drop the wrong cow and change its pos
                    x0[index2] = x;
                }
                hasRightCow = true; //pick up the right cow
                inc = xF[index1] > x ? 1 : -1;
                // x += inc; //move the crane
            }
            if (x == x0[index2]) { //if wrong cow is found
                if (!hasRightCow) //check if already holding the right cow
                    hasWrongCow = true; //if not, pick up the wrong cow
                //x += inc; //move the crane
            }
            if (x == xF[index1] && hasRightCow) { //if crane's current pos is the correct destination and it is holding the correct cow
                hasRightCow = false; //drop the cow
                x0[index1] = xF[index1];
                break; //exit the loop
            }
//            else if (x != xF[index1] && t == minT - 1) //if crane cannot get to destination before time limit
//                break; //break out of loop
            //else
            x += inc; //move the crane
            if (hasRightCow) //if crane is already holding the right cow, change the cow's initial pos
                x0[index1] = x;
            else if (hasWrongCow) //if crane is already holding the wrong cow, change the cow's initial pos
                x0[index2] = x;
        }

//        System.out.printf("2!! M: x0 = %d xF = %d, L: x0 = %d xF = %d t = %d x = %d\n", x0[0], xF[0], x0[1], xF[1], t, x);
//        System.out.println(hasRightCow);
        hasRightCow = hasWrongCow = false;
        if(x0[index1] == xF[index1]) {
            inc = x0[index2] > x ? 1 : x0[index2] == x ? xF[index2] > x ? 1 : -1 : -1;
            for (; t < maxT; t++) {
                if (x == x0[index2]) { //if right cow is found
                    hasRightCow = true; //pick up the right cow
                    inc = xF[index2] > x ? 1 : -1;
                    // x += inc; //move the crane
                }
                if (x == xF[index2] && hasRightCow) { //if crane's current pos is the correct destination and it is holding the correct cow
                    hasRightCow = false; //drop the cow
                    x0[index2] = xF[index2];
                    break; //exit the loop
                }
//                    else if (x != xF[index2] && t == minT - 1) //if crane cannot get to destination before time limit
//                        break; //break out of loop
                //else
                x += inc; //move the crane
                if (hasRightCow) //if crane is already holding the wrong cow, change the cow's initial pos
                    x0[index2] = x;
            }
            if(x0[index2] == xF[index2])
                System.out.println("possible");
            else
                System.out.println("impossible");
            //System.out.printf("1: %d, 2: %d M: x0 = %d xF = %d, L: x0 = %d xF = %d\n", index1, index2, x0[0], xF[0], x0[1], xF[1]);
        }
        else
            System.out.println("impossible");
//        System.out.printf("2!! M: x0 = %d xF = %d, L: x0 = %d xF = %d t = %d x = %d\n", x0[0], xF[0], x0[1], xF[1], t, x);


    }
}
