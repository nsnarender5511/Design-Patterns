public class User implements Observer{

    public String name;

    public User(String name) {
        this.name = name;
    }

    public Observer update() {
        Iphone iphone = new Iphone();
        iphone.add(this);
        System.out.println(this.name + " Going to subscribe for " + Iphone.class.getName());
        return null;
    }

    public void display(String notifier){
        System.out.println(this.name + " updated by Amazon For" + notifier);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
