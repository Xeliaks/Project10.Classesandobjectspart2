package Part1References;

public class Number {
    public int num;

    public void increase(int i){                    //Argument of a method is a value
        i++;
    }

    public void increaseR(Number i){                //Argument of a method is a reference
        i.num++;
    }


}
