package Human;

public class Human{
    private int age;
    private int weight;
    private String name;
    private char gender;
    Human(){}
    Human(int age, int weight, String name, char gender){
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void sleep (boolean state){
        if(state)
            System.out.println("asleep");
        else
            System.out.println("awake");
    }

    @Override
    public String toString() {
        return "Name: " + name + "; gender: " + gender +"; age: " + age + "; weight: " + weight;
    }
}
