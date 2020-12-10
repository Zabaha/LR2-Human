package Human;

public class Head{
    private String eyeColor;
    private String hairColor;
    private Human person;
    Head(){}
    Head(String eyeColor, String hairColor, Human person){
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.person = person;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setPerson(Human person) {
        this.person = person;
    }

    public Human getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Eye color: " + eyeColor + "; Hair color: " + hairColor + "; " + person.getName();
    }
}
