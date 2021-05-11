package mine.component;

import dagger.Component;
import mine.OptionalTrial;
import mine.ScopeTrial;
import mine.module.CModule;
import mine.module.OptionalModule;
import mine.scope.TheScope;

/**
 * Created by LFM on 2021/5/11.
 */
@Component(modules = {CModule.class, OptionalModule.class})
public interface OptionalComponent {
    void inject(OptionalTrial optionalTrial);

}