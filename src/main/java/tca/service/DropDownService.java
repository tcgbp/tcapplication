package tca.service;

import tca.model.DropDown;

import java.util.List;

public interface DropDownService {

    List<DropDown> getRoles();

    List<DropDown> getOrganizations();
}
