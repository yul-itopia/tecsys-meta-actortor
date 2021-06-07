//: com.tecsys.meta.actuator.api.service.AlertConfigService.java

package com.tecsys.meta.actuator.api.service;


import com.tecsys.meta.actuator.domain.model.Configuration;


public interface AlertConfigService<T extends Configuration> {

    void config(T configInfo);

}///:~