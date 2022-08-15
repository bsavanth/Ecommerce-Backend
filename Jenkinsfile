pipeline
{
    agent any
    tools
    {
        maven 'maven'
    }
    stages
    {
        stage('Get github repo'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bsavanth/Ecommerce-Backend']]])

            }
        }
        stage('Build snapshot using maven')
        {
            steps
            {

                bat 'mvn clean install'
            }
        }
        stage('Build docker image')
        {
            steps
            {
                    bat 'docker build -t bsavanth/ecomjenkins .'
            }
        }
        stage ('push image to Hub')
        {
            steps
            {
                script
                {

                    bat 'docker login -u bsavanth -p Abhijeeth6 docker.io'
                    bat 'docker push bsavanth/ecomjenkins'
                }
            }
        }
    }
}