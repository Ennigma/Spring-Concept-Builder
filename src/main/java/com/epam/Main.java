package com.epam;

/* eserbaniuc created on 02/19/2021 */
public class Main {

    public static void main(String[] args) {
        CoronaDisinfector disinfector = new CoronaDisinfector();
        disinfector.start(new Room());
    }
}
