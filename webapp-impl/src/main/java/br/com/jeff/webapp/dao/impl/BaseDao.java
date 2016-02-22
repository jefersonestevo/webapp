package br.com.jeff.webapp.dao.impl;

import br.com.jeff.webapp.dao.Dao;
import br.com.jeff.webapp.model.ModelBean;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseDao<E extends ModelBean<ID>, ID> implements Dao<E, ID> {

    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<E> clazz;

    protected BaseDao() {
        clazz = (Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public ID insert(E element) {
        entityManager.persist(element);
        return element.getId();
    }

    @Override
    public ID update(E element) {
        entityManager.merge(element);
        return element.getId();
    }

    @Override
    public List<E> listAll() {
        String hql = "from " + clazz.getSimpleName();
        return entityManager.createQuery(hql, clazz).getResultList();
    }

    @Override
    public E findById(ID id) {
        return entityManager.find(clazz, id);
    }
}
