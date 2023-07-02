package com.kadirgurturk.PoekmonRestTemplate.model.Fields;

public class Stats {
    public int base_stat;

    public Stat stat;

    public Stats(int base_stat, Stat stat) {
        this.base_stat = base_stat;

        this.stat = stat;
    }

    public Stats() {
    }

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }


    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }
}
