package com.personal.jpapractice.model;

import javax.persistence.*;

@Entity
@Table(name = "climbingGears")
public class Climber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="fname")
    private String fname;
    @Column(name="lname")
    private String lname;
    @Column(name="harness")
    private String harness;
    @Column(name="rope")
    private String rope;
    @Column(name="belay_device")
    private String belayDevice;
    @Column(name="climbing_shoes")
    private String climbingShoes;
    @Column(name="helmet")
    private String helmet;
    @Column(name="chalk_bag")
    private String chalkBag;
    @Column(name="quick_draws")
    private String quickDraws;
    @Column(name="retailPrice")
    private float retailPrice;
    @Column(name="quantity")
    private int quantity;
    public Climber(){}
    public Climber(String harness, String rope, String belayDevice, String climbingShoes, String helmet, String chalkBag, String quickDraws, float retailPrice, int quantity) {
        this.harness = harness;
        this.rope = rope;
        this.belayDevice = belayDevice;
        this.climbingShoes = climbingShoes;
        this.helmet = helmet;
        this.chalkBag = chalkBag;
        this.quickDraws = quickDraws;
        this.retailPrice = retailPrice;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getHarness() {
        return harness;
    }

    public void setHarness(String harness) {
        this.harness = harness;
    }

    public String getRope() {
        return rope;
    }

    public void setRope(String rope) {
        this.rope = rope;
    }

    public String getBelayDevice() {
        return belayDevice;
    }

    public void setBelayDevice(String belayDevice) {
        this.belayDevice = belayDevice;
    }

    public String getClimbingShoes() {
        return climbingShoes;
    }

    public void setClimbingShoes(String climbingShoes) {
        this.climbingShoes = climbingShoes;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getChalkBag() {
        return chalkBag;
    }

    public void setChalkBag(String chalkBag) {
        this.chalkBag = chalkBag;
    }

    public String getQuickDraws() {
        return quickDraws;
    }

    public void setQuickDraws(String quickDraws) {
        this.quickDraws = quickDraws;
    }

    public float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
