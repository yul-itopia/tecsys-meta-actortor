//: com.tecsys.meta.actuator.domain.model.QueueMonitor.java

package com.tecsys.meta.actuator.domain.model;


import java.util.Set;


public class QueueMonitor implements Monitor {

    private Set<SkeletalAlert<? extends Configuration>> alerts;

}///:~