package Pexercice5;

import java.util.HashMap;
import java.util.Map;

public class MonsterCard {
    private String name;
    private int level;
    private Map<Integer, String> attributes = new HashMap<>();
    private String type;
    private String cardNumber;
    private int attack;
    private int defense;
    private String description;

    public MonsterCard(String name, int level, int attribute, String type, String cardNumber, int attack, int defense, String description) {
        this.name = name;
        this.level = level;
        this.attributes.put(1, "Terre");
        this.attributes.put(2, "Eau");
        this.attributes.put(3, "Feu");
        this.attributes.put(4, "Vent");
        this.attributes.put(5, "Lumière");
        this.attributes.put(6, "Ténèbres");
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

    public String getAttribute(int key) {
        return attributes.get(key);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttribute(int key, String attribute) {
        this.attributes.put(key, attribute);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Nom de la carte : " + name + "\n"
                + "Niveau : " + level + "\n"
                + "Attributs : " + attributes.get(1) + "\n"
                + "Type : " + type + "\n"
                + "Numéro de carte : " + cardNumber + "\n"
                + "Attaque : " + attack + "\n"
                + "Défense : " + defense + "\n"
                + "Description : " + description;
    }
}