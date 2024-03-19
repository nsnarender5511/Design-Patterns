import java.util.ArrayList;
import java.util.List;

public class Iphone implements OBeservable {

    private Boolean isOutofStock = true;

    private final static List<Observer> usersToNotify = new ArrayList<>();

    public void add(Observer user) {
        //can we print here who is coming to subscribe
        usersToNotify.add(user);

    }

    public void remove(Observer user) {
        usersToNotify.remove(user);
    }

    public void notiffy() {
        for(Observer obj:usersToNotify){
            obj.display("iphone");
        }
    }

    public Boolean getOutofStock() {
        return this.isOutofStock;
    }

    public void setOutofStock(Boolean outofStock) {
        this.isOutofStock = outofStock;
        if(outofStock == false){
            this.notiffy();
        }
    }

}
