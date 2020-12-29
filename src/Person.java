public class Person {
    private String name;//姓名
    private Integer age;//年龄
    private String gender;//性别

    public Person(String name, Integer age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    //重写toString，方便观看结果
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
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
