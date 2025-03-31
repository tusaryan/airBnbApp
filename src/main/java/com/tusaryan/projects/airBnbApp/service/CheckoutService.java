package com.tusaryan.projects.airBnbApp.service;

import com.tusaryan.projects.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
