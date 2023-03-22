package tca.model;

public interface BootStrapTableSearchFilter<T> {
    T getFilter();

    void setFilter(T filter);

    String getSearch();

    void setSearch(String search);

    String getSort();

    void setSort(String sort);

    String getOrder();

    void setOrder(String order);

    Integer getOffset();

    void setOffset(Integer offset);

    Integer getLimit();

    void setLimit(Integer limit);
}
