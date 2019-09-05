package br.com.grupoacert.api.consumer.util;

public enum ConversionType {

    CelsiusToFahrenheit(1),
    FahrenheitToCelsius(2);

    private final int type;

    ConversionType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
