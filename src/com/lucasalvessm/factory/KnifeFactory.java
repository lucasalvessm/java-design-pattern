package com.lucasalvessm.factory;

public class KnifeFactory {

    public Knife createKnike(String knifeType) {
        Knife knife = null;

        if ("steak".equals(knifeType)) {
            knife = new SteakKnife();
        } else if ("chefs".equals(knifeType)) {
            knife = new ChefsKnife();
        }

        return knife;
    }
}
