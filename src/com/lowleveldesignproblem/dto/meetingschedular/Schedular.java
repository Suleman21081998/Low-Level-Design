package com.lowleveldesignproblem.dto.meetingschedular;

import java.util.List;

public class Schedular {
    List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String book(int start, int end,int day) {
        for (Room room : rooms) {
            boolean flag = room.book(start, end,day);
            if (flag)
                return room.getName();
        }
        return "No room is available";
    }

}
