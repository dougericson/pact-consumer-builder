pipeline {
    agent any
    tools {
    	maven 'maven'
        jdk 'openjdk-11'
    }

    stages {
        stage('Build') {
            steps {
		sh 'mvn -Dmaven.test.failure.ignore=true compile'
            }
        }
        stage('Test') {
            steps {
		sh 'mvn test'
            }
        }
    }
}
