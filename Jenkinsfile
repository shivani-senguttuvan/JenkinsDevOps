pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh 'mvn clean package'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing...'
                sh 'mvn --version'
            }
        }
    }
}
