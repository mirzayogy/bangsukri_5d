package com.mirzayogy.bangsukri_5d.libraries;


public class ComboboxItem {
    int id;
    String item;

    @Override
    public String toString() {
        return item;
    }

    
    public ComboboxItem(int id, String item) {
        this.id = id;
        this.item = item;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    
}
