package br.com.grupoacert.api.consumer.model;

import br.com.grupoacert.api.consumer.util.ConversionType;

public class Conversion {

    private Long id;
    private Double celsius;
    private Double fahrenheit;
    private ConversionType type;

    public Conversion() {
    }

    public Conversion(Double celsius, Double fahrenheit, ConversionType type) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public ConversionType getType() {
        return type;
    }

    public void setType(ConversionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "id=" + id +
                ", celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                ", type=" + type +
                '}';
    }
}
