import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Calc {
    public static void Calc() throws IOException {
        double result = 0;
        Scanner s = new Scanner(System.in);

        LinkedList<Double> list = new LinkedList<>();


        System.out.println("Вводите через ентер число, потом оператор, потом число");
        System.out.println("Введите \"Отмена\" для возврата к предыдущему результату");

        while (true){
            String first = s.next();
            if (first.equals("Отмена")) {
                if(list.size() != 0) {
                    list.pollLast();
                    System.out.println(list.getLast());
                }
                break;
            }
            String operator = s.next();
            if (operator.equals("Отмена")) {
                if(list.size() != 0) {
                    list.pollLast();
                    System.out.println(list.getLast());
                }
                break;
            }
            String second = s.next();
            if (second.equals("Отмена")) {
                if(list.size() != 0) {
                    list.pollLast();
                    System.out.println(list.getLast());
                }
                break;
            }

            switch (operator){
                case ("+"):
                    result = Double.parseDouble(first) + Double.parseDouble(second);
                    list.add(result);
                    System.out.println(result);
                    break;
                case ("-"):
                    result = Double.parseDouble(first) - Double.parseDouble(second);
                    list.add(result);
                    System.out.println(result);
                    break;
                case ("*"):
                    result = Double.parseDouble(first) * Double.parseDouble(second);
                    list.add(result);
                    System.out.println(result);
                    break;
                case ("/"):
                    if (Double.parseDouble(second) != 0) {
                        result = Double.parseDouble(first) / Double.parseDouble(second);
                        list.add(result);
                        System.out.println(result);
                    }
                    else System.out.println("Делить на 0 нельзя!");
                    break;

            }

        }
    }
}
