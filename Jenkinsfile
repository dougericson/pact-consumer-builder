pipeline {
    agent any
    tools {
    	maven 'Maven 3.6.3'
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
