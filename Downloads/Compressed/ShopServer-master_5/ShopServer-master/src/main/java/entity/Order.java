package entity;
// Generated Oct 14, 2016 11:30:50 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Order generated by hbm2java
 */
public class Order  implements java.io.Serializable {


     private Integer id;
     private Integer userId;
     private Date createdAt;
     private Date updatedAt;
     private String status;

    public Order() {
    }

    public Order(Integer userId, Date createdAt, Date updatedAt, String status) {
       this.userId = userId;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


