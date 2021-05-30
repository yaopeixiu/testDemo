package constructorTest;

public class Person {
    public String name;//姓名
    public Integer age;//年龄
    public String gender;//性别

    public Person(String name, Integer age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person(){
        this.name = "name9999";
        System.out.println("这是父类Person的无参构造方法" + this.name);
    }

    //重写toString，方便观看结果
//    @Override
//    public String toString() {
//        return "constructorTest.Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                '}';
//    }

    public void test(){
        System.out.println("person test override");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }
}
