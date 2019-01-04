package main_MVC;


public interface MemberService {

	int register(MemberDto memberDto);
	MemberDto login(String id, String pass);
	
}
