package com.rappi.project.service;

// Importing required classes
import java.util.List;
import com.rappi.project.entity.Suplier;

public interface SuplierService {
     // Save operation
     Suplier saveSuplier(Suplier suplier);
 
    // Read operation
    List<Suplier> fetchSuplierList();
 
    // Update operation
    Suplier updateSuplier(Suplier suplier, Long id);
 
    // Delete operation
    void deleteSuplierById(Long id);

    Suplier getSuplier(Long id);
}
