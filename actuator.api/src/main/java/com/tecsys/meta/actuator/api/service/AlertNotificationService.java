//: com.tecsys.meta.actuator.api.service.AlertNotificationService.java

package com.tecsys.meta.actuator.api.service;


import com.tecsys.meta.actuator.domain.model.Configuration;


public interface AlertNotificationService {

    void notify(String configNamea);
    void notify(Configuration.Type configType);

}///:~