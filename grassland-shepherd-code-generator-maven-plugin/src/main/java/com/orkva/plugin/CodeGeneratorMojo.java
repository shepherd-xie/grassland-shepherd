package com.orkva.plugin;

import com.orkva.plugin.service.DataAccessService;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class CodeGeneratorMojo extends AbstractMojo {
    /**
     * Output Directory.
     */
    @Parameter(property = "grassland.shepherd.code.generator.outputDirectory",
            defaultValue = "${project.build.directory}/generated-sources/code-generator", required = true)
    private File outputDirectory;
    @Parameter(property = "grassland.shepherd.code.generator.jdbcDriver")
    private String jdbcDriver;
    @Parameter(property = "grassland.shepherd.code.generator.jdbcURL")
    private String jdbcURL;
    @Parameter(property = "grassland.shepherd.code.generator.jdbcUser")
    private String jdbcUser;
    @Parameter(property = "grassland.shepherd.code.generator.jdbcPassword")
    private String jdbcPassword;

    @lombok.SneakyThrows
    @Override
    public void execute() throws MojoExecutionException {
        System.out.println("url:" + jdbcURL);
//        DataAccessService dataAccessService = new DataAccessService();

    }
}
