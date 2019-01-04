package main_MVC;


public class MemberServiceImpl implements MemberService {

	private MemberDao memberDao;
	
	public MemberServiceImpl() {
		memberDao = new MemberDaoImpl();
	}
	
	@Override
	public int register(MemberDto memberDto) {
		return memberDao.register(memberDto);
	}

	@Override
	public MemberDto login(String id, String pass) {
		if(id == null || pass == null) {
			System.out.println("null");
			return null;
		}
		return memberDao.login(id, pass);
	}

}
