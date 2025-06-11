package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.exceptions.OrdonnanceMedecinNotFoundException;
import org.zzn.hospital.exceptions.OrdonnanceNotFoundException;
import org.zzn.hospital.entitys.OrdonnanceMedecine;
import org.zzn.hospital.repositories.OrdonnanceMedecineRepository;
import java.util.List;
@Service
@AllArgsConstructor
public class OrdonnanceMedecineServiceImpl implements  OrdonnanceMedecineService {
    private final OrdonnanceMedecineRepository ordonnanceMedecineRepository;
    @Override
    public OrdonnanceMedecine addOrdonnanceMedecine(OrdonnanceMedecine ordonnanceMedecine) {
     if(ordonnanceMedecine.getQuantity() <= 0){
         throw new IllegalArgumentException("Quantity must be greater than 0");

     }
     if (ordonnanceMedecine.getDausage() <= 0){
         throw new IllegalArgumentException("Dausage must be greater than 0");

     }
     return ordonnanceMedecineRepository.save(ordonnanceMedecine);
    }

    @Override
    public List<OrdonnanceMedecine> getAllOrdonnanceMedecine() {
        return ordonnanceMedecineRepository.findAll();
    }

    @Override
    public OrdonnanceMedecine getByIdOrdonnanceMedecine(Long id) {
        return ordonnanceMedecineRepository.findById(id)
                .orElseThrow(() -> new OrdonnanceMedecinNotFoundException("Ordonnance not found "));
    }

    @Override
    public void deleteOrdonnanceMedecine(Long id) {
     if (! ordonnanceMedecineRepository.existsById(id)){
         throw new OrdonnanceNotFoundException("Ordonnance not found");
     }
     ordonnanceMedecineRepository.deleteById(id);
    }

    @Override
    public void updateOrdonnanceMedecine(OrdonnanceMedecine ordonnanceMedecine) {
       if (ordonnanceMedecine.getIdOrdonnanceMedecine() == null ){

       }
    }
}
