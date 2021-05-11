package mine.component;

import dagger.Component;
import mine.AssistedInjectionTrial;
import mine.data.Dog;
import mine.data.Moon;
import mine.module.AModule;

/**
 * Created by LFM on 2021/5/10.
 */
@Component(modules = AModule.class)
public interface IncludeComponent {
    Dog go();
}
