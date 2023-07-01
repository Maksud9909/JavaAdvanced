package NestedClass;

public class Test1 {
    static class A {} // статичный inner класс
    class B{} //  просто inner class

    void method (){
        class C {} // это локальный класс, так как он внутри метода
    }

}
