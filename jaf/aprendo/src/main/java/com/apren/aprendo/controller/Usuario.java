package com.apren.aprendo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_usuario")
public class Usuario {
    
    @Id
    private long id;

    
}
