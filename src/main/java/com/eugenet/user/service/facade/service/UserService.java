package com.eugenet.user.service.facade.service;

import com.eugenet.user.service.facade.entity.UserEntity;
import com.eugenet.user.service.facade.repository.UserEntityRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityRepository repository;

    public List<UserEntity> listAll() {
        return repository.findAll();
    }

}
