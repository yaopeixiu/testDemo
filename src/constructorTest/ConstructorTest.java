package constructorTest;

public class ConstructorTest extends Person {
    private String test;

    public ConstructorTest(String name, Integer age, String gender, String test){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.test = test;
        System.out.println("test3的有参构造方法  " + this.name + "  age  " + this.age + "  gender  " + this.gender + "  test  " + this.test);
    }

    public ConstructorTest(){
        this.name = "name无参test3";
        System.out.println("test3的构造方法" + this.name);
    }

    @Override
    public void test(){
        System.out.println("override");
        super.test();
    }

    private void test(String name){
        System.out.println("person test override");
    }

    public void test(String name, Integer age){
        System.out.println("person test override");
    }

    public static void main(String[] args) {
        ConstructorTest test3 = new ConstructorTest();
        System.out.println("-------------------");
        Person person = new ConstructorTest("name有参test3", 2, "女", "test000");
        System.out.println(person.name + "  " + person.age);
        person.test();
        test3.test("重载");
    }
}
