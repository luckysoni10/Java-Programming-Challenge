public class GetterSetter {
    public static void main(String[] args) {
        Info i1 = new Info();
        i1.setName("Lucky Soni");
        i1.setAge(19);
        i1.getName();
        //i1.name = "CHECK"; //It will give error, we can'nt assign a value to private.
    }

}
class Info {
    private String name;
    private int age;

    String getName () {
        return this.name;
    }

    int getAge () {
        return this.age;
    }

    void setAge (int age) {
        this.age = age;
    }

    void setName (String name) {
        this.name = name;
    }
}
