package Trash2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {

    }
    String version;
    int number;

    public Test5(String version, int number) {
        this.version = version;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Test5{" +
                "version='" + version + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test5 test5 = (Test5) o;
        return number == test5.number && Objects.equals(version, test5.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, number);
    }
}

