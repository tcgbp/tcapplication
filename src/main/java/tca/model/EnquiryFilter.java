package tca.model;

import tca.entity.enquiry.Request;

public class EnquiryFilter implements BootStrapTableSearchFilter<Request> {
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Request getFilter() {
        return filter;
    }

    public void setFilter(Request filter) {
        this.filter = filter;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    private String search;
    private Request filter;
    private String sort;
    private String order;
    private Integer offset;
    private Integer limit;
}
