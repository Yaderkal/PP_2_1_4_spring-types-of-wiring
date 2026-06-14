package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Duck5 {


    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    private Egg6 egg;

    public Duck5(Egg6 egg) {
        this.egg = egg;
    }


    @Override
    public String toString() {
        return ", в утке яйцо " + "";
    }
}
