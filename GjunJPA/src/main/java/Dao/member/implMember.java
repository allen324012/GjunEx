package Dao.member;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dao.DbConnection;
import Model.member;

public class implMember implements memberDao{

	public static void main(String[] args) {
		//member m=new member("abc","dddeh","1234","taipei");
		//new implMember().add(m);
		
		//System.out.println(new implMember().queryMember(3));
		//member m=new implMember().queryMember(1);
		//m.setAddress("ttt");
		//m.setPassword("0000");
		//new implMember().update(m);
		
		//new implMember().delete(1);

	}

	@Override
	public void add(member m) {
		EntityManager em=DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public member queryMember(String username, String password) {
		EntityManager em=DbConnection.getDb();
		String JPQL="select m from member m where m.username=?1 and m.password=?2";
		Query q=em.createQuery(JPQL);
		q.setParameter(1, username);
		q.setParameter(2, password);
		List<member> l=q.getResultList();
		member[] m=l.toArray(new member[1]);
		
		return m[0];
	}

	@Override
	public List<member> queryAll() {
		EntityManager em=DbConnection.getDb();
		String JPQL="select m from member m";
		Query q=em.createQuery(JPQL);
		List<member> l=q.getResultList();
		return l;
	}

	@Override
	public member queryMember(int id) {
		EntityManager em=DbConnection.getDb();
		String JPQL="select m from member m where m.id=?1";
		Query q=em.createQuery(JPQL);
		q.setParameter(1, id);		
		List<member> l=q.getResultList();
		member[] m=l.toArray(new member[1]);
		return m[0];
	}

	@Override
	public void update(member m) {
		EntityManager em=DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		em.close();
		
		
	}

	@Override
	public void delete(int id) {
		EntityManager em=DbConnection.getDb();
		member m=em.find(member.class, id);
		em.getTransaction().begin();
		em.remove(m);
		em.getTransaction().commit();
		em.close();
		
	}

}
