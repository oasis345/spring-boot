package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;

import org.springframework.stereotype.Component;

@Component
public interface SupplierService {

    public void addSupplier(SupplierDTO supplier);
    public List<SupplierDTO> findSuppliers();
    public List<SupplierDTO> findSuppliersByOption(String supplierName);
    public SupplierDTO findSupplierBySupplierId(String supplierId);
    public void updateSupplier(SupplierDTO supplier);
    public void deleteSupplier(String supplierId);
}