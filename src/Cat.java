public class Cat {
    String name = "JOHN";
    String colour = "BLACK";
    int age = 1;
    String type = "PERSIA";
    String food = "WHISKS";

    public void catHungry(){
        System.out.println(this.name + " is hungry ");
    }

    public void catEat(){
        System.out.println(this.name + " is eating " + this.food);
    }

    public void scream(){
        System.out.println(this.name + " is scream");
    }



}
