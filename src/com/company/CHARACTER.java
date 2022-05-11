package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class CHARACTER {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;
     /**
      * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */


    CHARACTER() {

    }


    CHARACTER(String name,int lvl, int hp, int mana ) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }
    /***
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     * */
    public void displayName(CHARACTER Name ){
        System.out.println("Character Initialized :" + Name.characterName);
    }
      /**
       * Create a method to Damage Target Character
     */
    public void damageTarget(CHARACTER enemyCharacter,CHARACTER Name,int damagePoints,int manaMinus){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        /**
         * Deduct mana from the attacker
         */
        Name.manaPoints -= manaMinus;

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if(enemyCharacter.healthPoints == 0){
            System.out.println("Character  "+ enemyCharacter.characterName + "  Defeated");
        }
    }
    public void levelUP(CHARACTER Name){
        Name.level += 10;
        System.out.println("CONGRATS  "+ Name.characterName+ "  YOU HAVE BEEN LEVEL UP BY 10!!!");

    }


}
