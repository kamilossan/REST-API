package restapi;

/**
 * Created by KPSHi on 22/12/2016.
 */
public class Actor {
    public static long id_max=0;
    private final long id;
    private String name;

    public Actor(String name){
        id_max++;
        this.id = id_max;
        this.name = name;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
