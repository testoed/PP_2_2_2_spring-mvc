package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Black", 2018));
        cars.add(new Car("Nissan", "Silver", 2021));
        cars.add(new Car("Volkswagen", "Orange", 2017));
        cars.add(new Car("Hyundai", "Purple", 2019));
        cars.add(new Car("Chevrolet", "Pink", 2023));

    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}