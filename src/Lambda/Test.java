package Lambda;

public class Test {
    static class Test2 {
        String faculty;

        public Test2(String faculty) {
            this.faculty = faculty;
        }

        @Override
        public String toString() {
            return "Test2{" +
                    "faculty='" + faculty + '\'' +
                    '}';
        }
    }
    String name;
    int age;
    Test2 test2;

    public Test(String name, int age,Test2 test2) {
        this.name = name;
        this.age = age;
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", test2=" + test2 +
                '}';
    }

    public static void main(String[] args) {

    }
}


class Test4 {
    void getclass(Test.Test2 test2){
        System.out.println(test2);
    }

    public static void main(String[] args) {
        Test.Test2 test2 = new Test.Test2("managment");
        Test test = new Test("Maksud",18,test2);
        System.out.println(test);
        System.out.println(test2);
        Test4 test4 = new Test4();
        test4.getclass(test2);
    }
}
