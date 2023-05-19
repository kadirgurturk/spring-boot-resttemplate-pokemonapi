package com.kadirgurturk.PoekmonRestTemplate.model;

import java.util.List;

public class Poke {

    public String name;

    public int Order;

    public int weight;

    public Sprites sprites;

    public List<Stats> stats;

    public List<Types> types;

    public Poke(String name, int order, int weight, Sprites sprites, List<Stats> stats, List<Types> types) {
        this.name = name;
        Order = order;
        this.weight = weight;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
    }

    public Poke() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return Order;
    }

    public void setOrder(int order) {
        Order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sprites getSprite() {
        return sprites;
    }

    public void setSprite(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setType(List<Types> types) {
        this.types = types;
    }
}
