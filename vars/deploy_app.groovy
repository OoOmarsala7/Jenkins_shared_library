#!/use/bin/env groovy
def call() {
    def imageName = env.IMAGE_NAME
    echo "Deploying the container to Docker Hub"
    sh "docker push $imageName"

}