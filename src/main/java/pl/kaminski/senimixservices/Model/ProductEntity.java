package pl.kaminski.senimixservices.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
