package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Patient;

import java.util.List;

public interface CrudService <D,ID>{

    public D create(D object);
    public D update(D object);

    D update(ID id, D dto);

    public D delete(ID id);
    public D findById(ID id);
    public List<D> findAll();

}
