package restapi;

/**
 * Created by KPSHi on 22/12/2016.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

import org.jdom.Element;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ActorController {
    @RequestMapping("/actors")
    public Actor[] get(@RequestParam(value = "title", defaultValue = "") String title) {
        Collection<Film> y = new Collection<Film>(y);
        Actor[] actors = null;

        for (Film z : y) {
            if (z.getTitle() == title) {
                actors = z.getActors();
            }
        }
        return actors;


    }
    public void delete(@RequestParam(value = "title", defaultValue = "") String title){

        Collection<Film> y = new Collection<Film>(c);
        for (Film z : y) {

            if (z.getTitle() == title) {
               Actor[] x = new Actor[1];
                z = new Film(z.getTitle(), null);
            }
        }}
    public void put(@RequestParam(value = "title", defaultValue = "") String title, @RequestParam(value = "actors") Actor[] actors){
        Collection<Film> y;
        y = new Collection<Film>(c);
        for (Film z : y) {
            if (z.getTitle() == title) {
                z = new Film(z.getTitle(), actors);
            }
        }
    }

}



