package NestedClass.AnonymusInner;

public class AnonnymusClass {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public void doOperation(int a, int b) {
                System.out.println(a + b);
            }
        };
       math.doOperation(12,56);


       Math2 math2 = new Math2(){
           @Override
           void operation(int a, int b) {
               System.out.println(a);
           }
       };
       math2.operation(1,2);

    }


}


interface Math {
    void doOperation (int a, int b);
}

class Math2 {
    void operation (int a,int b){
        System.out.println((a + b) / b);
    }
}