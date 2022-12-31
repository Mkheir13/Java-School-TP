package Pexercice5;

import java.util.HashMap;
import java.util.Map;

public class SpellCard {

    public String name;
    public Map <Integer, String> type = new HashMap<>();
    public Map<Integer, String> Icon = new HashMap<>();
    public String cardNumber;
    public String description;

    public SpellCard(String name, int type, int icon, String cardNumber, String description) {
        this.name = name;
        switch (type) {
            case 1 -> this.type.put(1, "Carte Magie");
            case 2 -> this.type.put(2, "Carte Piège");
        }
        switch (icon) {
            case 1 -> this.Icon.put(1, "Équipement");
            case 2 -> this.Icon.put(2, "Terrain");
            case 3 -> this.Icon.put(3, "Jeu Rapide");
            case 4 -> this.Icon.put(4, "Rituel");
            case 5 -> this.Icon.put(5, "Continu");
            case 6 -> this.Icon.put(6, "Contre");
        }
        this.cardNumber = cardNumber;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.values().toArray()[0].toString();
    }

    public String getIcon() {
        return Icon.values().toArray()[0].toString();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getDescription() {
        return description;
    }
}

