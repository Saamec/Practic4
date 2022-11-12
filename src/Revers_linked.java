import java.util.LinkedList;

public class Revers_linked {
    public LinkedList<Integer> Revers(LinkedList<Integer> linkedList){
        for(int i =0; i < linkedList.size(); i++){
            linkedList.add(i, linkedList.getLast());
            linkedList.pollLast();
        }
        return linkedList;
    }
}
