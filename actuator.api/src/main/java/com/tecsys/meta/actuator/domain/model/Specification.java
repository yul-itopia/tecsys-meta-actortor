//: com.tecsys.meta.actuator.domain.model.Specification.java

package com.tecsys.meta.actuator.domain.model;


public interface Specification<T extends Configuration> {

    ValidationResult IsSatisfiedBy(T configuration);

    // Specification And(Specification other);
    // Specification AndNot(Specification other);
    // Specification Or(Specification other);
    // Specification OrNot(Specification other);
    // Specification Not();

}///:~