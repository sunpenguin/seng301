package model;

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
        this.routeStops = routeStops;
    }

    public List<StopPoint> getRouteStops() {
        return routeStops;
    }

    public String getName() {
        return name;
    }
}
