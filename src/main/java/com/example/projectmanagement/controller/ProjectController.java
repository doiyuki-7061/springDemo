package com.example.projectmanagement.controller;

import com.example.projectmanagement.entity.Project;
import com.example.projectmanagement.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ProjectController {

    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/projects")
    public String getProjects(Model model) {
        // 1. データベースからデータを取得
        List<Project> projectList = projectRepository.findAll();

        // 2. 画面（HTML）にデータを渡す
        model.addAttribute("projectList", projectList);

        // 3. 表示するHTMLファイル名（src/main/resources/templates/projects.html）を指定
        return "projects";
    }
}
