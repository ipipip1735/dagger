package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProductionComponent;
import mine.data.Person;
import mine.module.ExecutorModule;
import mine.module.MonitorProducerModule;
import mine.module.TheProducerModule;

/**
 * Created by LFM on 2021/5/9.
 */
@ProductionComponent(modules = {MonitorProducerModule.class, ExecutorModule.class, TheProducerModule.class})
public interface MonitorProductionComponent {
    ListenableFuture<Person> pp();
}
