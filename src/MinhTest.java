import java.util.*;
public class MinhTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> choices = new ArrayList<String>();
        int opNumber = 0;
        System.out.println("Enter your choices!Type \"done\" once you're finished!");
        while(true){
            String response = sc.next().toLowerCase();
            if(response.equals("done")){break;}
            else{choices.add(response);}
        }
        System.out.println("Pick a whole number greater than 0!");
        opNumber = Integer.parseInt(sc.next());
        for (int i = choices.size() - 1; i >= 0; i--) {
            if(opNumber % (i + 1) == 0){
                System.out.printf("%s it is!", choices.get(i));
                break;
            }
        }
    }
}