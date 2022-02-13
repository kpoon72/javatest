package day2;

public class Lift {
    //States

    // allowedNumberOfPerson (maxCapacity)
    // allowedWeight
    // currentNumberOfPerson
    // currentWeight
    // color
    // numberOfFloorSwitch
    // isEmergencyButtonAvailable
    short allowedNumberOfPerson;
    short allowedWeight;
    short currentNumberOfPerson;
    private float currentWeight;
    protected String color = "blue";
    short numberOfFloorSwitch;
    boolean isEmergencyButtonAvailable;

    // Behaviour

    public short getAllowedNumberOfPerson() {
        return allowedNumberOfPerson;
    }

    public void setAllowedNumberOfPerson(short allowedNumberOfPerson) {
        this.allowedNumberOfPerson = allowedNumberOfPerson;
    }

    public short getAllowedWeight() {
        return allowedWeight;
    }

    public void setAllowedWeight(short allowedWeight) {
        this.allowedWeight = allowedWeight;
    }

    public short getCurrentNumberOfPerson() {
        return currentNumberOfPerson;
    }

    public void setCurrentNumberOfPerson(short currentNumberOfPerson) {
        this.currentNumberOfPerson = currentNumberOfPerson;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    //liftGoingUp
    //liftGoingDown
    //liftDoorOpen
    //liftDoorClose
}
