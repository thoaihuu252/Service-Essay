package com.ecomm.nhom4.Service.Repository;

import com.ecomm.nhom4.Service.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
