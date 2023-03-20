package tca.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.security.RolesAllowed;
import tca.entity.enquiry.Request;
import tca.model.BootstrapTableData;
import tca.service.enquiry.EnquiryService;

@Controller
@RolesAllowed("ENQUIRY")
public class EnquiryController {
	
	private Logger log = LoggerFactory.getLogger(EnquiryController.class);

    @Autowired
    EnquiryService enquiryService;

	@RequestMapping(value = "enquiry")
	public String enquiry() {
		log.info("Goto enquiry page.");
		return "enquiry";
	}

    @RequestMapping(method = RequestMethod.GET, value = "enquiries", headers = "Accept=application/json")
    public @ResponseBody BootstrapTableData<Request> enquiries(@RequestParam(value = "search", required = false) String search,
                                                 @RequestParam(value = "sort", required = false) String sort,
                                                 @RequestParam(value = "order", required = false) String order,
                                                 @RequestParam(value = "offset", required = false) int offset,
                                                 @RequestParam(value = "limit", required = false) int limit) {
    	List<Request> list = enquiryService.getRequestList(search, sort, order, offset, limit);
    	BootstrapTableData<Request> btd = new BootstrapTableData<>();
    	btd.setRows(list);
    	if(list.isEmpty())
    		btd.setTotal(0);
    	else
    		btd.setTotal(enquiryService.getTotalCount(search));
    	btd.setTotalNotFiltered(enquiryService.getTotalNotFilteredCount());
    	return btd;
    }
}
