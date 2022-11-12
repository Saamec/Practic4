import java.io.IOException;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Revers_linked revers_linked = new Revers_linked();
        LinkedList<Integer> list = new LinkedList<>();
        Stack stack = new Stack();

        Calc calc = new Calc();

        list.add(12);
        list.add(43);
        list.add(87);
        list.add(768);
        list.add(5);


        //for (int val: revers_linked.Revers(list)) {
         //   System.out.println(val);
        //}

        //calc.Calc();
        System.out.println(stack.dequeue(list));
        System.out.println("");
        for (int val: list) {
            System.out.println(val);
        }
        System.out.println(stack.first(list));

    }
}