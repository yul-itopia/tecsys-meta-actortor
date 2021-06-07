//: com.tecsys.meta.actuator.domain.model.Configuration.java

package com.tecsys.meta.actuator.domain.model;


public interface Configuration {

    enum Type {
        SLOW_QUEUE_MESSAGE, QUEUE_ERROR, PAST_TIMER
    }

    String getName();
    Type getType();

}///:~