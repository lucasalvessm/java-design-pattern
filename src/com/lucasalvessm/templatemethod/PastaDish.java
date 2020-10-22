package com.lucasalvessm.templatemethod;

public abstract class PastaDish {

    final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();

        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    private void drainAndPlate() {
        System.out.println("drainAndPlate");
    }

    private void cookPasta() {
        System.out.println("cookPasta");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void addPasta();

    abstract void addSauce();

    abstract void addProtein();

    abstract void addGarnish();
}
