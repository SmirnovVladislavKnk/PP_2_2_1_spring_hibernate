package hiber.service;

import hiber.model.User;

import java.util.List;

public interface CarService {
    List<User> getUserByModelAndSeries(String model, int series);
}
