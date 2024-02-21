package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Account
import com.junhyeong.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface AccountRepository: JpaRepository<Account, Long> {

    fun findByLoginId(loginId: String): Optional<Account>

}
