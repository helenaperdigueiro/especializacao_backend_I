package com.dh.useraccount.service;

import com.dh.useraccount.model.UserAccount;
import com.dh.useraccount.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {

    @Autowired
    UserAccountRepository userAccountRepository;

    @Override
    public List<UserAccount> getAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount post(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }
}
