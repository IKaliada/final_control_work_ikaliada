package com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository;

import java.util.List;

public interface GenericRepository<I, T> {

    void persist(T entity);

    T merge(T entity);

    T findById(I id);

    void removeById(I id);

    List<T> findAll(int offset, int limit);

    int getCountOfEntities();

    List<T> getAllEntity();
}
