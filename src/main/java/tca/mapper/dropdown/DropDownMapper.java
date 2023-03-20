package tca.mapper.dropdown;

import org.apache.ibatis.annotations.Mapper;
import tca.model.DropDown;

import java.util.List;

@Mapper
public interface DropDownMapper {

    List<DropDown> getRoles();

    List<DropDown> getOrganizations();
}
