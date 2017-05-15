package utils;

import model.StopPoint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The searcher class for stop points.
 * @author Sunguin Peng
 */
public class StopPointsSearcher {
    private List<StopPoint> stopPoints;
    private List<StopPoint> searchStopPoints;

    /**
     * Constructor. Creates a copy of the full list.
     * @param stopPoints
     */
    public StopPointsSearcher(Collection<StopPoint> stopPoints) {
        this.stopPoints = new ArrayList();
        for (StopPoint sp : stopPoints) {
            this.stopPoints.add(sp);
        }
        resetSearchList();
    }

    public void resetSearchList() {
        searchStopPoints = new ArrayList<>();
    }

    /**
     * Searches the list by the street name.
     * @param streetName
     */
    public void searchByStreetName(String streetName) {
        String searchValue = "(?i).*" + streetName + ".*";
        for (StopPoint sp : stopPoints) {
            if (sp.getAddress().matches(searchValue)) {
                searchStopPoints.add(sp);
            }
        }
    }

    /**
     * Searches the list by the suburb name.
     * @param suburbName
     */
    public void searchBySuburbName(String suburbName) {
        String searchValue = "(?i).*" + suburbName + ".*";
        for (StopPoint sp : stopPoints) {
            if (sp.getSuburb().matches(searchValue)) {
                searchStopPoints.add(sp);
            }
        }
    }

    public List<StopPoint> getSearchStopPoints() {
        return searchStopPoints;
    }
}
