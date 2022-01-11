// Given an array of meeting times [[start, end], ..], determine if a person could attend all events

package Interval;

import java.util.Arrays;

public class MeetingRooms {

  public boolean canAttendMeetings(int[][] intervals) {
    // Sort the array by starting time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    // Check end time of i vs start time of i + 1
    for (int i = 0; i < intervals.length - 1; i++) {
      if (intervals[i][1] > intervals[i + 1][0]) {
        return false;
      }
    }

    return true;
  }



}
