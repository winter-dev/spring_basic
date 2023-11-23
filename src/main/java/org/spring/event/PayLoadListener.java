package org.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;

public class PayLoadListener implements ApplicationListener<PayloadApplicationEvent> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent event) {
        System.out.println("PayLoadListener监听到PayloadApplicationEvent事件:" + event.getPayload());
    }
}
