package by.rakovets.course.java.tools.mapping.mapstruct.entity;


import by.rakovets.course.java.tools.mapping.mapstruct.model.CarType;

public class CarEntity {
    private String make;
    private int numberOfSeats;
    private CarType type;

    public CarEntity(String make, int numberOfSeats, CarType type) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
