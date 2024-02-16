package Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    void sum(int a,int b){
        System.out.println("Plus result " + a + b);
    }
    void minus(int a,int b){
        System.out.println("Minus result " + (a - b));
    }
    void multiply(int a,int b){
        System.out.println("Multiply result " + (a * b));
    }
    void divide(int a,int b){
        System.out.println("Divide result " + (a / b));
    }
}

class TestCalculator{
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test100.txt"))
        ){
            String methodName = bufferedReader.readLine();
            String firstArgument = bufferedReader.readLine();
            String secondArgument = bufferedReader.readLine();

            Calculator calculator = new Calculator();
            Class clas = calculator.getClass();

        }
    }
}
