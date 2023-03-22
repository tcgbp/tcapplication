package tca.controller;

import jakarta.annotation.security.RolesAllowed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tca.entity.enquiry.Request;
import tca.model.BootstrapTableData;
import tca.model.EnquiryFilter;
import tca.service.enquiry.EnquiryService;

import java.util.List;

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

    @RequestMapping(value = "enquiries", headers = "Accept=application/json")
    public @ResponseBody BootstrapTableData<Request> enquiries(@RequestParam(value = "search", required = false) String search,
                                                               @RequestParam(value = "filter", required = false) Request filter,
                                                               @RequestParam(value = "sort", required = false) String sort,
                                                               @RequestParam(value = "order", required = false) String order,
                                                               @RequestParam(value = "offset", required = false) int offset,
                                                               @RequestParam(value = "limit", required = false) int limit) {
        EnquiryFilter enquiryFilter = new EnquiryFilter();
        enquiryFilter.setFilter(filter);
        enquiryFilter.setLimit(limit);
        enquiryFilter.setOffset(offset);
        enquiryFilter.setOrder(order);
        enquiryFilter.setSearch(search);
        enquiryFilter.setSort(sort);

        List<Request> list = enquiryService.getRequestList(enquiryFilter);
        BootstrapTableData<Request> btd = new BootstrapTableData<>();
        btd.setRows(list);
        if (list.isEmpty())
            btd.setTotal(0);
        else
            btd.setTotal(enquiryService.getTotalCount(enquiryFilter));
        btd.setTotalNotFiltered(enquiryService.getTotalNotFilteredCount());
        return btd;
    }
}
