package Stream.CollectTerminal;

public class Pupil {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    int group;
    int score;
    String subject;

    public Pupil(String name, int group, int score, String subject) {
        this.name = name;
        this.group = group;
        this.score = score;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", score=" + score +
                ", subject='" + subject + '\'' +
                '}';
    }
}
