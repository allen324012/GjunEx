package Dao.member;

import java.util.List;

import javax.persistence.EntityManager;

import Dao.DbConnection;
import Model.member;

public interface memberDao {
	//create
	void add(member m);
	//read
	member queryMember(String username,String password);
	List<member> queryAll();
	member queryMember(int id);	
	//update
	void update(member m);
	//delete
	void delete(int id);
	
	

}
