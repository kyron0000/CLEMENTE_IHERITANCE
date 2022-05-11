package com.company;

public class WIZARD extends CHARACTER {
    WIZARD(String name,int lvl, int hp,int mana){
        super(name,lvl,hp,mana);
    }

    /**
     * Spells and recovery Spell
     */
    public void holyShot(CHARACTER enemyCharacter,CHARACTER Name){
        System.out.println(super.characterName +  "  attacks  "+ enemyCharacter.characterName + " with Holy shot (Damage - 50)(Mana - 20)");
        int damagePoints = 140;
        int manaMinus = 20;
        damageTarget(enemyCharacter,Name, damagePoints,manaMinus);
    };
    public void holyStrike(CHARACTER enemyCharacter,CHARACTER Name){
        System.out.println(super.characterName +  "  attacks  " + enemyCharacter.characterName + " with Holy Strike (Damage - 30)(Mana - 15)");
        int damagePoints = 30;
        int manaMinus = 15;
        damageTarget(enemyCharacter,Name, damagePoints,manaMinus);
    };
    public void holyHeal(){
        super.healthPoints += 50;
        System.out.println("Superrrrrrrrrrr Holyyyyyy Heallllll!!!!!!!");
    }

    /**
     * Method to display character data
     */
    public void display() {
        System.out.println("WIZARD: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level: " + super.level);
    }



}
