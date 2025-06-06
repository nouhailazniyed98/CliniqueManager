package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.Personnel;
import org.zzn.hospital.Repositories.PersonnelRepository;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {
    private final PersonnelRepository personnelRepository;

    public PersonnelServiceImpl(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public Personnel addPersonnel(Personnel personnel) {

        return personnel;
    }

    @Override
    public void updatePersonnel(Personnel personnel) {

    }

    @Override
    public void deletePersonnel(long id) {

    }

    @Override
    public Personnel getPersonnelById(long id) {
        return null;
    }

    @Override
    public List<Personnel> getAllPersonnels() {
        return List.of();
    }

}
