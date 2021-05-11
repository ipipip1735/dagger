package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProductionComponent;
import mine.data.Dog;
import mine.data.Person;
import mine.module.ExecutorModule;
import mine.module.OptionalModule;
import mine.module.TheProducerModule;

import java.util.Optional;

/**
 * Created by LFM on 2021/5/8.
 */
//@ProductionComponent(modules = {ExecutorModule.class, TheProducerModule.class})
//public interface TheProductionComponent {
////    ListenableFuture<Set<Person>> persons();
////    ListenableFuture<Dog> dog();
////    ListenableFuture<Person> pp();
////    TheProductionSubComponent theProductionSubComponent();
//
//}


/**
 * using Optional bindings
 */
@ProductionComponent(modules = {TheProducerModule.class, OptionalModule.class, ExecutorModule.class})
public interface TheProductionComponent {
    ListenableFuture<Dog> dog();
}
