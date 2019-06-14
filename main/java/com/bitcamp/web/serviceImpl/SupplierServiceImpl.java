package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;
import com.bitcamp.web.service.SupplierService;

import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Override
    public void addSupplier(SupplierDTO supplier) {

    }

    @Override
    public List<SupplierDTO> findSuppliers() {
        return null;
    }

    @Override
    public List<SupplierDTO> findSuppliersByOption(String supplierName) {
        return null;
    }

    @Override
    public SupplierDTO findSupplierBySupplierId(String supplierId) {
        return null;
    }

    @Override
    public void updateSupplier(SupplierDTO supplier) {

    }

    @Override
    public void deleteSupplier(String supplierId) {

    }

    
}