package org.example.e88;
import org.example.e88.Main;

public class E88ClassAndObject {
    public static void main(String[] args) {
        //Husky, Bulldog, Labrador

        Main dog1 = new Main();
        dog1.breed = "Husky";
        dog1.name = "Milo";
        dog1.color = "Grey";

        Main dog2 = new Main();
        dog2.breed = "Bulldog";
        dog2.name = "Loki";
        dog2.color = "Brown";

        Main dog3 = new Main();
        dog3.breed = "Labrador";
        dog3.name = "Spooky";
        dog3.color = "Yellow";

        dog1.bark();
        dog1.run();
        dog1.play();
        dog2.bark();
        dog2.run();
        dog2.play();
        dog3.bark();
        dog3.run();
        dog3.play();

    }
}
