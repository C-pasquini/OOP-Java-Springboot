import models.Counter;

public class Main {
    public static void main(String[] args){
        Counter counter1 = new Counter(1);
        Counter counter2 = new Counter(2);
        Counter counter3 = new Counter(3);

        System.out.println(Counter.getCount());


        Counter.incrementCount(counter1);

        System.out.println("Number: " + counter1.getNumber() + " Increment: " +Counter.getCount());


        Counter.incrementCount(counter2);

        System.out.println("Number: " + counter2.getNumber() + " Increment: " +Counter.getCount());

        Counter.incrementCount(counter3);

        System.out.println("Number: " + counter3.getNumber() + " Increment: " + Counter.getCount());

        counter1.setNumber(4);
        counter2.setNumber(8);
        counter3.setNumber(16);
        System.out.println("\nWe changed the numbers in the counters\n");
        Counter.incrementCount(counter1);

        System.out.println("Number: " + counter1.getNumber() + " Increment: " +Counter.getCount());


        Counter.incrementCount(counter2);

        System.out.println("Number: " + counter2.getNumber() + " Increment: " +Counter.getCount());

        Counter.incrementCount(counter3);

        System.out.println("Number: " + counter3.getNumber() + " Increment: " + Counter.getCount());
    }
}
