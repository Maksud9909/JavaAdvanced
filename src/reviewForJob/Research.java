package reviewForJob;

public class Research {
    String nameOfPaper;
    String author;
    int year;


    public Research(String nameOfPaper, String author, int year) {
        this.nameOfPaper = nameOfPaper;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Research{" +
                "nameOfPaper='" + nameOfPaper + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public String getNameOfPaper() {
        return nameOfPaper;
    }

    public void setNameOfPaper(String nameOfPaper) {
        this.nameOfPaper = nameOfPaper;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
