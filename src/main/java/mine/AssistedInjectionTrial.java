package mine;

/**
 * Created by wyh on 2021/5/10.
 */
public class AssistedInjectionTrial {

//    @Inject
//    TheAssistedFactory theAssistedFactory;

    public static void main(String[] args) {
        AssistedInjectionTrial assistedInjectionTrial = new AssistedInjectionTrial();
        assistedInjectionTrial.service();
    }

    private void service() {
        System.out.println("AssistedInjectionTrial.service");

//        DaggerTheComponent.create().inject(this);
//        System.out.println("theAssistedFactory = " + theAssistedFactory);

//        Service service = theAssistedFactory.xx(new Moon(), new Person());
//        System.out.println("service = " + service);


    }
}
