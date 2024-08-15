#!/usr/bin/env groovy
def call() {
    echo "test the application ${params.VERSION}"
    sh 'mvn test'
}