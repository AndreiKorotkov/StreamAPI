import java.lang.String;
import java.util.List;
import java.util.*;


public class stream {


    public static void main(String[] args) {

        List <Integer> lis = new ArrayList<>();

        Operational oper = new Operational(lis);

        oper.addMillion();

        oper.assertRandom();

        System.out.println(oper.getMin());

        oper.assertUnique();

        oper.removeOdd();

        System.out.println(oper.list.size());

        oper.getMax();



}
}