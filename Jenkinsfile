pipeline {
    agent any
    environment {
        DAF_KEYSTORE_PASSWORD = credentials('daf.keystore')
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                withCredentials([usernamePassword(credentialsId: 'amazon', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                    sh 'echo $PASSWORD'
                    // also available as a Groovy variable
                    echo USERNAME
                    // or inside double quotes for string interpolation
                    echo "username is $USERNAME"
                }
                sh 'curl https://postman-echo.com/get?foo1=$DAF_KEYSTORE_PASSWORD'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
