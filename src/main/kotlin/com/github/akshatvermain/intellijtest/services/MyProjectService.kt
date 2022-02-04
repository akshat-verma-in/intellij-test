package com.github.akshatvermain.intellijtest.services

import com.intellij.openapi.project.Project
import com.github.akshatvermain.intellijtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
