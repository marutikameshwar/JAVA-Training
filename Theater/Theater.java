package Theater;

import java.util.ArrayList;
import java.util.List;

public class Theater {
     private String theaterName;
     private List<Seat> seats = new ArrayList<Seat>();
     public Theater(String theaterName,int s){
        this.theaterName = theaterName;
        for (int i = 0;i<s;i++){
            Seat seat = new Seat(i+1);
            seats.add(seat);
        }
     }
}
