package com.junhyeong.portfolio.presentation.service

import com.junhyeong.portfolio.presentation.dto.IntroductionDTO
import com.junhyeong.portfolio.presentation.dto.LinkDTO
import com.junhyeong.portfolio.presentation.dto.ProjectDTO
import com.junhyeong.portfolio.presentation.dto.ResumeDTO
import com.junhyeong.portfolio.presentation.repository.PresentationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PresentationService(
    private val presentationRepository: PresentationRepository,
) {

    @Transactional(readOnly = true) // 읽기 전용(스냅샷을 생략함 성능에 이점이 있음)
    fun getIntroduction():List<IntroductionDTO>{
        val introductions = presentationRepository.getActiveIntroductions()

        return introductions.map {IntroductionDTO(it)}
    }

    @Transactional(readOnly = true)
    fun getLinks(): List<LinkDTO>{
        val links = presentationRepository.getActiveLinks()

        return links.map {LinkDTO(it)}
    }

    @Transactional(readOnly = true)
    fun getResume(): ResumeDTO{
        val experiences = presentationRepository.getActiveExperiences()
        val achievements = presentationRepository.getActiveAchievements()
        val skills = presentationRepository.getActiveSkills()

        return ResumeDTO(
            experiences = experiences,
            achievements = achievements,
            skills = skills
        )
    }

    @Transactional(readOnly = true)
    fun getProject() :List<ProjectDTO>{
        val projects = presentationRepository.getActiveProjects()

        return projects.map {ProjectDTO(it)}
    }
}
