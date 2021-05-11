package mine;

import mine.component.DaggerOptionalComponent;
import mine.component.DaggerScopeComponent;
import mine.data.Dog;
import mine.data.Earth;

import javax.inject.Inject;

/**
 * Created by wyh on 2021/5/11.
 */
public class OptionalTrial {

    @Inject
    Dog dog;

    public static void main(String[] args) {
        OptionalTrial scopeTrial = new OptionalTrial();
        scopeTrial.optional();

    }

    private void optional() {
        DaggerOptionalComponent.create().inject(this);
    }
}
