package egov.mytest.service.impl;

import java.util.List;

import egov.mytest.service.MyTestVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("mytestMapper")
public interface MyTestMapper {
	
	List<?> getList(MyTestVO mytestVO);

}
