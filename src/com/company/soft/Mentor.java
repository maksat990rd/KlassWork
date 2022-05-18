package com.company.soft;


public class Mentor extends PeakSoft{
    private String name;
    private String urovenZnaniya;

    public Mentor() {}

    public Mentor(String name, String urovenZnaniya) {
        this.name = name;
        this.urovenZnaniya = urovenZnaniya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrovenZnaniya() {
        return urovenZnaniya;
    }

    public void setUrovenZnaniya(String urovenZnaniya) {
        this.urovenZnaniya = urovenZnaniya;
    }

    @Override
    public String toString() {
        return "Mentor name: " + name + " UrovenZnaniya: " + urovenZnaniya;
    }
}
