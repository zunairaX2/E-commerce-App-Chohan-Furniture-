package com.example.chohanfurniture;

import java.io.Serializable;

public class ViewAllModel implements Serializable {
    String image_url, name, description, rating, sold, type;
    int price;

    public ViewAllModel() {

    }

    public ViewAllModel(String image_url, String name, String description, String rating, String sold, String type, int price) {
        this.image_url = image_url;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.sold = sold;
        this.type = type;
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
