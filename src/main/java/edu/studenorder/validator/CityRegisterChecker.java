package edu.studenorder.validator;

import edu.studenorder.domain.CheckCityRegisterResponse;
import edu.studenorder.domain.Person;

public interface CityRegisterChecker {
    CheckCityRegisterResponse checkPerson(Person p) throws CityRegisterException;
}
