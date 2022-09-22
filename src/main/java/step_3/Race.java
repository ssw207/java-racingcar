package step_3;

import step_3.dto.RaceConfigurationDTO;

import java.util.List;

public class Race {

    public static void main(String[] args) {
        Race race = new Race();
        race.start();
    }

    private void start() {
        RaceConfigurationScanner raceConfigurationScanner = new RaceConfigurationScanner();
        RaceConfigurationDTO raceConfigurationDTO = raceConfigurationScanner.scan();

        List<Car> cars = CarFactory.produce(raceConfigurationDTO);

        RaceCourse raceCourse = new RaceCourse(cars, raceConfigurationDTO);
        raceCourse.startRace();
        raceCourse.viewRaceResult();

        System.out.println("종료");
    }

}
