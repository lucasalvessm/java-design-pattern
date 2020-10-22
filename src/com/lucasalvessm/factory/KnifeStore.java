package com.lucasalvessm.factory;

public abstract class KnifeStore {
    protected KnifeFactory factory;

    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {


        Knife knife = createKnife(knifeType);

        knife.sharpen();
        knife.polish();
        knife.pack();

        return knife;
    }

    abstract Knife createKnife(String type);
}
