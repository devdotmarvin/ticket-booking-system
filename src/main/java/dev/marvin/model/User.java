package dev.marvin.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "tbl_users")
@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
}
