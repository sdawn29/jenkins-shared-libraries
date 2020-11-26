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
                    sh ''' #!/bin/bash
                            NAME="John"
                            LASTNAME="Strom"
                            SHOW="true"

                            if [ "$SHOW" = "true" ]; then
                            echo "Hello, $NAME $LASTNAME"
                            else
                            echo "If you want to see the names, submit values for 3rd parameter"
                        '''
                }
            }
        }
    }
}
