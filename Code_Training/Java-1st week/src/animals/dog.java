package animals;

public class dog {
// create the variable of dog class
    private String name;
    private String size;
    private int age;
    private String breed;
//
    public dog(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }
// checks the info input of size and returns info
    public String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap yap yap";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof";
        } else {
            bark = "WOOF WOOF!";
        }
        return bark;

    }
// checks the info input of play and returns info
    public String play (String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase( "poodle")) {
            playing = "Oh Dear, I don't think so, one could not possibly engage in such activities";
        }
        else if (breed.equalsIgnoreCase( "Labrador")) {
            playing = "Yeah, Yeah, Throw the stick! Yeah, DO IT";
        }
        else if (breed.equalsIgnoreCase("Border Collie")) {
            playing = "Let's go chase us some sheep";
        }
        return playing;
    }
//  return all the variables as an intro
    public String beHuman (String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old" + breed + ", What breed are you?";
    }
}
