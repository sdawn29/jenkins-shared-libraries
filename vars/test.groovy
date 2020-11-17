#!/usr/bin/env groovy

def call(String name = 'human') {
  pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello, world'
                }
            }
        }
    }
}
}
