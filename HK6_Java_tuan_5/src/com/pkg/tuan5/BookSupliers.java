/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg.tuan5;


public class BookSupliers {

    private String id;
    private String name;
    private String type;
    private String address;
    private String contract;
    private String email;
    private String remakes;

    public BookSupliers() {
    }

    public BookSupliers(String id, String name, String type, String address, String contract, String email, String remakes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.contract = contract;
        this.email = email;
        this.remakes = remakes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemakes() {
        return remakes;
    }

    public void setRemakes(String remakes) {
        this.remakes = remakes;
    }
    
    
}
