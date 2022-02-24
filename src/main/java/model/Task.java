//package model;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//
//@Entity
//@Table(name = "task")
//public class Task implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // research this line more
//    @Column
//    private Long id;
//    private String body;
//
//    public Task() {
//    }
//
//    public Task(Long id, String body) {
//        this.id = id;
//        this.body = body;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//}
