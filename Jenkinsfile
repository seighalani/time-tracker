pipeline {
    agent { label 'agent1' }
    tools {
        maven 'maven3.8'
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean"
            }
        }    
            stage('Test') {
            steps {
                sh "mvn test"
                
            }
        }            
            stage('Package') {
            steps {
                sh "mvn package"
                
            }
        }
    }
}
