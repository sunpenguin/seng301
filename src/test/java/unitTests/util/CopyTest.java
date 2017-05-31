package unitTests.util;

import model.Route;
import model.StopPoint;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.Copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit tests for checking copy
 */
public class CopyTest {
    Route route;
    StopPoint stopPoint1;
    StopPoint stopPoint2;
    List<StopPoint> stopPointList;

    @Before
    public void setUp() {
        stopPoint1 = new StopPoint("Address 1", "Suburb 1");
        stopPoint2 = new StopPoint("Address 2", "Suburb 2");

        stopPointList = new ArrayList<>(Arrays.asList(stopPoint1, stopPoint2));
        route = new Route("Route", stopPointList);
    }

    @Test
    public void RouteCopyTest() {
        Route copiedRoute = Copy.copy(route);

        Assert.assertEquals("Route", copiedRoute.getName());
        Assert.assertEquals(2, copiedRoute.getRouteStops().size());
    }

    @Test
    public void StopPointCopyAddressChangeTest() {
        StopPoint copyStopPoint1 = Copy.copy(stopPoint1);
        copyStopPoint1.setAddress("Address 3");

        Assert.assertEquals("Address 1", stopPoint1.getAddress());
        Assert.assertEquals("Address 3", copyStopPoint1.getAddress());
    }

    @Test
    public void StopPointCopySuburbChangeTest() {
        StopPoint copyStopPoint1 = Copy.copy(stopPoint1);
        copyStopPoint1.setSuburb("Suburb 3");

        Assert.assertEquals("Suburb 1", stopPoint1.getSuburb());
        Assert.assertEquals("Suburb 3", copyStopPoint1.getSuburb());
    }

    @Test
    public void StopPointListCopyTest() {
        List<StopPoint> copiedList = Copy.copy(stopPointList);
        copiedList.remove(1);

        Assert.assertEquals(2, stopPointList.size());
        Assert.assertEquals(1, copiedList.size());
    }
}
