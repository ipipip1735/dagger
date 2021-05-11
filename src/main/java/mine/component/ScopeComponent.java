package mine.component;

import dagger.Component;
import mine.AssistedInjectionTrial;
import mine.ScopeTrial;
import mine.scope.TheScope;

/**
 * Created by LFM on 2021/5/10.
 */
@TheScope
@Component
public interface ScopeComponent {
    void inject(ScopeTrial scopeTrial);

}