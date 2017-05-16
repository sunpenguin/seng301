package model;

import utils.Copy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The model class that defines a route.
 * Created by Sunguin Peng.
 */
public class Route implements Serializable {
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
            StopPoint copy = Copy.copy(routeStops.get(i));
            tempRouteSP.add(copy);
        }
        this.routeStops = routeStops;
    }

    public List<StopPoint> getRouteStops() {
//        List<StopPoint> tempRouteSP = new ArrayList<>();
//        for(int i = 0; i < routeStops.size(); i++) {
//            tempRouteSP.add(Copy.copy(routeStops.get(i)));
//        }
//        return tempRouteSP;
        return routeStops;
    }

    public String getName() {
        return name;
    }
}
