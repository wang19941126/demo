package com.ht.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseService <PK extends Serializable,T> {
	List<T> list();
	void insert(T t);
	void update(T t);
	void delete(PK id);
    T getById(PK id);
}
