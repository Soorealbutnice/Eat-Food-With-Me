package main_MVC;



public interface MemberDao {

	int register(MemberDto memberDto);
	MemberDto login(String id, String pass);
	
}
