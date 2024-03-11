package edu.studenorder.validator;

import edu.studenorder.domain.register.CityRegisterResponse;
import edu.studenorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson(Person p) throws CityRegisterException;
}
