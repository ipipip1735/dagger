package mine.module;

import dagger.Module;
import dagger.Provides;
import dagger.producers.Production;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by LFM on 2021/5/8.
 */
@Module
public class ExecutorModule {
    @Production
    @Provides
    public static Executor executor() {
        return Executors.newSingleThreadExecutor();
    }
}
