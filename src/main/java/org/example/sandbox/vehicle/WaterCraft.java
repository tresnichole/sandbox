package org.example.sandbox.vehicle;

        import java.io.Serializable;

public abstract class WaterCraft extends Vehicle implements Floatable{

    protected int displacement;

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void sail(){
        System.out.println("Watercraft sailing");
    }

    @Override
    public void launch(){
        System.out.println("Launching Water Craft");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WaterCraft{");
        sb.append("loadCapacity=").append(loadCapacity);
        sb.append(", displacement=").append(displacement);
        sb.append('}');
        return sb.toString();
    }
}
