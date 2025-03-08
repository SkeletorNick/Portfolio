import java.util.Random;


public class stats {
    private String gender;
    private String breed;
    private String smart;
    private String strength;
    private int age;
    private int damage;
    private double recovery;
    private double speed;
    private int health;
    private String height;
    private int feet;
    private int inches;
    private int flying;
    private int magic;

    public stats() {
        String[] genders = {"Male", "Female", "Neither"};
        int genderIndex = new Random().nextInt(genders.length);
        this.gender = genders[genderIndex];
        String[] breeds = {"Human", "Cyborg", "Alien", "Dwarf", "Giant", "Animal", "Elf", "Deity"};
        int breedIndex = new Random().nextInt(breeds.length);
        this.breed = breeds[breedIndex];
        String[] smarts = {"Dumb", "Average", "Pretty Smart", "Genius"};
        int smartIndex = new Random().nextInt(smarts.length);
        this.smart = smarts[smartIndex];
        String[] strengths = {"Miniscule", "Average", "Pretty Good", "Buff"};
        int strengthIndex = new Random().nextInt(strengths.length);
        this.strength = strengths[strengthIndex];
        this.age = new Random().nextInt(45) + 6;
        this.damage = new Random().nextInt(171) + 15;
        this.recovery = Math.round((new Random().nextDouble() * 4) + 3.0) / 10.0;
        this.speed = Math.round((new Random().nextDouble() * 3) + 3.5) * 100.0 / 100.0;
        this.health = new Random().nextInt(176) + 50;
        this.setHeight();
        this.flying = new Random().nextInt(2) + 1;
        this.magic = new Random().nextInt(2);
    }

    public void setHeight(){
        switch(this.breed){
            case "Giant":
                this.feet = (int)Math.round(Math.random()*3+10);
                break;
            case "Animal":
                this.feet = (int)Math.round(Math.random()*2+1);
                break;
            case "Dwarf" :
                this.feet = (int)Math.round(Math.random()*2+1);
                break;
            default:
                this.feet = (int)Math.round(Math.random()*5+5);
        }
        this.inches = (int)Math.round(Math.random()*11);
        this.height = this.feet+"\'"+this.inches+"\"";
    }

    public void drawStats() {
        System.out.println("Species = " + this.breed );
        System.out.println("Gender = " + this.gender );
        System.out.println("Height = " + this.height);
        System.out.println("Intelligence = " + this.smart);
        System.out.println("Strength = " + this.strength);
        System.out.println("Damage = " + this.damage);
        System.out.println("Age = " + this.age);
        System.out.println("Recovery = " + this.recovery);
        System.out.println("Speed = " + this.speed);
        System.out.println("Health = " + this.health);
        if (this.flying == 1){
            System.out.println("They can't Fly");
        } else {
            System.out.println("They can Fly");
        }
        if(this.magic == 0){
            System.out.println("Non Magical");
        }else{
            System.out.println("Magical");
        }
    }
}

