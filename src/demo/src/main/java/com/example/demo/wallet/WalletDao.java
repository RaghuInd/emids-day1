package com.example.demo.wallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface WalletDao extends JpaRepository<Wallet, Integer> {

}
