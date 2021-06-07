//: com.tecsys.meta.actuator.domain.repository.Repository.java

package com.tecsys.meta.actuator.domain.repository;

public interface Repository<T> {

    T save(T t);
    boolean update(T t);
    T findOne(Long id);
    Iterable<T> findAll();
    Long count();
    void delete(T entity);
    boolean exists(Long primaryKey);

}///:~