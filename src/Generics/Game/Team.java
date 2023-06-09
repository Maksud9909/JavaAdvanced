package Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }


    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("In the team " + name + " was added new participant " + participant.getName()); // здесь мы использовали casting
    }



    public void playWith(Team<T> team){ // здесь обозначается так, как то что Буква Т обозначает такой же тип, что и написан
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0){
            winnerName = this.name;
        }else {
            winnerName = team.name;
        }
        System.out.println("The winner team is " + winnerName);
    }
}
