package tca.service.enquiry;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tca.entity.enquiry.Request;
import tca.mapper.enquiry.EnquiryMapper;
import tca.model.EnquiryFilter;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	Logger log = LoggerFactory.getLogger(EnquiryServiceImpl.class);

    @Autowired
    private EnquiryMapper mapper;
    public List<Request> getRequestList(EnquiryFilter filter) {
        return mapper.getRequestList(filter);
    }
	@Override
	public long getTotalCount(EnquiryFilter filter) {
		return mapper.getTotalCount(filter);
	}
	@Override
	public long getTotalNotFilteredCount() {
		return mapper.getTotalNotFilteredCount();
	}
}
