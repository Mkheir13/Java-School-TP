package Pexercice5;

public class Main {
    public static void main(String[] args) {

        MonsterCard InvocateurDragonBleu = new MonsterCard("Invocateur Dragon Bleu", 4, 4, "Magicien / Effet", "YS14-FR017", 1500, 600, "Si cette carte est envoyée du Terrain au Cimetière :\n vous pouvez ajouter 1 Monstre Normal de type Dragon,\n Guerrier ou Magicien depuis votre Deck à votre main.");

        System.out.println("Nom de la carte : " + InvocateurDragonBleu.getName());
        System.out.println("Niveau de la carte : " + InvocateurDragonBleu.getLevel());
        System.out.println("Attribut de la carte : " + InvocateurDragonBleu.getAttribute());
        System.out.println("Type de la carte : " + InvocateurDragonBleu.getType());
        System.out.println("Numéro de la carte : " + InvocateurDragonBleu.getCardNumber());
        System.out.println("Attaque de la carte : " + InvocateurDragonBleu.getAttack());
        System.out.println("Défense de la carte : " + InvocateurDragonBleu.getDefense());
        System.out.println("Description de la carte : " + InvocateurDragonBleu.getDescription() + "\n");

        SpellCard Typhon = new SpellCard("Typhon d'Espace Mystique", 1, 3, "HAC1-FR023", "Ciblez 1 Magie/ Piège sur le Terrain ; détruisez la cible.");

        System.out.println("Nom de la carte : " + Typhon.getName());
        System.out.println("Type de la carte : " + Typhon.getType());
        System.out.println("Icone de la carte : " + Typhon.getIcon());
        System.out.println("Numéro de la carte : " + Typhon.getCardNumber());
        System.out.println("Description de la carte : " + Typhon.getDescription() + "\n");

        SpellCard Sortilège = new SpellCard("Sortilège de l'ombre", 2, 5, "YS18-FR034", "Activez cette carte en ciblant 1 monstre face recto contrôlé par\n votre adversaire ; il perd 700 ATK, et aussi, il ne peut ni attaquer\n ni changer sa position de combat. Lorsqu'il quitte le Terrain,\n détruisez cette carte.");

        System.out.println("Nom de la carte : " + Sortilège.getName());
        System.out.println("Type de la carte : " + Sortilège.getType());
        System.out.println("Icone de la carte : " + Sortilège.getIcon());
        System.out.println("Numéro de la carte : " + Sortilège.getCardNumber());
        System.out.println("Description de la carte : " + Sortilège.getDescription() + "\n");
    }
}
