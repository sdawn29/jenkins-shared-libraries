#!/usr/bin/env groovy

def call(String port, String src) {
    pipeline {
        agent any
        stages {
            stage('Port Kill') {
                steps {
                    echo "sudo fuser -n tcp -k ${port}"
                }
            }
            stage('Initialization') {
                steps {
                    echo "Pipeline has been initialized"
                }
            }
            stage('Instaling Dependencies') { 
                steps {
                    sh "npm install" 
                }
            }
            stage('Start Node Server') { 
                steps {
                    echo "node ${src}" 
                }
            }
        }
    }
}
