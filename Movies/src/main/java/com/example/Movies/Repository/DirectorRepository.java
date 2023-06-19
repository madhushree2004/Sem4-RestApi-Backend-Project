package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Movies.Model.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director,Long>
{

}
