package mine;

import com.google.common.util.concurrent.ListenableFuture;
import mine.component.*;
import mine.data.Child;
import mine.data.Dog;

import java.util.concurrent.ExecutionException;

/**
 * Created by wyh on 2021/5/8.
 */
public class ProducersTrial {

    public static void main(String[] args) {
        ProducersTrial producersTrial = new ProducersTrial();
//        producersTrial.lazy();
//        producersTrial.multiple();
//        producersTrial.dependency();
//        producersTrial.subComponent();
//        producersTrial.monitor();
//        producersTrial.cancel();
        producersTrial.Optional();
    }

    private void Optional() {
        //using optional bindings in async component
        DaggerTheProductionComponent.create().dog();

        //using optional bindings in ordinary component
//        DaggerTheComponent.create().dog();

    }

    private void cancel() {
//        CancelProductionComponent cancelProductionComponent = DaggerCancelProductionComponent.create();
//        ListenableFuture<Dog> dogLF = cancelProductionComponent.dd();
//        ListenableFuture<Child> childLF = cancelProductionComponent.cc();

        //
//        dogLF.cancel(true);
//        System.out.println("dogLF.isCancelled() = " + dogLF.isCancelled());
//        System.out.println("catLF.isCancelled() = " + childLF.isCancelled());

        //
//        try {
//            childLF.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            System.out.println("dogLF.isDone() = " + dogLF.isDone());
//            System.out.println("catLF.isDone() = " + childLF.isDone());
//            e.printStackTrace();
//        }


//        CancelProductionComponent cancelProductionComponent = DaggerCancelProductionComponent.create();
//        TheSubComponent theSubComponent = cancelProductionComponent.theSubuComponent();
//
//        ListenableFuture<Dog> dogLF = cancelProductionComponent.dd();
//
//        ListenableFuture<Child> childLF = theSubComponent.cc();
////        ListenableFuture<Dog> dogLF = theSubComponent.dd();
//
//
//        childLF.cancel(true);
//        System.out.println("dogLF.isCancelled() = " + dogLF.isCancelled());
//        System.out.println("catLF.isCancelled() = " + childLF.isCancelled());


    }


    private void monitor() {

//        DaggerMonitorProductionComponent.create().pp();
    }

    private void subComponent() {

        //father component is async
//        DaggerTheProductionComponent.create().theProductionSubComponent().moon();

        //father component is ordinary
//        DaggerTheComponent.create().theProductionSubComponent().moon();
    }

    private void dependency() {
//        DaggerRootProductionComponent.builder()
//                .theProductionComponent(DaggerTheProductionComponent.create())
//                .build()
//                .dog();
    }

    private void multiple() {
        //receive arguments in component
//        DaggerTheProductionComponent.create().persons();

        //receive arguments in provider
//        DaggerTheProductionComponent.create().dog();
    }

    private void lazy() {

//        TheProductionComponent component = DaggerTheProductionComponent.create();
////        component.pp();
//
//        System.out.println("start");
//        component.dog();
//        System.out.println("end");
//
////        try {
////            System.out.println("dog = " + dogListenableFuture.get());
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } catch (ExecutionException e) {
////            e.printStackTrace();
////        }
////        dogListenableFuture.cancel(true);
    }

}
