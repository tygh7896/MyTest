package egov.mytest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egov.mytest.service.MyTestService;
import egov.mytest.service.MyTestVO;

@Service("mytestService")
public class MyTestServiceImpl implements MyTestService{

	@Resource(name="mytestMapper")
	private MyTestMapper mytestMapper;
	
	@Override
	public List<?> list(MyTestVO mytestVO){
		return mytestMapper.getList(mytestVO);
	}
}
