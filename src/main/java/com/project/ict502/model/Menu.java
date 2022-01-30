package com.project.ict502.model;

import java.text.DecimalFormat;

public class Menu {
    private int itemId; // generated by database
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemPicUrl; // url to picture
    private String itemType; // menu type (food, beverage, dessert)

    public Menu() {
        this.itemId = -1;
        this.itemName = null;
        this.itemDescription = null;
        this.itemPicUrl = null;
        this.itemType = null;
    }

    public Menu(int itemId, String itemName, double itemPrice, String itemDescription, String itemPicUrl, String itemType) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemPicUrl = itemPicUrl;
        this.itemType = itemType;
    }

    public Menu(String itemName, double itemPrice, String itemDescription, String itemPicUrl, String itemType) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemPicUrl = itemPicUrl;
        this.itemType = itemType;
    }

    public Menu(Menu menu) {
        this.itemId = menu.itemId;
        this.itemName = menu.itemName;
        this.itemPrice = menu.itemPrice;
        this.itemDescription = menu.itemDescription;
        this.itemPicUrl = menu.itemPicUrl;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemPriceToCurrency() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "RM " + df.format(itemPrice);
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPicUrl() {
        return itemPicUrl;
    }

    public void setItemPicUrl(String itemPicUrl) {
        this.itemPicUrl = itemPicUrl;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}