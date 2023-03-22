package tca.mapper.enquiry;

import org.apache.ibatis.annotations.Mapper;
import tca.entity.enquiry.Request;
import tca.model.EnquiryFilter;

import java.util.List;

@Mapper
public interface EnquiryMapper {

    List<Request> getRequestList(EnquiryFilter filter);

	long getTotalCount(EnquiryFilter filter);

	long getTotalNotFilteredCount();

}
