package com.vides.hotel_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vides.hotel_api.dao.SupplierRepository;
import com.vides.hotel_api.dto.Supplier.SupplierRequest;
import com.vides.hotel_api.dto.Supplier.SupplierResponse;
import com.vides.hotel_api.models.Supplier;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public SupplierResponse create(SupplierRequest supplierRequest) throws Exception{
        if (supplierRequest == null) {
            throw new Exception("Invalid Supplier request");
        }

        if (supplierRequest.getName() == null || supplierRequest.getContactInformation() == null) {
            throw new Exception("Invalid Supplier request");
        }

        Supplier supplier = new Supplier();
        supplier.setName(supplierRequest.getName());
        supplier.setContactInformation(supplierRequest.getContactInformation());
       
        this.supplierRepository.save(supplier);

        return new SupplierResponse(supplier.getName(), supplier.getContactInformation(), "Supplier created successfully");
    }

    public SupplierResponse getSupplier(Long id) throws Exception{
        if (id == null) {
            throw new Exception("Invalid Supplier id");
        }

        Supplier supplier = this.supplierRepository.findById(id).orElse(null);

        if (supplier == null) {
            throw new Exception("Supplier not found");
        }

        return new SupplierResponse(supplier.getName(), supplier.getContactInformation(), "Supplier found");
    }

    public SupplierResponse updateSupplier(Long id, SupplierRequest supplierRequest) throws Exception{
        if (id == null || supplierRequest == null) {
            throw new Exception("Invalid Supplier request");
        }

        if (supplierRequest.getName() == null || supplierRequest.getContactInformation() == null) {
            throw new Exception("Invalid Supplier request");
        }

        Supplier supplier = this.supplierRepository.findById(id).orElse(null);

        if (supplier == null) {
            throw new Exception("Supplier not found");
        }

        supplier.setName(supplierRequest.getName());
        supplier.setContactInformation(supplierRequest.getContactInformation());
        
        this.supplierRepository.save(supplier);

        return new SupplierResponse(supplier.getName(), supplier.getContactInformation(), "Supplier updated successfully");
    }

    public SupplierResponse deleteSupplier(Long id) throws Exception{
        if (id == null) {
            throw new Exception("Invalid Supplier id");
        }

        Supplier supplier = this.supplierRepository.findById(id).orElse(null);

        if (supplier == null) {
            throw new Exception("Supplier not found");
        }

        this.supplierRepository.delete(supplier);

        return new SupplierResponse(supplier.getName(), supplier.getContactInformation(), "Supplier deleted successfully");
    }

}
