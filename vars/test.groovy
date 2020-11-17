#!/usr/bin/env groovy

def call(String port) {
    pipeline {
        agent any
        stages {
            stage('Port Kill') {
                steps {
                    sh 'sudo fuser -n tcp -k ${port}'
                }
            }
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
                    sh 'node ./src/index.js' 
                }
            }
        }
    }
}
