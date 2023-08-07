package Trash.Delete1;

import java.util.*;

 class Test {
    public static void main(String[] args) {
        Business business1 = new Business("HP",29084,1000);
        Business business2 = new Business("laskdj",1234567,67);
        Business business3 = new Business("Omen",848,5000);
        List<Business> businessList = new ArrayList<>();
        businessList.add(business1);
        businessList.add(business2);
        businessList.add(business3);
        System.out.println(businessList);
        Collections.sort(businessList,new CompanyNumberOfEmployees());
        System.out.println(businessList);
    }
}

public class Business implements Comparable <Business>{
    String company;
    int capital;
    int numberOfEmployees;

    public Business(String company, int capital, int numberOfEmployees) {
        this.company = company;
        this.capital = capital;
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Business{" +
                "company='" + company + '\'' +
                ", capital=" + capital +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    @Override
    public int compareTo(Business anotherBusiness) {
       int result = this.company.compareTo(anotherBusiness.company);
       if (result == 0){
           result = this.capital - anotherBusiness.capital;
           if (result == 0){
               result = this.numberOfEmployees - anotherBusiness.numberOfEmployees;
           }
       }
       return result;
    }
}

class CompanyNumberOfEmployees implements Comparator<Business> {

    @Override
    public int compare(Business business1, Business  business2) {
        return business1.numberOfEmployees - business2.numberOfEmployees;
    }
}