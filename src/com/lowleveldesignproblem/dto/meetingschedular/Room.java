package com.lowleveldesignproblem.dto.meetingschedular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    String name;
    Map<Integer,List<Meeting>> meetings;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, List<Meeting>> getMeetings() {
        return meetings;
    }

    public void setMeetings(Map<Integer, List<Meeting>> meetings) {
        this.meetings = meetings;
    }

    public boolean book(int start , int end, int day){

        for (Meeting meeting: meetings.get(day)){
            if (meeting.getStart() < end && meeting.getEnd()> start){
                return false;
            }
        }
        Meeting meeting = new Meeting();
        meeting.setStart(start);
        meeting.setEnd(end);
        meeting.setRoom(this);
        meetings.computeIfAbsent(day, ArrayList::new).add(meeting);
        return true;
    }
}
