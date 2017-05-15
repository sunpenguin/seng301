package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The model class that defines a route.
 * Created by Sunguin Peng.
 */
public class Route {
    private String name;
    private List<StopPoint> routeStops;

    /**
     * The constructor for a route
     * @param name  The name of the route
     * @param routeStops    A list of stop points the route will have
     */
    public Route(String name, List<StopPoint> routeStops) {
        this.name = name;
        List<StopPoint> tempRouteSP = new ArrayList<>();
        for(int i = 0; i < routeStops.size(); i++) {
            StopPoint copy = routeStops.get(i).copy();
            tempRouteSP.add(copy);
        }
        this.routeStops = routeStops;
    }

    public List<StopPoint> getRouteStops() {
        List<StopPoint> tempRouteSP = new ArrayList<>();
        for(int i = 0; i < routeStops.size(); i++) {
            tempRouteSP.add(routeStops.get(i).copy());
        }
        return tempRouteSP;
    }

    public String getName() {
        return name;
    }
}
