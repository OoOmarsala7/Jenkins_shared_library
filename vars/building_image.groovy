#!/usr/bin/env groovy
def call() {
    echo "packging the application"
    sh 'mvn package'
}