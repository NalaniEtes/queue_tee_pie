package org.example;

public interface Cutie {
  public String description(); // All cuties need to have a description of what makes them cute.

  public Integer cutenessRating(); // All cuties get a cuteness rating out of ten.
}
class Puppy implements Cutie {
    public String description() {
        return "A puppy!";
    }

    public Integer cutenessRating() {
        return 9;
    }
}

class Kitty implements Cutie {
    public String description() {
        return "A kitten!";
    }

    public Integer cutenessRating() {
        return 10;
    }
}

class PygmyMarmoset implements Cutie {
    public String description() {
        return "A miniature monkey with big eyes.";
    }

    public Integer cutenessRating() {
        return 8;
    }
}
