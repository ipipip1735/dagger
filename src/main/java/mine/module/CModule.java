package mine.module;

import dagger.Module;
import dagger.Provides;
import mine.data.Dog;
import mine.data.Moon;
import mine.data.Person;

import java.util.Optional;

/**
 * Created by LFM on 2021/5/11.
 */
@Module
public class CModule {
//    @Provides
//    public static Person person() {
//        return new Person();
//    }

    @Provides
    public static Dog dog(Optional<Person> person) {
        System.out.println("person = " + person);
        person.ifPresent(System.out::println);
        return new Dog();
    }


}
