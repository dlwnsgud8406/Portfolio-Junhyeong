package com.junhyeong.portfolio.domain.repository

import com.junhyeong.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ProjectRepository: JpaRepository<Project, Long> {
    // select * from project where is_active = :isActive
    @Query("select p from Project p left join fetch p.skills s left join fetch s.skill where p.isActive = :isActive")
    fun findAllByIsActive(isActive: Boolean) : List<Project>


    // 그대로 쓰면 성능이 안좋아서 override를 통한 customize
    @Query("select p from Project p left join fetch p.details where p.id = :id")
    override fun findById(id: Long): Optional<Project>



}
