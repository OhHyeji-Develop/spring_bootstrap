package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.dto.LoginUserLogVO;

public interface LoginUserLogService {
	
	public void write(List<LoginUserLogVO> logVO) throws Exception;
	// 메서드 이름을 write로 주면 transaction 매니저가 집지 못함.
	// write를 사용하려면 aop-context에 추가해야함.
}
