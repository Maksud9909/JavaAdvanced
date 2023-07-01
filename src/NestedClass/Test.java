package NestedClass;

public class Test {
    static class A {} // статичный inner класс
    class B{} //  просто inner class

    void method (){
        class C {} // это локальный класс, так как он внутри метода
    }

}
