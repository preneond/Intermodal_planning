package adapters;

import model.planner.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;


public abstract class PlannerAdapter {

    public PlannerAdapter(){
    }

    public abstract List<Route> findRoutes(Location origin, Location destination, TransportMode mode);

    public abstract List<Route> findRoutes(Location origin, Location destination);


}