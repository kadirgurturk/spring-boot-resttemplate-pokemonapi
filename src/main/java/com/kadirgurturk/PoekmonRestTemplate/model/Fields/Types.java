package com.kadirgurturk.PoekmonRestTemplate.model.Fields;

public class Types {

    public int slot ;
    public Type type ;

    public Types() {
    }

    public Types(int slot, Type type) {
        this.slot = slot;
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
