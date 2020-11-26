#!/usr/bin/env groovy

def call(String name, String lname, String Enviornment) {
    pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    echo "name: ${name}"
                    sh """  NAME=${name}
                            LASTNAME=${lname}
                            echo "Hello, $NAME $LASTNAME"
                            echo "If you want to see the names, submit values for 3rd parameter"
                        """
                }
            }
        }
    }
}
