package Generics.Game;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maksud",43);
        Employee employee2 = new Employee("Anton",26);

        Schoolar schoolar1 = new Schoolar("Evgeniy",17);
        Schoolar schoolar2 = new Schoolar("Feruz",15);

        Schoolar schoolar3 = new Schoolar("Oleg",11);
        Schoolar schoolar4 = new Schoolar("Sasha",12);

        Student Student1 = new Student("Aleks",23);
        Student Student2 = new Student("Rahim",21);





        Team <Employee> teamEmployee = new Team<>("Green");
        teamEmployee.addNewParticipant(employee1);
        teamEmployee.addNewParticipant(employee2);

        Team <Student> teamStudent = new Team<>("Red");
        teamStudent.addNewParticipant(Student1);
        teamStudent.addNewParticipant(Student2);

        Team <Schoolar> teamSchoolar1 = new Team<>("Blue");
        teamSchoolar1.addNewParticipant(schoolar1);
        teamSchoolar1.addNewParticipant(schoolar2);

        Team <Schoolar> teamSchoolar2 = new Team<>("Violet");
        teamSchoolar2.addNewParticipant(schoolar3);
        teamSchoolar2.addNewParticipant(schoolar4);

        teamSchoolar1.playWith(teamSchoolar2);












    }
}
