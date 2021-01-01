package com.github.cxksliling.forfun.services

import com.intellij.openapi.project.Project
import com.github.cxksliling.forfun.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
