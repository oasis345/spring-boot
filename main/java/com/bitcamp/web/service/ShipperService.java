package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.ShipperDTO;

import org.springframework.stereotype.Component;

@Component
public interface ShipperService {

    public void addShipper(ShipperDTO shipper);
    public List<ShipperDTO> findShippers();
    public List<ShipperDTO> findShippersByOption(String shipperName);
    public ShipperDTO findShipperByShipperId(String shipperId);
    public void updateShipper(ShipperDTO shipper);
    public void deleteShipper(String shipperId);
}