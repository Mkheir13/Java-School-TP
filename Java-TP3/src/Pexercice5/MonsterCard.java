package Pexercice5;

import java.util.HashMap;
import java.util.Map;

public class MonsterCard {
    private final String name;
    private final int level;

    private final Map<Integer, String> attribute = new HashMap<>();
    private final String type;
    private final String cardNumber;
    private final int attack;
    private final int defense;
    private final String description;

    public MonsterCard(String name, int level,int attribute , String type, String cardNumber, int attack, int defense, String description) {
        this.name = name;
        this.level = level;
        switch (attribute) {
            case 1 -> this.attribute.put(1, "Terre");
            case 2 -> this.attribute.put(2, "Eau");
            case 3 -> this.attribute.put(3, "Feu");
            case 4 -> this.attribute.put(4, "Vent");
            case 5 -> this.attribute.put(5, "Lumière");
            case 6 -> this.attribute.put(6, "Ténèbres");
        }
        this.type = type;
        this.cardNumber = cardNumber;
        this.attack = attack;
        this.defense = defense;
        this.description = description;
}
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public String getAttribute() {
        return attribute.values().toArray()[0].toString();
    }
    public String getType() {
        return type;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public String getDescription() {
        return description;
    }
}