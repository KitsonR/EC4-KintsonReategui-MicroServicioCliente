package com.idat.EFKINTSONREATEGUI.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFKINTSONREATEGUI.MODEL.Cliente;


@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

}
