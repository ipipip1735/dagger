package mine.module;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import mine.data.Dog;
import mine.data.Moon;
import mine.data.Person;

/**
 * Created by LFM on 2021/5/9.
 */
@ProducerModule
public class SubProducerModule {
    @Produces
    public static ListenableFuture<Moon> moon(){
        return Futures.immediateFuture(new Moon());
    }
}
