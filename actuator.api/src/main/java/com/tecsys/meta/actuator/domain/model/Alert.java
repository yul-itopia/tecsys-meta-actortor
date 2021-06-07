//: com.tecsys.meta.actuator.domain.model.Alert.java

package com.tecsys.meta.actuator.domain.model;


import java.util.concurrent.Callable;


public interface Alert extends Callable<ValidationResult> {

}///:~