package com.blogpessoal.blogpessoal.reporitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal.model.Postagens;

@Repository
public interface PostagemRepository extends JpaRepository<Postagens, Long> {

}
