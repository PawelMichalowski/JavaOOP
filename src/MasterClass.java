public class MasterClass {
    public static void main(String[] args) {
        ClassDemo instance = new ClassDemo();
        ClassDemo instance2 = new ClassDemo();

        instance.number = 10;
        instance2.text = "New text";

        instance.printNumber();
        instance2.printNumber();

        instance.printText();
        instance2.printText();

        ClassDemo.text = "Third text";
        instance.printText();
        ClassDemo.printText();

        /*Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp bedroomLamp = new Lamp("Bedroom");

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();

        kitchenLamp.lightStatus = true;

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();*/

        /*Programming programming = new Programming("Java");
        programming.learningStatus();
        programming.completeLearning();
        programming.learningStatus();*/
    }
}


