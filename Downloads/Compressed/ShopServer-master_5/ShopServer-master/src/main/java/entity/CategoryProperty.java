package entity;
// Generated Oct 14, 2016 11:30:50 AM by Hibernate Tools 4.3.1



/**
 * CategoryProperty generated by hbm2java
 */
public class CategoryProperty  implements java.io.Serializable {


     private Integer id;
     private Integer catId;
     private String name;
     private String status;

    public CategoryProperty() {
    }

    public CategoryProperty(Integer catId, String name, String status) {
       this.catId = catId;
       this.name = name;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCatId() {
        return this.catId;
    }
    
    public void setCatId(Integer catId) {
        this.catId = catId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


