import java.util.LinkedList;

public class Stack {
    public void enqueue(int value, LinkedList<Integer> list){
        list.addLast(value);
    }
    public int dequeue(LinkedList<Integer> list){
        int value = 0;
        if(list.size() != 0) {
            value = list.pollFirst();
            return value;
        }
        return value;
    }
    public int first(LinkedList<Integer> list){
        if(list.size() != 0) {
            return list.getFirst();
        }
        else return 0;
    }
}
