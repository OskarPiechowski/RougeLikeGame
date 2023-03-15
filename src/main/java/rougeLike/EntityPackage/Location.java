package rougeLike.EntityPackage;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationId;
    @Column
    private String locationName;

    public Location(){

    }
    public Location(String locationName) {
        this.locationName = locationName;
    }

    public int getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                '}';
    }
}
