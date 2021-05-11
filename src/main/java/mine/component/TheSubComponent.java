package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.Component;
import dagger.producers.ProductionComponent;
import dagger.producers.ProductionSubcomponent;
import mine.data.Child;
import mine.data.Dog;

/**
 * Created by LFM on 2021/5/10.
 */
@ProductionSubcomponent
public interface TheSubComponent {
    ListenableFuture<Child> cc();
//    ListenableFuture<Dog> dd();
}
