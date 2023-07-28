package Trash;

public class Dog {
    String name;
    String breed;
    int age;

    Vacine vacine;


    public void setVacine(Vacine vacine) {
        this.vacine = vacine;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", vacine=" + vacine +
                '}';
    }

    class Vacine {
        @Override
        public String toString() {
            return "Vacine{" +
                    "vacineName='" + vacineName + '\'' +
                    '}';
        }

        String vacineName;

        public Vacine(String vacineName) {
            this.vacineName = vacineName;
        }

    }

    public static void main(String[] args) {
        Dog dog = new Dog("Jessi","German Shephard",5);
        Dog.Vacine vacine = dog. new Vacine("Vitamin c");
        dog.setVacine(vacine);
        System.out.println(dog);
    }


}
