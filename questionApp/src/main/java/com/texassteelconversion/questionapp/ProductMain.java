package com.texassteelconversion.questionapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ProductMain {
    
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        List<Product> productListSorted;
        ProductGen pg= new ProductGen();
        
        productList.add(pg.getProduct(0, 305));
        productList.add(pg.getProduct(1, 305));
        productList.add(pg.getProduct(0, 75));
        productList.add(pg.getProduct(1, 405));
        productList.add(pg.getProduct(1, 36));
        productList.add(pg.getProduct(0, 936));
        productList.add(pg.getProduct(0, 504));
        productList.add(pg.getProduct(1, 900));
        productList.add(pg.getProduct(1, 376));
        
        productListSorted= productSort(productList);
        
        
        System.out.printf("\n\nAnswer for Total cost for all products is: $%.2f\n", totalCostProducts(productListSorted));
        System.out.printf("\n\nAnswer for Total cost for all 8Rd products is: $%.2f\n", totalCostEightRound(productListSorted));
        
    }
    
    public static List<Product> productSort(List<Product> pl){
        /*
            this method returns a List of Product sorted by Product Type then by Product Quantity
        */
    
        //place your code here then copy into answer space on question form
    }
    
    public static double totalCostProducts(List<Product> pl){
        /*
            This method returns the total cost of products in the List parameter.
            The Product cost equals Product quantity multiplied by Product cost per item.
        */
        
        //place your code here then copy into answer space on question form
    }
    
    public static double totalCostEightRound(List<Product> pl){
        /*
            This method returns the total cost of EightRound products in the List parameter.
            The Product cost equals Product quantity multiplied by Product cost per item.
        */
        
        //place your code here then copy into answer space on question form
    }
    
}
