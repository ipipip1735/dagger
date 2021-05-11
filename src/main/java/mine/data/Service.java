package mine.data;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

/**
 * Created by Administrator on 2021/5/10.
 */
public class Service {
    @AssistedInject
    public Service(Sun sun, @Assisted Moon moon, @Assisted Person person) {
        System.out.println("sun = " + sun + ", moon = " + moon + ", person = " + person);
    }
}
