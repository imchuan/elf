/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 基于Hibernate的持久化实现
 *
 * @author Leon
 */
public interface PersistenceManager {

    <T extends Entity> void saveOrUpdate(T entity);

    <T extends Entity, ID extends Serializable> ID save(T entity);

    <T extends Entity> void update(T entity);

    <T extends Entity, ID extends Serializable> void remove(Class<T> entityClass, ID primaryKey);

    <T extends Entity> void remove(T entity);

    <T extends Entity> void removeAll(Collection<T> entities);

    <T extends Entity, ID extends Serializable> T get(Class<T> entityClass, ID primaryKey);

    <T extends Entity> void batchSaveUpdate(Collection<T> entities);

    <T extends Entity> void batchRemove(Collection<T> entities);

    <T extends Entity> List<T> findAll(Class<T> entityClass);

    <T extends Entity> List<T> findByExample(T entity);

}
