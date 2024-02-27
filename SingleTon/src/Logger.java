public class Logger implements Cloneable{

    public static Logger instance;
    static {
        instance = new Logger();
    }
    private Logger(){}




    
    public static Logger getLogger(){
        //if(instance ==null) instance =  new Logger();

        return instance;
    }
    void log(String l){
        System.out.println(l);
    }

    public Logger clone(){
        return new Logger();
    }
}
