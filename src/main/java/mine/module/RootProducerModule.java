package mine.module;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import mine.data.Child;
import mine.data.Dog;
import mine.data.Person;

/**
 * Created by LFM on 2021/5/9.
 */
@ProducerModule
public class RootProducerModule {
    @Produces
    public static ListenableFuture<Child> child(){
        return Futures.immediateFuture(new Child());
    }
}
