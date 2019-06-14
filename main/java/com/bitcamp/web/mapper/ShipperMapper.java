package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShipperMapper {

    public void insertShipper(ShipperDTO shipper);
    public List<ShipperDTO> selectShippers();
    public List<ShipperDTO> selectShippersByOption(String shipper_Name);
    public ShipperDTO selectShipperByShipperId(String shipper_Id);
    public void updateShipper(ShipperDTO shipper);
    public void deleteShipper(String shipper_Id);
}