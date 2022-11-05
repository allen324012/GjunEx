package Dao.porder;

import java.util.List;

import Model.porder;

public interface porderDao {
	//Create
	void add(porder p);
	//Read
	List<porder> queryAll();
	List<porder> querySum(int start,int end);
	porder queryId(int id);
	//update
	void update(porder p);
	//delete
	void delete(int id);

}
