package org.example.sandbox.generics;

public class Box<T, U> {

    private Integer intValue;
    private Double doubleValue;

    public Box(Integer intValue, Double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;


    }
    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("intValue=").append(intValue);
        sb.append(", doubleValue=").append(doubleValue);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Box box = new Box(1, 1.0);
        System.out.println(box);
    }

}
