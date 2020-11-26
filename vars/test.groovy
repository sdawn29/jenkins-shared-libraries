#!/usr/bin/env groovy
 
def call(String name, String lname, String Enviornment) {
 pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    sh '''#!/bin/bash
                    NAME=$1
                    LASTNAME=$2
                    echo "Hello, $NAME $LASTNAME'''+'''Dawn'''
                }
            }
        }
    }
}
