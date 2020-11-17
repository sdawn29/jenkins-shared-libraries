#!/usr/bin/env groovy

def call(String name = 'human') {
  pipeline {
    agent any
    stages {
        stage('Initialization') {
            steps {
                echo 'Pipeline has been initialized'
                }
            }
            stage('Instaling Dependencies') { 
                steps {
                    sh 'npm install' 
                }
            }
            stage('Start Node Server') { 
                steps {
                    sh 'node index.js' 
                }
            }
        }
    }
}
