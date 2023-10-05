package Part1References;

public class Main {
    public static void main(String[] args) {
        //Part1.1 Assignments
        Worker wrk1 = new Worker("John");
        Worker wrk2 = wrk1;

        System.out.println("Name: " + wrk1.name);
        System.out.println("Name: " + wrk2.name);

        wrk2.name = "Eugene";
        System.out.println("Name: " + wrk1.name);
        System.out.println("Name: " + wrk2.name);

        System.out.println("Name: " + wrk1);
        System.out.println("Name: " + wrk2);
        //Part1.2 Arguments
        Number i = new Number();          //Declaring an object
        i.num = 13;                       //Assign property
        i.increase(i.num);                  //Using method with parameter passed by value
        System.out.println("Number: " + i.num);
        i.increaseR(i);                             //Using method with parameter passed by reference
        System.out.println("Number: " + i.num);





    }
}