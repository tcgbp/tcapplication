package tca.service.enquiry;

import tca.entity.enquiry.Request;

import java.util.List;

public interface EnquiryService {
    List<Request> getRequestList(String search, String sort, String order, int offset, int limit);

	long getTotalCount(String search);

	long getTotalNotFilteredCount();
}
