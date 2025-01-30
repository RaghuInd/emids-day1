package com.example.demo.wallet;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Component
public class WalletServiceImpl implements WalletService {

	// @Autowired
	private WalletDao walletDao;

	// @Autowired
	public WalletServiceImpl(@Autowired WalletDao walletDao) { // good practice
		super();
		//
		this.walletDao = walletDao;
	}

	@Override
	public Wallet register(Wallet wallet) {
		// TODO Auto-generated method stub
		// logic to persist wallet using JPA

		return this.walletDao.save(wallet);
	}

	@Override
	public Double depositFunds(Integer walletId, Double funds) {
		// TODO Auto-generated method stub
		Optional<Wallet> foundWalletOpt = this.walletDao.findById(walletId);
		Wallet foundWallet = null;
		if (foundWalletOpt.isPresent()) {
			foundWallet = foundWalletOpt.get();
			foundWallet.setBalance(foundWallet.getBalance() + funds);
			this.walletDao.save(foundWallet);
		}
//		else
//			throw new WalletException("Wallet not found : "+walletId);

		return foundWallet.getBalance();
	}

	@Override
	public Double withdrawFunds(Integer walletId, Double funds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean fundTransfer(Integer fromId, Integer toId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wallet deregister(Integer walletId) {
		// TODO Auto-generated method stub
		return null;
	}

}
