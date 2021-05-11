package mine;

import mine.component.DaggerScopeComponent;
import mine.data.Earth;

import javax.inject.Inject;

/**
 * Created by wyh on 2021/5/11.
 */
public class ScopeTrial {

    @Inject
    Earth earth;
    public static void main(String[] args) {
        ScopeTrial scopeTrial = new ScopeTrial();
        scopeTrial.scope();

    }

    private void scope() {
        DaggerScopeComponent.create().inject(this);
        System.out.println("earth = " + earth);
    }
}
