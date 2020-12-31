package com.world_tech_point.worldwide_knowledge.services;

public class ListItem {

    private int categoryImage;
    private String categoryName;

    public ListItem() {}

    public ListItem(int categoryImage, String categoryName) {
        this.categoryImage = categoryImage;
        this.categoryName = categoryName;
    }

    public int getCategoryImage() {
        return categoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
