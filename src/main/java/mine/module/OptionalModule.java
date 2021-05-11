package mine.module;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;
import dagger.producers.Produces;
import mine.data.Dog;
import mine.data.Person;

import java.util.Optional;

/**
 * Created by LFM on 2021/5/10.
 */
@Module
public abstract class OptionalModule {
    @BindsOptionalOf
    abstract Person optionalPerson();
}

/**
 * using optional bindings in ordinary componen
 */
//@Module
//public abstract class OptionalModule {
//    @BindsOptionalOf
//    abstract Person optionalPerson();
//
//    @Provides
//    public static Person person(){
//        return new Person();
//    }
//
//    @Provides
//    public static Dog dog(Optional<Person> optionalPerson){
//        System.out.println("optionalPerson = " + optionalPerson);
//        return new Dog();
//    }
//}