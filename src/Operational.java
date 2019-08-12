import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operational {
    public List <Integer> list;

    public Operational (List <Integer> list) {
        this.list= list;
    }

    public void addMillion () {
        List <Integer> tmp = IntStream.range(0, 1000000)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(tmp);
        list = tmp.stream()
                .collect(Collectors.toList());
    }

    public void assertRandom () {
        list.stream()
                .limit(10)
                .forEach(System.out::println);
    }

    public void assertUnique () {
        List <Integer> tmp = list.stream()
                .distinct()
                .collect(Collectors.toList());
        if (list.size()==tmp.size()) {
            System.out.println("unique");
        } else {
            System.out.println("not unique");
        }
    }

    public int getMin () {
        int min = list.stream()
                .min (Integer::compare)
                .get();
        return min;
    }

    public void removeOdd () {
        list = list.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
    }

    public void getMax () {
        System.out.print("Предпоследний элемент ");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }
}
