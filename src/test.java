import constructorTest.Person;

import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) throws NumberFormatException, IOException{

    }

    /**
     * 将时间格式2021-04-05T16:00:00.000Z转换为0000-00-00 00:00:00格式
     * @param dateString  2021-04-05T16:00:00.000Z格式字符串
     * @return
     */
    public static Date parseDate(String dateString){
        dateString = dateString.replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        try {
            Date d = format.parse(dateString);
            return d;
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * BigDecimal相加
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal add(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
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

        System.out.println(lisiList.stream());

        System.out.println(lisiList.toString());
    }

    /**
     * Calendar.getInstance()用法
     * @return
     */
    public static String getDate1(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);//控制时
        cal.set(Calendar.MINUTE, 0);//控制分
        cal.set(Calendar.SECOND, 0);//控制秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    //获取当天12点时间
    public static String getDate2(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    //获取本周一0点时间
    public static String getDate3(){
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0,0);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    //获取本月第一天0点时间
    public static String getDate4(){
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0,0);
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    //获得本月最后一天24点时间
    public static String getDate5(){
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0,0);
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 24);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

}
