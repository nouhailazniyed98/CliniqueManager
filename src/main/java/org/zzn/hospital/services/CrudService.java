package org.zzn.hospital.services;

import java.util.List;

public interface CrudService <T,ID>{

    public T create(T object);
    public T update(T object);
    public T delete(ID id);
    public T findById(ID id);
    public List<T> findAll();

}
