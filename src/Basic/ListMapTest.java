package Basic;

import constructorTest.Person;

import java.util.*;
import java.util.stream.Stream;

public class ListMapTest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> window = new HashMap<>();
        window.put(1, 1);

        Person[] people = new Person[2];

        Person person = new Person("name", 1, "女");
        people[0] = person;

        System.out.println(people[0]);
        System.out.println(people[1]);

        List<Object> list = new ArrayList<>();
        list.add("123");
        list.add(1);

        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//
//        list.clear();
//        System.out.println(list);

        System.out.println(list.contains("123"));

        List<Object> list1 = new ArrayList<>();
        list1.add("123");
        list1.add(null);
        System.out.println(list.containsAll(list1));
        System.out.println("list1--" + list1);

        Set set = new HashSet();
        set.add("123");
        set.add("13");
        set.add(null);
        set.add(null);
        System.out.println("set--" + set);
        System.out.println(set.iterator().next());

        for (Object s : set) {
            System.out.println(s);
        }

        String[] str = {"abc", "cdf"};
        System.out.println(str);
        Stream.of(str).forEach(System.out::println);
        System.out.println(Arrays.toString(str));

        TreeMap<Integer, Integer> treeMap = new TreeMap(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });
        treeMap.put(1, 2);
        treeMap.put(2, 3);
        treeMap.put(5, 6);
        treeMap.put(3, 4);
        Iterator<Map.Entry<Integer, Integer>> it = treeMap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
