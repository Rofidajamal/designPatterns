public class Singletone {
    public static Singletone instance;

    public static Singletone generateInstance (){
        if (instance == null){
            synchronized (Singletone.class){
                if(instance == null) // double cheking for safe threading
                    instance = new Singletone();

            }
        }
        return instance;

    }
    private Singletone(){

    }
}