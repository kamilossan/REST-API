package restapi;

/**
 * Created by KPSHi on 22/12/2016.
 */

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FilmController {
    @RequestMapping("/films")
    public Film[] get(@RequestParam(value = "title", defaultValue = "") String title) {
        Collection<Film> y = new Collection<Film>(c);
        Film[] x = new Film[y.size()];
        int n = 0;

        if (title == "") {
            for (Film z : y) {
                x[n] = z;
            }
        } else for (Film z : y) {
            if (z.getTitle() == title) {
                x = new Film[]{z};
            }
        }
        return x;

    }
    public void delete(@RequestParam(value = "title", defaultValue = "") String title){
        Collection<Film> y = new Collection<Film>(c);
        for (Film z : y) {
            if (z.getTitle() == title) {
                z=null;
            }
    }}
    public void put(@RequestParam(value = "title", defaultValue = "") String title, @RequestParam(value = "film") Film film){
        Collection<Film> y = new Collection<Film>(c);
        for (Film z : y) {
            if (z.getTitle() == title) {
                z=film;
            }
        }
    }

}
