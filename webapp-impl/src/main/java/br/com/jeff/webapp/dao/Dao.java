package br.com.jeff.webapp.dao;

import java.util.List;

public interface Dao<E, ID> {

    ID insert(E element);

    ID update(E element);

    List<E> listAll();

    E findById(ID id);

}
