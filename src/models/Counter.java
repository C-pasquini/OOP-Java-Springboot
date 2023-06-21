package models;

public class Counter {
    public Counter(int number){
        this.number = number;
    }

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    static int count;

   public static int getCount(){
       return Counter.count;
   }

   public static void incrementCount(Counter counter){
       Counter.count += counter.getNumber();
   }
}
