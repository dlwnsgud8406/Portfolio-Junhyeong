package com.junhyeong.portfolio.admin.context.project.controller

import com.junhyeong.portfolio.admin.context.project.form.ProjectForm
import com.junhyeong.portfolio.admin.context.project.form.ProjectSkillForm
import com.junhyeong.portfolio.admin.context.project.service.AdminProjectService
import com.junhyeong.portfolio.admin.context.project.service.AdminProjectSkillService
import com.junhyeong.portfolio.admin.data.ApiResponse
import com.junhyeong.portfolio.admin.data.TableDTO
import org.apache.coyote.Response
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/api/projects/skills")
class AdminProjectSkillApiController(
    private val adminProjectSkillService: AdminProjectSkillService
) {
    @PostMapping
    fun postProjectSkill(@RequestBody @Validated form: ProjectSkillForm): ResponseEntity<Any>{
        adminProjectSkillService.save(form)

        return ApiResponse.successCreate()
    }

    @DeleteMapping("/{id}")
    fun deleteProjectSkill(@PathVariable id: Long): ResponseEntity<Any>{
        adminProjectSkillService.delete(id)

        return ApiResponse.successDelete()
    }

}
