package com.jwt.example.entities;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class User {

    @Id
    public String userId;
    public String name;
    public String emailId;
    public String password;
}
