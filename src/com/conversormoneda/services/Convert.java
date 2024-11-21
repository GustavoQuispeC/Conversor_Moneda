package com.conversormoneda.services;

public class Convert {
    private final Service service;

    public Convert() {
        this.service = new Service();
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        double exchangeRate = service.getExchangeRate(fromCurrency, toCurrency);
        return amount * exchangeRate;
    }
}
