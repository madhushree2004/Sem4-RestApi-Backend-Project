package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Movies.Model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer>
{

	Login findByUsername(String username);
	
	@Modifying
	@Query("update Login s set s.password=?1 where s.username=?2")
	public int updateByPassword(String password,String username);
	
	@Modifying
	@Query("delete from Login s where s.username=?1 and s.password=?2 ")
	public int deleteBy(String username,String password);
	
}
