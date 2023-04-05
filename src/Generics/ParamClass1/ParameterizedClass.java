package Generics.ParamClass1;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info <String> stringInfo = new Info<>("Maksud");
        System.out.println(stringInfo);
        String s = stringInfo.getValue();
        System.out.println(s);

    }
}
class Info<T>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return value;
    }
}
