// Java Program to Illustrate DepartmentController.java File

// Importing packages modules
package com.rappi.project.web.controller;

import com.rappi.project.entity.Suplier;
import com.rappi.project.service.SuplierService;
import java.util.List;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Validate origin
@CrossOrigin(origins = {"http://localhost:8080"})

// Annotation
@RestController
// Class
public class SuplierController {

	@Autowired private SuplierService suplierService;

	// Save operation
	@PostMapping("/api/proveedores")
	public Suplier saveSuplier(@RequestBody Suplier suplier)
	{
		return suplierService.saveSuplier(suplier);
	}

	// Read operation
	@GetMapping("/api/proveedores")

	public List<Suplier> fetchSuplierList()
	{
		return suplierService.fetchSuplierList();
	}
	
	// Read operation
    @GetMapping("/api/proveedores/{id}")

    public Suplier getSuplier(@PathVariable("id") Long id)
    {
        return suplierService.getSuplier(id);
    }

	// Update operation
	@PutMapping("/api/proveedores/{id}")

	public Suplier
	updateSuplier(@RequestBody Suplier suplier,
					@PathVariable("id") Long id)
	{
		return suplierService.updateSuplier(
			suplier, id);
	}

	// Delete operation
	@DeleteMapping("/api/proveedores/{id}")

	public String deleteSuplierById(@PathVariable("id") Long id)
	{
		suplierService.deleteSuplierById(id);
		return "Deleted Successfully";
	}

}
