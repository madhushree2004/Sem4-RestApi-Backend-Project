package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Movies.Model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Integer>
{

}
