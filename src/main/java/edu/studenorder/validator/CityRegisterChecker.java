package edu.studenorder.validator;

import edu.studenorder.domain.register.CityRegisterResponse;
import edu.studenorder.domain.Person;
import edu.studenorder.exception.CityRegisterException;
import edu.studenorder.exception.TransportException;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson(Person p) throws CityRegisterException, TransportException;
}
