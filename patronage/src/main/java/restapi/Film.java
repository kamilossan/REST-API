package restapi;

/**
 * Created by KPSHi on 22/12/2016.
 */
public class Film {
    public static long id_max=0;
    private final long id;
    private String title;
    private Actor[] actors;

    public Film(String title, Actor[] actors){
        id_max++;
        id = id_max;
        this.title = title;
        this.actors = actors;
    }
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public Actor[] getActors(){
        return actors;
    }
}
