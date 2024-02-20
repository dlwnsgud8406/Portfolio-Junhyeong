package com.junhyeong.portfolio.admin.context.introduction.service

import com.junhyeong.portfolio.admin.context.introduction.form.IntroductionForm
import com.junhyeong.portfolio.admin.data.TableDTO
import com.junhyeong.portfolio.domain.entity.Introduction
import com.junhyeong.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {
    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }


    @Transactional
    fun save(form: IntroductionForm){
        val introduction = form.toEntity()
        introductionRepository.save(introduction)
    }

    @Transactional
    fun update(id: Long, form: IntroductionForm){
        val introduction = form.toEntity(id)
        introductionRepository.save(introduction)
    }
}