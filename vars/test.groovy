#!/usr/bin/env groovy

def call(String name, String lname, String Enviornment) {
    pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    sh script: '''#!/bin/bash
                                NAME="John"
                                LASTNAME="Sam"
                                echo "Hello, $NAME $LASTNAME"'''
                }
            }
        }
    }
}
