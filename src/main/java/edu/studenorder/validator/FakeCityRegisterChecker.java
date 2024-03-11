package edu.studenorder.validator;


import edu.studenorder.domain.register.CityRegisterResponse;
import edu.studenorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    @Override
    public CityRegisterResponse checkPerson(Person p) {
        return null;
    }
}
