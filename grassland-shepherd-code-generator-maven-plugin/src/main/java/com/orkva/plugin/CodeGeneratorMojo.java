package com.orkva.plugin;

import com.orkva.plugin.service.DataAccessService;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.Objects;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class CodeGeneratorMojo extends AbstractMojo {
    /**
     * Output Directory.
     */
    @Parameter(property = "generate.outputDirectory",
            defaultValue = "${project.build.directory}/generated-sources/code-generator", required = true)
    private File outputDirectory;
    @Parameter(property = "generate.targetProject")
    private String targetProject;
    @Parameter(property = "project.artifactId")
    private String currentProject;
    @Parameter(property = "generate.jdbcURL")
    private String jdbcURL;
    @Parameter(property = "generate.jdbcUser")
    private String jdbcUser;
    @Parameter(property = "generate.jdbcPassword")
    private String jdbcPassword;

    @lombok.SneakyThrows
    @Override
    public void execute() throws MojoExecutionException {
        System.out.println(currentProject);
        if (!Objects.equals(targetProject, currentProject)) {
            return ;
        }
        System.out.println("Success");
        DataAccessService dataAccessService = new DataAccessService();
        dataAccessService.foo(jdbcURL, jdbcUser, jdbcPassword);

    }
}
