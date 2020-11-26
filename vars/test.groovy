#!/usr/bin/env groovy
 
def call(String name, String lname, String Enviornment) {
 pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    sh '''#!/bin/bash
                    NAME=$1
                    echo "Hello, $NAME'''+Dawn+'''
                    '''
                }
            }
        }
    }
}
