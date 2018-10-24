package com.vincent.springbootstudy.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * Created by vincent
 * on 2018/10/17 上午10:53
 */
@Component("my2")
public class MyAbstractHealthIndicator extends AbstractHealthIndicator {

    private static final String VERSION = "v1.0.0";


    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        int code = check();
        if (code != 0) {
            builder.down().withDetail("code", code).withDetail("version", VERSION).build();
        }
        builder.withDetail("code", code)
                .withDetail("version", VERSION).up().build();
    }

    private int check() {
        return 0;
    }

}
