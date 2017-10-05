
package com.texassteelconversion.questionapp;

import java.util.Objects;

public class EightRound implements Product{
    private String type;
    private double size;
    private double weight;
    private int quantity;
    private double costPerItem;

    public EightRound() {
        this.type="8rd";
        this.size=3.5;
        this.weight=19.5;
        this.costPerItem=210.36;
    }

    public EightRound(int quantity) {
        this.type="8rd";
        this.size=3.5;
        this.weight=19.5;
        this.costPerItem=210.36;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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
        final EightRound other = (EightRound) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EightRound{" + "type=" + type + ", size=" + size + ", weight=" + weight + ", quantity=" + quantity + ", costPerItem=" + costPerItem + '}';
    }
    
    
}
