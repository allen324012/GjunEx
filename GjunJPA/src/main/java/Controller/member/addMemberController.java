package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.member.implMember;
import Model.member;


public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("password");
		
		member m=new member(name,username,password,address);
		
		new implMember().add(m);
	}

}
