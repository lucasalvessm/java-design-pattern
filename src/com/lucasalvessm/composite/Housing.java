package com.lucasalvessm.composite;

import java.util.ArrayList;

public class Housing implements Structure {
    private ArrayList<Structure> structures;
    private String address;

    public Housing(String address) {
        this.structures = new ArrayList<Structure>();
        this.address = address;
    }

    public String getName() {
        return this.address;
    }

    public int addStructure(Structure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public Structure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for (Structure struct : this.structures)
            System.out.println(struct.getName());
    }
    /* Print out when you enter and exit the building */

    public void enter() {

    }

    public void exit() {

    }

}
