package com.ice.common;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.*;
import javax.persistence.metamodel.EntityType;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public abstract class BaseDao<T,PK extends Serializable> {

    @Autowired
    protected SessionFactory sessionFactory;

    protected final Class<T> entityClass;

    protected BaseDao(Class<T> entityClass){
        this.entityClass=entityClass;
    }

    public T get(PK id){
        sessionFactory.getCurrentSession().get(entityClass,id);
    }

    public List<T> findAll(){
        CriteriaQuery<T> createQuery = new CriteriaQuery<T>() {
            public CriteriaQuery<T> select(Selection<? extends T> selection) {
                return null;
            }

            public CriteriaQuery<T> multiselect(Selection<?>... selections) {
                return null;
            }

            public CriteriaQuery<T> multiselect(List<Selection<?>> list) {
                return null;
            }

            public CriteriaQuery<T> where(Expression<Boolean> expression) {
                return null;
            }

            public CriteriaQuery<T> where(Predicate... predicates) {
                return null;
            }

            public CriteriaQuery<T> groupBy(Expression<?>... expressions) {
                return null;
            }

            public CriteriaQuery<T> groupBy(List<Expression<?>> list) {
                return null;
            }

            public CriteriaQuery<T> having(Expression<Boolean> expression) {
                return null;
            }

            public CriteriaQuery<T> having(Predicate... predicates) {
                return null;
            }

            public CriteriaQuery<T> orderBy(Order... orders) {
                return null;
            }

            public CriteriaQuery<T> orderBy(List<Order> list) {
                return null;
            }

            public CriteriaQuery<T> distinct(boolean b) {
                return null;
            }

            public List<Order> getOrderList() {
                return null;
            }

            public Set<ParameterExpression<?>> getParameters() {
                return null;
            }

            public <X> Root<X> from(Class<X> aClass) {
                return null;
            }

            public <X> Root<X> from(EntityType<X> entityType) {
                return null;
            }

            public Set<Root<?>> getRoots() {
                return null;
            }

            public Selection<T> getSelection() {
                return null;
            }

            public List<Expression<?>> getGroupList() {
                return null;
            }

            public Predicate getGroupRestriction() {
                return null;
            }

            public boolean isDistinct() {
                return false;
            }

            public Class<T> getResultType() {
                return null;
            }

            public <U> Subquery<U> subquery(Class<U> aClass) {
                return null;
            }

            public Predicate getRestriction() {
                return null;
            }
        };
        sessionFactory.getCurrentSession().createQuery;
    }

}
