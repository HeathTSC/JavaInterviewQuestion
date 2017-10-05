
package com.texassteelconversion.questionapp;

import java.util.Objects;

public class DrillPipe implements Product{
    private String type;
    private double size;
    private double weight;
    private int quantity;
    private double costPerItem;

    public DrillPipe() {
        this.type="Drill Pipe";
        this.size=2.875;
        this.weight=16.5;
        this.costPerItem=178.56;
        
    }

    public DrillPipe(int quantity) {
        this.type="Drill Pipe";
        this.size=2.875;
        this.weight=16.5;
        this.costPerItem=178.56;
        this.quantity = quantity;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getCostPerItem() {
        return costPerItem;
    }

    public void setCostPerItem(double costPerItem) {
        this.costPerItem = costPerItem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DrillPipe other = (DrillPipe) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DrillPipe{" + "type=" + type + ", size=" + size + ", weight=" + weight + ", quantity=" + quantity + ", costPerItem=" + costPerItem + '}';
    }
    
    
    
}
