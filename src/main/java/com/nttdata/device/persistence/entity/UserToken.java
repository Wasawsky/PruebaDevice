package com.nttdata.device.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="User_Token")
public class UserToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "tokenREST")
    private String tokenREST;

    @Column(name = "tokenSOAP")
    private String tokenSOAP;
}
