package pl.kaminski.senimixservices.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class ProductEntity {
    @Id
    private int id;
    private String name;
    private String price;
    private String estTime;
    private String descritpion;

    public ProductEntity() {
    }

    public ProductEntity(String name, String price, String estTime, String descritpion) {
        this.name = name;
        this.price = price;
        this.estTime = estTime;
        this.descritpion = descritpion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEstTime() {
        return estTime;
    }

    public void setEstTime(String estTime) {
        this.estTime = estTime;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }
}
