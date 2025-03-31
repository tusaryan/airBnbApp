package com.tusaryan.projects.airBnbApp.strategy;

import com.tusaryan.projects.airBnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
