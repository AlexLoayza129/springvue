// Java Program to Illustrate Department.java File
// Importing required package modules
package com.rappi.project.entity;
 
// Importing required classes
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "Proveedor")
 
// Class
public class Suplier {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_de_proveedor")
    private String nombres;
    
    @Column(name="razon_social")
    private String razonSocial;
    
    @Column(name="ruc")
    private String ruc;
    
    @Column(name="telefono_de_contacto")
    private String telefono;
    

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

      
    @Override
	public String toString(){
		return "Proveedor [id=" + id + ", nombres=" + nombres + ", razonSocial=" + razonSocial + ", ruc=" + ruc + ", telefono=" + telefono + "]";
	}
}