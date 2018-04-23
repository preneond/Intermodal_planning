package cz.cvut.fel.intermodal_planning.model.planner;

import com.umotional.basestructures.Node;
import cz.cvut.fel.intermodal_planning.general.Main;
import cz.cvut.fel.intermodal_planning.utils.LocationUtils;
import org.geojson.LngLatAlt;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public class Location implements Serializable {
    public double lat;
    public double lon;

    public Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public int latE3() {
        return (int) (lat * 1E3);
    }

    public int latE6() {
        return (int) (lat * 1E6);
    }

    public int lonE3() {
        return (int) (lon * 1E3);
    }

    public int lonE6() {
        return (int) (lon * 1E6);
    }

    @Override
    public String toString() {
        return lat + ", " + lon;
    }

    public LngLatAlt toLngLatAlt() {
        return new LngLatAlt(lon, lat);
    }

    public double[] toDoubleArray() {
        return new double[]{lat, lon};
    }
}