package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("Lexus", 2020, "Grey"));
        cars.add(new Car("Lexus", 2021, "Grey"));
        cars.add(new Car("Lexus", 2022, "Grey"));
        cars.add(new Car("Lexus", 2023, "Grey"));
        cars.add(new Car("Lexus", 2024, "Grey"));
    }

    public List<Car> getCars(int count) {
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }


}
