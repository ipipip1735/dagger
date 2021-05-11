package mine.module;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.BindsOptionalOf;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import mine.data.Cat;
import mine.data.Child;
import mine.data.Dog;
import mine.data.Person;

/**
 * Created by LFM on 2021/5/10.
 */
@ProducerModule
public class CancelProducerModule {
    @Produces
    public static ListenableFuture<Person> loadPerson(){
        System.out.println(Thread.currentThread() + "|~~loadPerson~~");
        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread());

        return Futures.immediateFuture(new Person());
    }

    @Produces
    public static Dog dog(Person person){
        System.out.println("person = " + person);
        return new Dog();
    }


    @Produces
    public static ListenableFuture<Cat> loadCat(){
        System.out.println(Thread.currentThread() + "|~~loadCat~~");
        try {
            Thread.sleep(8000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Futures.immediateFailedFuture(new Error("xx"));
    }

    @Produces
    public static Child child(Cat cat){
        System.out.println("cat = " + cat);
        return new Child();
    }
}