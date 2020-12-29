import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) throws NumberFormatException, IOException{
//        System.out.println(getString());
//        iteta();
//        remove();
        consumer();
    }

    /**
     * BufferReader理解
     * @return
     * @throws IOException
     */
    private static String getString() throws IOException {
        // System.in 读取键盘上的数据
        // InputStreamReader 将字节流向字符流的转换
        InputStreamReader isr = new InputStreamReader(System.in); // 读取
        // 创建字符流缓冲区
        BufferedReader br = new BufferedReader(isr); // 缓冲
        // 读取一个文本行
        String s = br.readLine(); // 阻塞式，当没有数据读取时，就一直会阻塞，而不是返回null
        return s;
    }


    /**
     * 使用iterator过滤集合内容
     */
    private static void iteta(){
        Collection<Person> collection = new ArrayList();
        collection.add(new Person("张三", 22, "男"));
        collection.add(new Person("李四", 19, "女"));
        collection.add(new Person("王五", 34, "男"));
        collection.add(new Person("赵六", 30, "男"));
        collection.add(new Person("田七", 25, "女"));
//过滤30岁以上的求职者
        Iterator<Person> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() >= 30)
                iterator.remove();
        }
        System.out.println(collection.toString());//查看结果
    }

    /**
     * 使用集合的removeIf过滤
     */
    private static void remove(){
        Collection<Person> collection = new ArrayList();
        collection.add(new Person("张三", 22, "男"));
        collection.add(new Person("李四", 19, "女"));
        collection.add(new Person("王五", 34, "男"));
        collection.add(new Person("赵六", 30, "男"));
        collection.add(new Person("田七", 25, "女"));

        collection.removeIf(
                person -> person.getAge() >= 30
        );//过滤30岁以上的求职者

        System.out.println(collection.toString());//查看结果
    }

    /**
     *  Consumer用法
     */
    private static void consumer(){
        List<Person> lisiList = new ArrayList<>();
        Consumer<Person> consumer  = x -> {
            if (x.getName().equals("李四")){
                lisiList.add(x);
            }
        };
//        consumer = consumer.andThen(
//                x -> lisiList.removeIf(y ->y.getAge() < 23)
//        );
        Stream.of(
                new Person("张三", 22, "男"),
                new Person("李四", 19, "女"),
                new Person("王五", 34, "男"),
                new Person("赵六", 30, "男"),
                new Person("田七", 25, "女"),
                new Person("猪八", 22, "男")
        ).forEach(consumer);

        System.out.println(lisiList.toString());
    }

}
