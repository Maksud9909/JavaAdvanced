package Delete1;

import java.lang.instrument.Instrumentation;

public class ObjectSize {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object obj) {
        if (instrumentation == null) {
            throw new IllegalStateException("Instrumentation not initialized");
        }
        return instrumentation.getObjectSize(obj);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        long sizeInBytes = getObjectSize(myArray);
        System.out.println(sizeInBytes);  // Выводит размер в байтах
    }
}