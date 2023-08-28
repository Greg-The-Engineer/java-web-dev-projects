package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(9.99, "Chicken Wings", "Appetizer", true);
        MenuItem item2 = new MenuItem(14.99, "Steak", "Main Course", true);
        MenuItem item3 = new MenuItem(6.99, "Chocolate Cake", "Dessert", true);

        ArrayList<MenuItem> initialItems = new ArrayList<>();
        initialItems.add(item1);
        initialItems.add(item2);
        initialItems.add(item3);

        Menu menu = new Menu(new Date(), initialItems);

        menu.printMenu();

        MenuItem newItem = new MenuItem(8.49, "French Fries", "Appetizer", true);
        menu.addItem(newItem);

        menu.printMenu();
    }
}