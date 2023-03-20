package tca.service.enquiry;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tca.entity.enquiry.Request;
import tca.mapper.enquiry.EnquiryMapper;

@Service
public class EnquiryServiceImpl implements EnquiryService{
	
	Logger log = LoggerFactory.getLogger(EnquiryServiceImpl.class);

    @Autowired
    private EnquiryMapper mapper;
    public List<Request> getRequestList(String search, String sort, String order, int offset, int limit) {
        return mapper.getRequestList(search, sort, order, offset, limit);
    }
	@Override
	public long getTotalCount(String search) {
		return mapper.getTotalCount();
	}
	@Override
	public long getTotalNotFilteredCount() {
		return mapper.getTotalNotFilteredCount();
	}
}
