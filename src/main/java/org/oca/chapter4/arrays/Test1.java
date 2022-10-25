package org.oca.chapter4.arrays;

// Array of type abstract
public class Test1 {
    Vehicle[] vehicleArray = {new Car(), new Bus(), null};
}

abstract class Vehicle{}
class Car extends Vehicle{}
class Bus extends  Vehicle {}
