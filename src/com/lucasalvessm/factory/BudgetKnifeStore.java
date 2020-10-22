package com.lucasalvessm.factory;

public class BudgetKnifeStore extends KnifeStore {

    public BudgetKnifeStore(KnifeFactory factory) {
        super(factory);
    }

    @Override
    Knife createKnife(String type) {
        return factory.createKnike(type);
    }
}
