public class Person {

    private String name;
    private Anschrift anschrift;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }
   public void befreunden(Person p){

   }
    public String toString() {
        String freund = "Name: "+this.name;
        return freund;
    }
}
