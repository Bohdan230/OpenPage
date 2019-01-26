import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class testvadim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        ArrayList<Integer> Onenum = new ArrayList<Integer>();
        Onenum.add(4);
        Onenum.add(5);
        Onenum.add(9);
        Onenum.add(13);
        for (int i = 1; i < Onenum.size(); i++) {
            i = (int) (Math.random() * 100);
            Collections.sort(Onenum);
            System.out.println(Onenum.get(i));

        }
    }
}

/*public class testvadim {
    public static void main(String[] args) {
        int size = 20;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.println("Selected: "+list.remove(index));
        }
    }
}
*/