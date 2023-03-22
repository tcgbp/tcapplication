package tca.service.enquiry;

import tca.entity.enquiry.Request;
import tca.model.EnquiryFilter;

import java.util.List;

public interface EnquiryService {
    List<Request> getRequestList(EnquiryFilter filter);

	long getTotalCount(EnquiryFilter filter);

	long getTotalNotFilteredCount();
}
