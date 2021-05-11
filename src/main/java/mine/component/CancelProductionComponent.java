package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.CancellationPolicy;
import dagger.producers.ProductionComponent;
import mine.data.Cat;
import mine.data.Child;
import mine.data.Dog;
import mine.data.Person;
import mine.module.CancelProducerModule;
import mine.module.ExecutorModule;
import mine.module.TheProducerModule;

import static dagger.producers.CancellationPolicy.Propagation.PROPAGATE;

/**
 * Created by LFM on 2021/5/10.
 */
@ProductionComponent(modules = {CancelProducerModule.class, ExecutorModule.class})
@CancellationPolicy(fromSubcomponents = PROPAGATE)
public interface CancelProductionComponent {
    ListenableFuture<Dog> dd();
//    ListenableFuture<Child> cc();

    TheSubComponent theSubuComponent();
}
