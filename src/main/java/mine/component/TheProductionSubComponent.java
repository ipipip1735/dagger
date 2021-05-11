package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProductionComponent;
import dagger.producers.ProductionSubcomponent;
import mine.data.Dog;
import mine.data.Moon;
import mine.module.ExecutorModule;
import mine.module.SubProducerModule;

/**
 * Created by LFM on 2021/5/9.
 */
/**
 * father component is async
 */
//@ProductionSubcomponent(modules = SubProducerModule.class)
//public interface TheProductionSubComponent {
//    ListenableFuture<Moon> moon();
//}

/**
 * father component is ordinary
 */
@ProductionSubcomponent(modules = {ExecutorModule.class, SubProducerModule.class})
public interface TheProductionSubComponent {
    ListenableFuture<Moon> moon();
}
