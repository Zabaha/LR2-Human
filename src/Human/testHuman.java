package Human;

public class testHuman {

    public static void main(String[] args) {
        Human Artem = new Human(18, 68, "Artem", 'M');
        Artem.sleep(true);
        System.out.println(Artem);
        Human person1 = new Human();
        person1.setAge(20);
        person1.setGender('F');
        person1.setWeight(50);
        person1.setName("Nasty");
        System.out.println(person1);
        Head hA = new Head("Blue", "Blond", Artem);
        System.out.println(hA);
        Head hP1 = new Head();
        hP1.setEyeColor("Hazer");
        hP1.setHairColor("Brunette");
        hP1.setPerson(person1);
        System.out.println(hP1);
        leg lA = new leg("left", Artem);
        System.out.println(lA);
        leg rA = new leg("right", Artem);
        System.out.println(rA);
        leg lP1 = new leg();
        lP1.setPosition("Left");
        lP1.setPerson(person1);
        leg rP1 = new leg();
        rP1.setPosition("Right");
        rP1.setPerson(person1);
        System.out.println(lP1.toString() + "; " +rP1.toString());
        Hand lhA = new Hand("left", Artem);
        System.out.println(lhA);
        Hand rhA = new Hand("right", Artem);
        System.out.println(rhA);
        Hand lhP1 = new Hand();
        lhP1.setPosition("Left");
        lhP1.setPerson(person1);
        Hand rhP1 = new Hand();
        rhP1.setPosition("Right");
        rhP1.setPerson(person1);
        System.out.println(lhP1.toString() + "; " +rhP1.toString());
    }
}
