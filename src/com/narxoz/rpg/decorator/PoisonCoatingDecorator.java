package com.narxoz.rpg.decorator;

public class PoisonCoatingDecorator extends ActionDecorator {
    public PoisonCoatingDecorator(AttackAction wrappedAction) {
        super(wrappedAction);
    }

    @Override
    public String getName() {
        return wrappedAction.getName() + " + Poison";
    }

    @Override
    public int getDamage() {
        return wrappedAction.getDamage() + 7;
    }

    @Override
    public String getDescription() {
        return wrappedAction.getDescription() + ", coated with poison";
    }
}