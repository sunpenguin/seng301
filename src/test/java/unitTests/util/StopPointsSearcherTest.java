package unitTests.util;

import model.StopPoint;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.StopPointsSearcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit tests for StopPointsSearcher
 */
public class StopPointsSearcherTest {

    StopPoint stopPoint1;
    StopPoint stopPoint2;
    List<StopPoint> stopPointList;
    StopPointsSearcher stopPointsSearcher;

    @Before
    public void setUp() {
        stopPoint1 = new StopPoint("Address 1", "Suburb 1");
        stopPoint2 = new StopPoint("Stable", "Barnyard");

        stopPointList = new ArrayList<>(Arrays.asList(stopPoint1, stopPoint2));
        stopPointsSearcher = new StopPointsSearcher(stopPointList);
    }

    @Test
    public void searchByStreetNameTest() {
        stopPointsSearcher.searchByStreetName("d");

        List<StopPoint> result = stopPointsSearcher.getSearchStopPoints();
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("Address 1", result.get(0).getAddress());
    }

    @Test
    public void searchByStreetNameNoResultTest() {
        stopPointsSearcher.searchByStreetName("123~!#@ABC");

        List<StopPoint> result = stopPointsSearcher.getSearchStopPoints();
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void searchByStreetNameEmptyTest() {
        stopPointsSearcher.searchByStreetName("");

        List<StopPoint> result = stopPointsSearcher.getSearchStopPoints();
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void searchBySuburbNameTest() {
        stopPointsSearcher.searchBySuburbName("d");

        List<StopPoint> result = stopPointsSearcher.getSearchStopPoints();
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("Barnyard", result.get(0).getSuburb());
    }

    @Test
    public void searchBySuburbNameNoResultTest() {
        stopPointsSearcher.searchBySuburbName("123~@#$ABC");

        List<StopPoint> result = stopPointsSearcher.getSearchStopPoints();
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void searchBySuburbNameEmptyTest() {
        stopPointsSearcher.searchBySuburbName("");

        List<StopPoint> result = stopPointsSearcher.getSearchStopPoints();
        Assert.assertEquals(2, result.size());
    }
}
