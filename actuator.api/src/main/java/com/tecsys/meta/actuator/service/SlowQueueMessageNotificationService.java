//: com.tecsys.meta.actuator.service.SlowQueueMessageNotificationService.java

package com.tecsys.meta.actuator.service;


import com.tecsys.meta.actuator.domain.model.Configuration;
import com.tecsys.meta.actuator.api.service.AlertNotificationService;


public class SlowQueueMessageNotificationService implements AlertNotificationService {

    @Override
    public void notify(String configNamea) {
        System.out.println(">>>>>>> Notify me on " + configNamea);
    }

    @Override
    public void notify(Configuration.Type configType) {
        System.out.println(">>>>>>> Notify me on " + configType);
    }

}///:~