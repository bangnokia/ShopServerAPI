package entity;
// Generated Nov 1, 2016 11:13:25 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Float price;
     private String shopId;
     private Integer quantity;
     private Date createdAt;
     private Integer brandId;
     private String status;
     private Integer categoryId;
     private Boolean outOfStock;
     private String description;
     private String image;
     private String property;

    public Product() {
    }

    public Product(String name, Float price, String shopId, Integer quantity, Date createdAt, Integer brandId, String status, Integer categoryId, Boolean outOfStock, String description, String image, String property) {
       this.name = name;
       this.price = price;
       this.shopId = shopId;
       this.quantity = quantity;
       this.createdAt = createdAt;
       this.brandId = brandId;
       this.status = status;
       this.categoryId = categoryId;
       this.outOfStock = outOfStock;
       this.description = description;
       this.image = image;
       this.property = property;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }
    public String getShopId() {
        return this.shopId;
    }
    
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Integer getBrandId() {
        return this.brandId;
    }
    
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public Boolean getOutOfStock() {
        return this.outOfStock;
    }
    
    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public String getProperty() {
        return this.property;
    }
    
    public void setProperty(String property) {
        this.property = property;
    }




}


