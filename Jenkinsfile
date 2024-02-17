@Library("my-shared-library")_
pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                // git 'https://github.com/ramugaddam418/mvnproj.git'

                // Run Maven on a Unix agent.
                mavenWorld()
                echo "build_number $BUILD_NUMBER"

                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

                    }
    }
}
