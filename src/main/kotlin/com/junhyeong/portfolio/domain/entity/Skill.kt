package com.junhyeong.portfolio.domain.entity

import com.junhyeong.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(name: String, type: String, isActive: Boolean): BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null
    val name: String = name

    @Column(name="skill_type") // oracle에서는 type이라는 예약어와 겹칠 수 있음
    @Enumerated(value = EnumType.STRING)
    var type: SkillType = SkillType.valueOf(type) // constant에 만들어 놓은 enum을 찾아서 사용하는 것임
    var isActive: Boolean = isActive

}
