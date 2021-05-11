package mine.module;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.multibindings.IntoSet;
import dagger.producers.Produced;
import dagger.producers.Producer;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import mine.data.Cat;
import mine.data.Dog;
import mine.data.Person;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/**
 * Created by LFM on 2021/5/8.
 */
/**
 * basc using
 */
//@ProducerModule
//public class TheProducerModule {
//    @Produces
//    public static ListenableFuture<Person> person(){
//        System.out.println("~~person~~");
//        return Futures.immediateFuture(new Person());
//    }
//
//    @Produces
//    public static Dog dog(Person person){
//        System.out.println("person = " + person);
//        return new Dog();
//    }
//}


/**
 * handle with Throwable
 */
//@ProducerModule
//public class TheProducerModule {
//    @Produces
//    public static ListenableFuture<Person> person(){
//        return Futures.immediateFailedFuture(new Error("XX"));
//    }
//
//    @Produces
//    public static Dog dog(Produced<Person> person){
//
//        try {
//            System.out.println("person = " + person.get());
//        } catch (ExecutionException e) {
//            System.out.println("e = " + e);
//            e.printStackTrace();
//        }
//        return new Dog();
//    }
//}


/**
 * using lazy loading
 */
//@ProducerModule
//public class TheProducerModule {
//    @Produces
//    public static ListenableFuture<Person> person() {
//        System.out.println("~~person.person~~");
////        try {
////            Thread.sleep(5000L);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        return Futures.immediateFuture(new Person());
//    }
//
//    @Produces
//    public static Dog dog(Producer<Person> person) {
//
//        System.out.println("one|" + Thread.currentThread());
//        try {
//            person();
//            System.out.println("person = " + person.get().get());
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//        System.out.println("two|" + Thread.currentThread());
//
//
//        return new Dog();
////        return person.get();
//    }
//}


/**
 * using multiple binding
 */
//@ProducerModule
//public class TheProducerModule {
//    @Produces
//    @IntoSet
//    public static ListenableFuture<Person> person1() {
//        System.out.println("~~person.person~~");
//        return Futures.immediateFuture(new Person());
//    }
//
//    @Produces
//    @IntoSet
//    public static ListenableFuture<Person> person2() {
//        System.out.println("~~person.person~~");
//        return Futures.immediateFuture(new Person());
//    }
//
////    @Produces
////    public static Dog dog(Set<Person> personSet) {
////        System.out.println("personSet = " + personSet);
////        return new Dog();
////    }
//}


/**
 * basc optional bindings
 */
@ProducerModule
public class TheProducerModule {
    @Produces
    public static ListenableFuture<Person> person(){
        System.out.println("~~person~~");
        return Futures.immediateFuture(new Person());
    }

    @Produces
    public static Dog dog(Optional<Person> optionalPerson){
        System.out.println("optionalPerson = " + optionalPerson);
        return new Dog();
    }
}
