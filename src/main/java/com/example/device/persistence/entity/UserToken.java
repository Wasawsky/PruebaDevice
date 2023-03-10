package com.example.device.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="User_Token")
public class UserToken {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username")
    private String username;

    @Column(name = "token")
    private String token;

    @Column(name = "fecha")
    private String fecha;
}
