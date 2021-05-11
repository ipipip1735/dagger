package mine.module;

import dagger.Module;
import dagger.Provides;
import dagger.producers.Production;
import mine.data.Moon;
import mine.data.Person;

/**
 * Created by LFM on 2021/5/10.
 */
@Module
public class BModule {
    @Provides
    public static Person person(Moon moon) {
        System.out.println("moon = " + moon);
        return new Person();
    }
}
