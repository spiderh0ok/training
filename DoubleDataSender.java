

import java.time.LocalTime;


public class DoubleDataSender {


    private final String name;
    private final DoubleTimedValue doubleTimedValue;


    public DoubleDataSender(String name,DoubleTimedValue doubleTimedValue) {
        this.name = name;
        this.doubleTimedValue = doubleTimedValue;
    }


    public void update() {
        doubleTimedValue.value =Math.random();
        doubleTimedValue.time = LocalTime.now().getSecond();
    }


    public DoubleTimedValue getDoubleTimedValue() {
        return doubleTimedValue;
    }


}
