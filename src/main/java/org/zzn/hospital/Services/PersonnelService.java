package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Personnel;

import java.util.List;

public interface PersonnelService {
    Personnel addPersonnel(Personnel personnel);
    void updatePersonnel(Personnel personnel);
    void deletePersonnel(long id);
    Personnel getPersonnelById(long id);
    List<Personnel> getAllPersonnels();
}
