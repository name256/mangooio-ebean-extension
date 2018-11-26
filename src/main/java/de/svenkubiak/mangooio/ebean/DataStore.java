/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.svenkubiak.mangooio.ebean;

import com.google.inject.Singleton;
import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Query;
import io.ebean.SqlQuery;
import io.ebean.SqlUpdate;
import io.ebean.Transaction;
import io.ebean.UpdateQuery;
import java.util.Collection;

/**
 *
 * @author silicon
 */
@Singleton
public class DataStore {

    /**
     *
     * Start a transaction with 'REQUIRED' semantics.
     *
     * @param server
     * @return
     */
    public Transaction beginTransaction(String server) {
        return getServer(server).beginTransaction();
    }

    /**
     *
     * Commit the current transaction
     *
     * @param server
     */
    public void commitTransaction(String server) {
        getServer(server).commitTransaction();
    }

    /**
     *
     * Create a new instance of T that is an EntityBean.
     *
     * @param <T>
     * @param server
     * @param type
     * @return
     */
    public <T> T createEntityBean(String server, Class<T> type) {
        return getServer(server).createEntityBean(type);
    }

    /**
     *
     * Create a query for an entity bean and synonym for find(Class).
     *
     * @param <T>
     * @param server
     * @param beanType
     * @return
     */
    public <T> Query<T> createQuery(String server, Class<T> beanType) {
        return getServer(server).createQuery(beanType);
    }

    /**
     *
     * Create a SqlQuery for executing native sql query statements.
     *
     * @param server
     * @param sql
     * @return
     */
    public SqlQuery createSqlQuery(String server, String sql) {
        return getServer(server).createSqlQuery(sql);
    }

    /**
     *
     * Create a sql update for executing native dml statements.
     *
     * @param server
     * @param sql
     * @return
     */
    public SqlUpdate createSqlUpdate(String server, String sql) {
        return getServer(server).createSqlUpdate(sql);
    }

    /**
     *
     * Create a new transaction that is not held in TransactionThreadLocal.
     *
     * @param server
     * @return
     */
    public Transaction createTransaction(String server) {
        return getServer(server).createTransaction();
    }

    /**
     *
     * Returns the current transaction or null if there is no current
     * transaction in scope.
     *
     * @param server
     * @return
     */
    public Transaction currentTransaction(String server) {
        return getServer(server).currentTransaction();
    }

    /**
     *
     * Delete the bean given its type and id.
     *
     * @param server
     * @param beanType
     * @param id
     * @return
     */
    public int delete(String server, Class<?> beanType, Object id) {
        return getServer(server).delete(beanType, id);
    }

    /**
     *
     * Delete the bean.
     *
     * @param server
     * @param bean
     * @return
     */
    public boolean delete(String server, Object bean) {
        return getServer(server).delete(bean);
    }

    /**
     *
     * Delete several beans given their type and id values.
     *
     * @param server
     * @param beanType
     * @param ids
     * @return
     */
    public int deleteAll(String server, Class<?> beanType, Collection<?> ids) {
        return getServer(server).deleteAll(beanType, ids);
    }

    /**
     *
     * Delete several beans given their type and id values.
     *
     * @param server
     * @param beans
     * @return
     */
    public int deleteAll(String server, Collection<?> beans) {
        return getServer(server).deleteAll(beans);
    }

    /**
     *
     * Create a query for a type of entity bean.
     *
     * @param <T>
     * @param server
     * @param beanType
     * @return
     */
    public <T> Query<T> find(String server, Class<T> beanType) {
        return getServer(server).find(beanType);
    }

    /**
     *
     * Find a bean using its unique id.
     *
     * @param <T>
     * @param server
     * @param beanType
     * @param id
     * @return
     */
    public <T> T find(String server, Class<T> beanType, Object id) {
        return getServer(server).find(beanType, id);
    }

    /**
     *
     * Get the named ebean server
     *
     *
     * @param server
     * @return
     */
    public EbeanServer getServer(String server) {
        return Ebean.getServer(server);
    }

    /**
     *
     * Rollback the current transaction.
     *
     * @param server
     */
    public void rollbackTransaction(String server) {
        getServer(server).rollbackTransaction();
    }

    /**
     *
     * Either Insert or Update the bean depending on its state.
     *
     * @param server
     * @param bean
     */
    public void save(String server, Object bean) {
        getServer(server).save(bean);
    }

    /**
     *
     * Save all the beans in the collection.
     *
     * @param server
     * @param beans
     * @return
     */
    public int saveAll(String server, Collection<?> beans) {
        return getServer(server).saveAll(beans);
    }

    /**
     *
     * Create an Update query to perform a bulk update.
     *
     * @param <T>
     * @param server
     * @param beanType
     * @return
     */
    public <T> UpdateQuery<T> update(String server, Class<T> beanType) {
        return getServer(server).update(beanType);
    }

    /**
     *
     * Saves the bean using an update.
     *
     * @param server
     * @param bean
     */
    public void update(String server, Object bean) {
        getServer(server).update(bean);
    }

    /**
     *
     * Update a collection of beans.
     *
     * @param server
     * @param beans
     */
    public void updateAll(String server, Collection<?> beans) {
        getServer(server).updateAll(beans);
    }
}
