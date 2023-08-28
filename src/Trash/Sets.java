package Trash;

import com.sun.source.tree.Tree;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sets implements Comparable<Sets> {
    String organization;
    double money;

    public Sets(String organization, double money) {
        this.organization = organization;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Sets{" +
                "organization='" + organization + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sets sets = (Sets) o;
        return Double.compare(money, sets.money) == 0 && Objects.equals(organization, sets.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, money);
    }

    public static void main(String[] args) {
        TreeSet<Sets> set = new TreeSet<>();
        Sets sets1 = new Sets("MaksudCo",2000);
        Sets sets5 = new Sets("MaksudCo",2000);
        Sets sets2 = new Sets("DontyCo",2300);
        Sets sets3 = new Sets("UmarCo",2345);
        Sets sets4 = new Sets("SashaCo",1000);
        set.add(sets4);
        set.add(sets3);
        set.add(sets2);
        set.add(sets1);
        System.out.println(sets5.equals(sets1));
        System.out.println(set);
    }

    @Override
    public int compareTo(@NotNull Sets o) {
        return this.organization.compareTo(o.organization);
    }
}
