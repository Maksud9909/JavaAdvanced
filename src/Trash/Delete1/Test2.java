package Trash.Delete1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Business2 business1 = new Business2("T&T",1,10000);
        Business2 business2 = new Business2("IBM",10,94746);
        Business2 business3 = new Business2("Apple",34,65000);
        Business2 business4 = new Business2("Facebook",2,87555);
        List<Business2> business2List = new ArrayList<>();
        business2List.add(business1);
        business2List.add(business2);
        business2List.add(business3);
        business2List.add(business4);
        System.out.println(business2List);
        Collections.sort(business2List);
        System.out.println(business2List);

        int result = Collections.binarySearch(business2List,business2);
        System.out.println(result);

    }
}

class Business2 implements Comparable<Business2>{
    String name;
    int valuation;
    int numberOfEmployee;

    public Business2(String name, int valuation, int numberOfEmployee) {
        this.name = name;
        this.valuation = valuation;
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "Business2{" +
                "name='" + name + '\'' +
                ", valuation=" + valuation +
                " billion , numberOfEmployee=" + numberOfEmployee +
                '}';
    }

    @Override
    public int compareTo(Business2 anotherBusiness) {
        int result = anotherBusiness.valuation - this.valuation;
            if (result == 0){
                result = anotherBusiness.numberOfEmployee - this.numberOfEmployee;
            }
        return result;
    }
}
