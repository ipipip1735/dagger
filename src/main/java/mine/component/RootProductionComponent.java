package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.Component;
import dagger.producers.ProductionComponent;
import mine.data.Child;
import mine.data.Dog;
import mine.module.RootProducerModule;

/**
 * Created by LFM on 2021/5/9.
 */
@ProductionComponent(dependencies = TheProductionComponent.class)
public interface RootProductionComponent {
//    ListenableFuture<Dog> dog();
}
