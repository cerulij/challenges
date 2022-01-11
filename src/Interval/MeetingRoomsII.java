// Given an array of meeting times [[start, end], ..], determine the min number of
// conference rooms required

package Interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {

  public int minMeetingRooms(int[][] intervals) {

    if (intervals.length == 0) {
      return 0;
    }

    PriorityQueue<Integer> q = new PriorityQueue<>(intervals.length,
            (a, b) -> Integer.compare(a, b));

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    q.add(intervals[0][1]);

    for (int i = 1; i < intervals.length; i++) {

      if (intervals[i][0] >= q.peek()) {
        q.poll();
      }

      q.add(intervals[i][1]);
    }

    return q.size();
  }

}
