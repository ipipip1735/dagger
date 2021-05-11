package mine;

import mine.component.DaggerIncludeComponent;

/**
 * Created by wyh on 2021/5/10.
 */
public class IncludeTrial {

    public static void main(String[] args) {
        DaggerIncludeComponent.create().go();
    }
}
