package mine.component;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.producers.ProductionSubcomponent;
import mine.data.Child;
import mine.data.Moon;
import mine.data.Person;
import mine.data.Service;

/**
 * Created by LFM on 2021/5/10.
 */
@AssistedFactory
public interface TheAssistedFactory {
    Service xx(Moon moon, Person person);
}
