package com.narxoz.rpg.decorator;

public abstract class ActionDecorator implements AttackAction {
    protected final AttackAction wrappedAction;

    protected ActionDecorator(AttackAction wrappedAction) {
        this.wrappedAction = wrappedAction;
    }

    @Override
    public String getName() {
        return wrappedAction.getName();
    }

    @Override
    public int getDamage() {
        return wrappedAction.getDamage();
    }

    @Override
    public String getDescription() {
        return wrappedAction.getDescription();
    }

    @Override
    public String getSummary() {
        return getName() + " -> " + getDescription() + " [damage=" + getDamage() + "]";
    }
}