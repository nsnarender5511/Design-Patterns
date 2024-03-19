public class Bots implements Observer{

    public String name;

    public Bots(String name) {
        this.name = name;
    }

    public void display(String notifier){
        for(int i=0;i<5;i++){
            System.out.println(this.name + " updated by Amazon For" + notifier);
        }
    }

    @Override
    public Observer update() {
        Iphone iphone = new Iphone();
        iphone.add(this);

        System.out.println(this.name + " Going to subscribe for " + Iphone.class.getName());
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
