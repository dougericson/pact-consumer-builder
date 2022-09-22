pipeline {
    agent any
    tools {
    	maven 'maven'
        jdk 'openjdk-11'
    }

    stages {
        stage('Initialize') {
            steps {
            	ssh '''
			echo "PATH = ${PATH}"
			echo "M2_HOME = ${M2_HOME}"
		'''
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....'
            }
        }
    }
}
