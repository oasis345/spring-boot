package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.SupplierDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SupplierMapper {
    public void insertSupplier(SupplierDTO supplier);
    public List<SupplierDTO> selectSuppliers();
    public List<SupplierDTO> selectSuppliersByOption(String supplier_Name);
    public SupplierDTO selectSupplierBySupplierId(String supplier_Id);
    public void updateSupplier(SupplierDTO supplier);
    public void deleteSupplier(String supplier_Id);
}