package com.company;

public class WARLOCK extends CHARACTER {
    WARLOCK(String name,int lvl, int hp,int mana){
        super(name,lvl,hp,mana);
    }
    /**
     * Spells and recovery Spell
     */
    public void hellFire(CHARACTER enemyCharacter,CHARACTER Name){
        System.out.println(super.characterName +  "  attacks  " + enemyCharacter.characterName + " with Hell Fire (Damage - 100)(Mana reduce - 40)");
        int damagePoints = 100;
        int manaMinus = 40;
        damageTarget(enemyCharacter,Name, damagePoints,manaMinus);
    };
    public void hellSwing(CHARACTER enemyCharacter,CHARACTER Name){
        System.out.println(super.characterName +  "  attacks  "+ enemyCharacter.characterName + " with Hell Swing (Damage - 100)(Mana reduce - 40)");
        int damagePoints = 40;
        int manaMinus = 20;
        damageTarget(enemyCharacter,Name, damagePoints,manaMinus);
    };
    /**
     * Method to display character data
     */
    public void display() {
        System.out.println("WARLOCK: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level: " + super.level);
    }


}

