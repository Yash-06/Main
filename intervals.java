import java.util.LinkedList;

public class intervals {

    private int start;
    private int end;

    public interval(int start, int end){
        this.start = start;
        this.end = end;
    }

    List<Interval> merge(List<Interval> intervals){
        if(intervals.size() < 2){
            return intervals;
        }
        intervals.sort(comparingInt(in -> in.start));
        List<Interval> result = new LinkedList<>();
        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;
        for(int i=0;i<intervals.size();i++){
            Interval current = intervals.get(i);
            if(current.start <= end){
                end = Math.max(current.end, end);
            }
            else{
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
    public static void main(String[] args) {
        
    }
}
