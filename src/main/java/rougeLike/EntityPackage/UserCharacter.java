package rougeLike.EntityPackage;


import rougeLike.characterPackage.CharacterSpecialization;

import javax.persistence.*;

@Entity
public class UserCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int CharacterId;
    @Column
    private String name;
    @Column
    private int level = 1;
    @Column
    private double experience = 1;
    @Column
    private int damage = 1;
    @Column
    private int magicDamage = 1;
    @Column
    private int hitPoints = 40;
    @Column
    private int manaPoints = 10;
    @Column
    private int strange = 1;
    @Column
    private int vitality = 1;
    @Column
    private int agility = 1;
    @Column
    private int dexterity = 1;
    @Column
    private int intelligence = 1;
    @Column
    private int specialization;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserCharacter() {
    }
    public UserCharacter(String name, int specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public UserCharacter(int strange, int vitality, int agility, int dexterity, int intelligence) {
        this.strange = strange;
        this.vitality = vitality;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public int getCharacterId() {
        return CharacterId;
    }

    public void setCharacterId(int characterId) {
        CharacterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSpecialization() {
        return specialization;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "UserCharacters{" +
                "CharId=" + CharacterId +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", damage=" + damage +
                ", magicDamage=" + magicDamage +
                ", hitPoints=" + hitPoints +
                ", manaPoints=" + manaPoints +
                ", strange=" + strange +
                ", vitality=" + vitality +
                ", agility=" + agility +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", user=" + user +
                '}';
    }
}
