public class FreundeTest {

    public static void  main (String [] args){

        Anschrift anschrift = new Anschrift("Raketenweg","12", 90560,"Entenhausen");
        System.out.println(anschrift.toString());
        Person daniel = new Person("Daniel Düsentrieb");
        daniel.setAnschrift(anschrift);
        System.out.println("Daniel.name():"+daniel.getName());
        System.out.println(daniel.toString()+"\n");

        Person donald = new Person("Donald Duck");
        Anschrift anschrift1 = new Anschrift("Entengasse", "3", 90560, "Entenhausen");
        donald.setAnschrift(anschrift1);
        System.out.println("Donald.name():"+donald.getName());
        System.out.println(donald.toString()+"\n");

        Person gustav = new Person("Gustav Gans ");
        Anschrift anschrift2 = new Anschrift("Gaenseacker ", "9 ", 90560, " Entenhausen");
        gustav.setAnschrift(anschrift2);
        System.out.println("Gustav Gans():"+gustav.getName());
        System.out.println(gustav.toString()+"\n");
        System.out.println("Gustav and Daniele werden jetzt Freunde");

        daniel.befreunden(gustav);
        gustav.befreunden(daniel);
        System.out.println(daniel.toString());
        System.out.println(gustav.toString());

        Person person = new Person("person");
        System.out.println("\nEine geheimnisvolle Person befreundet sich mit allen anderen\n");
        person.befreunden(daniel);
        daniel.befreunden(person);
        person.befreunden(donald);
        donald.befreunden(person);
        person.befreunden(gustav);
        gustav.befreunden(person);
        System.out.println(person.toString());


    }
}
