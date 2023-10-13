package com.lowleveldesignproblem;

import com.lowleveldesignproblem.dto.meetingschedular.Meeting;
import com.lowleveldesignproblem.dto.meetingschedular.Room;
import com.lowleveldesignproblem.dto.meetingschedular.Schedular;
import com.lowleveldesignproblem.dto.ola.Rider;
import com.lowleveldesignproblem.dto.ola.UIInterFace;
import com.lowleveldesignproblem.solid.liskovsubstitutionprincipal.Rectangle;
import com.lowleveldesignproblem.solid.liskovsubstitutionprincipal.Square;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

/*
        OLA Uber Design Presentation
        Rider rider = new Rider();
        rider.setName("Suleman");
        rider.setId(1);
        rider.setRides(new ArrayList<>());

        Rider rider1 = new Rider();
        rider1.setName("Suleman1");
        rider1.setId(2);
        rider1.setRides(new ArrayList<>());

        Rider rider2 = new Rider();
        rider2.setName("Suleman2");
        rider2.setId(3);
        rider2.setRides(new ArrayList<>());

        List<Rider> riders = new ArrayList<>();
        riders.add(rider);
        riders.add(rider1);
        riders.add(rider2);

        UIInterFace interFace = new UIInterFace();
        interFace.setDrivers(3);
        interFace.setRiderList(riders);

        interFace.createRide(1,1,50,60,1);
        System.out.println("Fare : " + interFace.closeRide(1,1));
        interFace.withDrawRide(1,1);
        interFace.updateRide(1,1,50,60,2);

        interFace.createRide(2,1,50,60,1);
        interFace.updateRide(2,1,50,60,2);
        System.out.println("Fare : " + interFace.closeRide(2,1));
*/


        /* Meeting Schedular

        Room room = new Room();
        room.setName("A");

        Map<Integer,List<Meeting>> meetings = new HashMap<>();

        meetings.put(1,new ArrayList<>());
        meetings.put(2,new ArrayList<>());
        room.setMeetings(meetings);

        Room room1 = new Room();
        room1.setName("B");
        Map<Integer,List<Meeting>> meetings1 = new HashMap<>();

        meetings1.put(1,new ArrayList<>());
        meetings1.put(2,new ArrayList<>());
        room1.setMeetings(meetings1);
        Room room2 = new Room();

        Map<Integer,List<Meeting>> meetings2 = new HashMap<>();

        meetings2.put(1,new ArrayList<>());
        meetings2.put(2,new ArrayList<>());
        room2.setMeetings(meetings2);
        room2.setName("C");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room);
        rooms.add(room1);
        rooms.add(room2);
        Schedular schedular = new Schedular();
        schedular.setRooms(rooms);

        System.out.println(schedular.book(2,5,1));
        System.out.println(schedular.book(5,8,1));
        System.out.println(schedular.book(4,8,1));
        System.out.println(schedular.book(3,6,1));
        System.out.println(schedular.book(7,8,1));
        System.out.println(schedular.book(6,9,2));


 */

        // LisKov Substitution Principal
//
//        Rectangle rectangle = new Rectangle(10,20);
//        Square square = new Square(10);
//
//        System.out.println(" Response : this is for rectangle");
//        useRectangle(rectangle);
//
//        System.out.println(" Response: this is for square");
//        useRectangle(square);


        // this violating Liskov substitution principal, we have to solve it using interface


    }

//    private static void useRectangle(Rectangle rectangle){
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//
//        String widthString  = rectangle.getWidth() == 10 ? "It is correct":"width is not 10";
//        String lengthString = rectangle.getLength() ==20 ? " It is correct": "length is not 20";
//
//        System.out.println(lengthString);
//        System.out.println(widthString);
//
//    }
}

/*

OOPs Concept
Clean Coding
Robert c martin book
Solid Pattern
Design Pattern
 singlton design with multi threading
 builder pattern
 Factory and abstract
 Decorator pattern
 observer pattern
 CodeRush -X 28JAN for participating in coding round

 */

/*

there is at least one way to reach 100
a block or cell can have one of the types: snake head, snake tail,ladder head,ladder end or noting

Snake,Ladders and number of players are decided before game started
roll dice should have a random value
the game ends when a player reaches the 100.
After game ends system should display the final values of each player and also declare the winner

Class diagram

Player
  id
  name
  current position int

 Game
   players
   currentTurn
   winner: Player
   snakeAndLadders:map, int , int
   roll(): bool
 Snake
  start: int
  end: int
 Ladder
   start: int
   end: int


 */



