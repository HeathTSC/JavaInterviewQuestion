/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texassteelconversion.questionapp;

/**
 *
 * @author Heath
 */
public class ProductGen {

    public ProductGen() {
    }
    
    public Product getProduct(int typeId, int quantity) {
        Product p = null;
        if (typeId == 0) {
            p = new DrillPipe(quantity);
        } else if (typeId == 1) {
            p = new EightRound(quantity);
        }

        return p;
    }
    
}
