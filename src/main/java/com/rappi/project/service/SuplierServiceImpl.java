// Java Program to Illustrate DepartmentServiceImpl.java
// File

// Importing required packages
package com.rappi.project.service;

import com.rappi.project.entity.Suplier;
import com.rappi.project.repository.SuplierRepository;
import com.rappi.project.repository.UserRepository;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class SuplierServiceImpl implements SuplierService {
	
	@Autowired
	private SuplierRepository suplierRepository;

	// Save operation
	@Override
	public Suplier saveSuplier(Suplier suplier)
	{
		return suplierRepository.save(suplier);
	}
	
	// Read operation
	@Override public List<Suplier> fetchSuplierList()
	{
		return (List<Suplier>)
		suplierRepository.findAll();
	}
	
	// Read operation
    @Override public Suplier getSuplier(Long id)
    {
        return suplierRepository.findById(id).get();
    }

	// Update operation
	@Override
	public Suplier updateSuplier(Suplier suplier,Long id)
	{

		Suplier Suplier = suplierRepository.findById(id).get();

		if (Objects.nonNull(suplier.getNombres())
			&& !"".equalsIgnoreCase(
                suplier.getNombres())) {
                    Suplier.setNombres(
                suplier.getNombres());
		}
		return suplierRepository.save(Suplier);
	}

	// Delete operation
	@Override
	public void deleteSuplierById(Long id)
	{
		suplierRepository.deleteById(id);
	}
}
