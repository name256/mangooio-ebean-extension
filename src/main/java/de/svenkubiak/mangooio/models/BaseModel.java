/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.svenkubiak.mangooio.models;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author silicon
 */
@MappedSuperclass
public class BaseModel {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
