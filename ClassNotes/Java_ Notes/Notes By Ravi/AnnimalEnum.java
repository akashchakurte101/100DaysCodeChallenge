package com.hdfc.collections;


//Enum extends Objects
//AnnimalEnum extends Enum
public enum AnnimalEnum {

    COW("mo"), //0  "COW"
    FISH("finsh"){
        public String test(){
            return "This is not an Animal";
        }
    }, //1 "FISH"
    DOG("bobo", "mompo"); //2 "DOG"

    String sound;
    String anotherSound;

    AnnimalEnum(String sound) {
        this.sound = sound;
    }

    AnnimalEnum(String sound, String anotherSound) {
        this.sound = sound;
        this.anotherSound = anotherSound;
    }

    public String getSound() {
        return sound;
    }

    public String getAnotherSound() {
        return anotherSound;
    }

    public String test(){
        return "This is an Animal";
    }

    public static void main(String[] args) throws CloneNotSupportedException {


        AnnimalEnum cow = AnnimalEnum.COW;
        String sound2 = cow.getSound();///mo

        AnnimalEnum cow1 = AnnimalEnum.valueOf("COW");
        String sound1 = cow1.getSound();///mo
        cow1.test();//"This is an Animal";
       // System.out.println(sound1);

        AnnimalEnum fish = AnnimalEnum.FISH;
        System.out.println(fish.test());;//"This is not an Animal";


        AnnimalEnum[] values = AnnimalEnum.values();
        for (AnnimalEnum a : values) {
            System.out.println(a.getSound());
            System.out.println(a.ordinal());
            System.out.println(a.name());
            System.out.println(a.hashCode());
            System.out.println(a.equals(a));
            System.out.println(a.test());
            // a.clone();
        }


    }
}
