package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.Component;
import dagger.producers.ProductionComponent;
import mine.AssistedInjectionTrial;
import mine.data.Dog;
import mine.data.Person;
import mine.module.ExecutorModule;
import mine.module.OptionalModule;
import mine.module.TheProducerModule;

import java.util.Optional;

/**
 * Created by LFM on 2021/5/9.
 */
/**
 * Created by LFM on 2021/5/9.
 * <p>
 * using optional bindings
 */
//@Component
//public interface TheComponent {
//    TheProductionSubComponent theProductionSubComponent();
//}

/**
 * using optional bindings
 */
@Component(modules = OptionalModule.class)
public interface TheComponent {
//    Dog dog();
}

/**
 * using assisted injection
 */
//@Component
//public interface TheComponent {
//    void inject(AssistedInjectionTrial assistedInjectionTrial);
//}