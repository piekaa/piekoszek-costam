package com.github.piekaa.piekoszekcostam.services

import com.github.piekaa.piekoszekcostam.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
