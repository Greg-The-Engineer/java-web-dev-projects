package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Sample code to create a menu with menu items
        MenuItem item1 = new MenuItem(9.99, "Chicken Wings", "Appetizer", false);
        MenuItem item2 = new MenuItem(15.99, "Steak", "Main Course", true);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);

        Date today = new Date();
        Menu menu = new Menu(today, menuItems);

        // Display menu details
        System.out.println("Menu Last Updated: " + menu.getLastUpdated());
        for (MenuItem item : menu.getItems()) {
            System.out.println("Item: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("New Item: " + (item.isNew() ? "Yes" : "No"));
            System.out.println();
        }
    }
}