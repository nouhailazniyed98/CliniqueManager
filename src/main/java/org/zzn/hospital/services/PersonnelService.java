package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Personnel;

import java.util.List;

public interface PersonnelService {
    Personnel addPersonnel(Personnel personnel);
    void updatePersonnel(Personnel personnel);
    void deletePersonnel(long id);
    Personnel getPersonnelById(long id);
    List<Personnel> getAllPersonnels();
}
