package Human;

public class leg{
    private String position;
    private Human person;
    leg(){}
    leg(String position, Human person){
        this.position = position;
        this.person = person;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPerson(Human person) {
        this.person = person;
    }

    public Human getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return position + " leg; " + person.getName();
    }
}
