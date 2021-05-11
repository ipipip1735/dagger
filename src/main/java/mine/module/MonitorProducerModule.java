package mine.module;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import dagger.producers.monitoring.ProducerMonitor;
import dagger.producers.monitoring.ProducerToken;
import dagger.producers.monitoring.ProductionComponentMonitor;
import mine.data.Dog;
import mine.data.Person;

/**
 * Created by LFM on 2021/5/8.
 */
@ProducerModule
public class MonitorProducerModule {
    @Provides
    @IntoSet
    static ProductionComponentMonitor.Factory provideMonitorFactory() {
        return new ProductionComponentMonitor.Factory() {
            @Override
            public ProductionComponentMonitor create(Object component) {
                System.out.println("MonitorProducerModule.create");
                System.out.println("component = " + component);
                return new ProductionComponentMonitor() {
                    @Override
                    public ProducerMonitor producerMonitorFor(ProducerToken token) {
                        System.out.println("MonitorProducerModule.producerMonitorFor");
                        System.out.println("token = " + token);
                        return new ProducerMonitor() {
                            @Override
                            public void requested() {
                                System.out.println("MonitorProducerModule.requested");
                                super.requested();
                            }

                            @Override
                            public void ready() {
                                System.out.println("MonitorProducerModule.ready");
                                super.ready();
                            }

                            @Override
                            public void methodStarting() {
                                System.out.println("MonitorProducerModule.methodStarting");
                                super.methodStarting();
                            }

                            @Override
                            public void methodFinished() {
                                System.out.println("MonitorProducerModule.methodFinished");
                                super.methodFinished();
                            }

                            @Override
                            public void succeeded(Object value) {
                                System.out.println("MonitorProducerModule.succeeded");
                                System.out.println("value = " + value);
                                super.succeeded(value);
                            }

                            @Override
                            public void failed(Throwable t) {
                                System.out.println("MonitorProducerModule.failed");
                                System.out.println("t = " + t);
                                super.failed(t);
                            }

                            @Override
                            public <T> void addCallbackTo(ListenableFuture<T> future) {
                                System.out.println("MonitorProducerModule.addCallbackTo");
                                System.out.println("future = " + future);
                                super.addCallbackTo(future);
                            }
                        };
                    }
                };
            }
        };
    }
}