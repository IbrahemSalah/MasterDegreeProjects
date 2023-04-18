package com.android.assignment6.ui.home

import com.android.assignment6.data.model.WorkExperienceModel

object DataSource {
    const val WORK_EXPERIENCE_UPDATED = "work_experience_updated"
    private val workExperienceList = ArrayList<WorkExperienceModel>()


    fun addDummyWorkExperience() {
        workExperienceList.add(WorkExperienceModel("Language", "Java, JavaScript, SQL, PL"))
        workExperienceList.add(
            WorkExperienceModel(
                "Frameworks/Web",
                "Spring(Boot, MVC, Security), Hibernate, JDBC"
            )
        )
        workExperienceList.add(
            WorkExperienceModel(
                "Microservices/Cloud",
                "AWS, GCP, Docker, Kubernetes, Kafka"
            )
        )
        workExperienceList.add(WorkExperienceModel("Database", "OraclePL/SQL, MySQL, MonoDB"))
        workExperienceList.add(
            WorkExperienceModel(
                "Tools",
                "IntelliJ IDEA, Maven, GitHub, GitLab, UML"
            )
        )
    }

    fun getWorkExperienceList() = workExperienceList

    fun addWorkExperienceList(title: String, desc: String) {
        workExperienceList.add(WorkExperienceModel(title, desc))
    }
}