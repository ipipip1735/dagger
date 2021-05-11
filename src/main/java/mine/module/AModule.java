package mine.module;

import dagger.Module;
import dagger.Provides;
import dagger.producers.Production;
import mine.data.Dog;
import mine.data.Moon;
import mine.data.Person;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by LFM on 2021/5/10.
 */
@Module(includes = BModule.class)
public class AModule {
    @Provides
    public static Moon moon() {
        return new Moon();
    }

    @Provides
    public static Dog dog(Person person) {
        System.out.println("person = " + person);
        return new Dog();
    }
}
