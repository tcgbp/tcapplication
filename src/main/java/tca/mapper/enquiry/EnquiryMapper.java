package tca.mapper.enquiry;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tca.entity.enquiry.Request;

import java.util.List;

@Mapper
public interface EnquiryMapper {

    List<Request> getRequestList(@Param("search") String search, @Param("sort") String sort, @Param("order") String order,
                                 @Param("offset") int offset, @Param("limit") int limit);

	long getTotalCount();

	long getTotalNotFilteredCount();

}
