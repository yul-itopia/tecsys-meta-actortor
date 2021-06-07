//: com.tecsys.meta.actuator.domain.model.SkeletalAlert.java

package com.tecsys.meta.actuator.domain.model;


import java.util.Set;


public abstract class SkeletalAlert<T extends Configuration> implements Alert {

    private Long id;
    private T configuration;
    private Specification<T> specification;
    private Set<Action> actions;

}///:~