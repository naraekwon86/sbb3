package com.ll.sbb3.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
}
