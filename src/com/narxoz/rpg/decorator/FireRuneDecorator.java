package com.narxoz.rpg.decorator;

public class FireRuneDecorator extends ActionDecorator {
    public FireRuneDecorator(AttackAction wrappedAction) {
        super(wrappedAction);
    }

    @Override
    public String getName() {
        return wrappedAction.getName() + " + Fire Rune";
    }

    @Override
    public int getDamage() {
        return wrappedAction.getDamage() + 12;
    }

    @Override
    public String getDescription() {
        return wrappedAction.getDescription() + ", infused with fire";
    }
}