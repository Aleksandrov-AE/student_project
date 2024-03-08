package edu.studenorder.validator;


import edu.studenorder.domain.CheckCityRegisterResponse;
import edu.studenorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    @Override
    public CheckCityRegisterResponse checkPerson(Person p) {
        return null;
    }
}
