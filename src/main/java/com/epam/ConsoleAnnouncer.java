package com.epam;

/* eserbaniuc created on 02/19/2021 */
public class ConsoleAnnouncer implements Announcer {

    @Override
    public void announce(String message) {
        System.out.println(message);
    }
}
