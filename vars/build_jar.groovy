#!/usr/bin/env groovy
def call(String imageName) {
    env.IMAGE_NAME = imageName
    echo "Building the container"
    sh "docker build -t $imageName ."
    withCredentials([usernamePassword(credentialsId: 'docker_hub', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        echo "Logging in to Docker Hub"
        sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin'
    }
}