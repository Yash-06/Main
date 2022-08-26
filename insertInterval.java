package Problems;

import javax.naming.spi.DirStateFactory.Result;

public class insertInterval {

    List<Interval> insert(List<Interval> intervals, Interval newInterval){
        if(intervals == null || intervals.isEmpty()){
            return intervals;
        }
        int i = 0;
        while(i<intervals.size() && intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i));
            i++;
        }
        while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
            Interval current = intervals.get(i);
            newInterval.start = Math.min(current.start, newInterval.start);
            newInterval.end = Math.max(current.end, newInterval);
            i++;
        }
        result.add(newInterval);
        while(i < intervals.size()){
            result.add(intervals.get(i));
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
