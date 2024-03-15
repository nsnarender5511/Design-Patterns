import java.util.Observable;

public class Main {
    public static void main(String[] args) {
        Observer obj1 = new User("Narender");
        Observer obj4 = new Bots("##  BOTS1  ##");
        Observer obj2 = new User("Shakti");
        new Bots("##  BOTS1  ##").update();


        obj2.update();
        obj1.update();
        obj4.update();


        Iphone iphone = new Iphone();
        System.out.println("---------------- Updaing iphone's Stock ----------------------");
        iphone.setOutofStock(false);


    }
}