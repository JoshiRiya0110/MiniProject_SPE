pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'calculator_image'
        GITHUB_REPO_URL = 'https://github.com/JoshiRiya0110/MiniProject_SPE.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository abc
                    git branch: 'master', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Maven Build and Test') {
            steps {
                script{
                    sh 'mvn clean package'
                    sh 'mvn test'
                }
            }
        }

         stage('Build Docker Image') {
            steps {
                script {
                    //remove the container if it already exists 
                    sh 'docker rm -f container_project || true'
                    
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                    
                }
            }
         }

         stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'docker-hub-credential') {
                        sh 'docker tag calculator_image joshiriya/calculator_image:latest'
                        sh 'docker push joshiriya/calculator_image'
                    }
                }
            }
         }

         stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                    )
               }
            }
        }

    }

}
