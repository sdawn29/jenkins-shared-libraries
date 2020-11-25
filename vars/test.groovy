#!/usr/bin/env groovy

def call(String port, String src, String Enviornment) {
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
                    sh "nohup node ${src} &"
                    echo "Server is listening in port ${port}"
                    echo "Enviornment: ${Enviornment}"
                }
            }
        }
    }
}
