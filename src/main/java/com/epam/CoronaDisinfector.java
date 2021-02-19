package com.epam;

/* eserbaniuc created on 02/19/2021 */
public class CoronaDisinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room){
        //ToDo inform all to evacuate the room since the disinfection starts soon
        announcer.announce("!!!===!!! Disinfection stars soon, please leave the room");

        //ToDo get out the ones that didn't listen to the first alarm
        policeman.makePeopleLeaveRoom();

        //ToDo inform all to enter the room back
        announcer.announce("!!!===!!! Disinfection successfully completed. You are now allow to enter the room!");


        disinfectRoom(room);
    }

    private void disinfectRoom(Room room) {
        System.out.println("Disinfection successfully completed!");
    }
}
