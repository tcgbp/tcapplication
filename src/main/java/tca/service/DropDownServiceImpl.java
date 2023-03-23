package tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tca.mapper.dropdown.DropDownMapper;
import tca.model.DropDown;

import java.util.List;

@Service
public class DropDownServiceImpl implements DropDownService{

    @Autowired
    private DropDownMapper mapper;
    @Override
    @Cacheable("RolesDropDown")
    public List<DropDown> getRoles() {
        return mapper.getRoles();
    }

    @Override
    @Cacheable("OrganizationsDropDown")
    public List<DropDown> getOrganizations() {
        return mapper.getOrganizations();
    }
}
