#!/usr/bin/env groovy

def call(String name, String lname, String Enviornment) {
    pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    sh returnStdout: true, script: '''#!/bin/bash
                                                        NAME=${name}
                                                        LASTNAME=${lname}
                                                        echo "Hello, $NAME $LASTNAME"'''
                }
            }
        }
    }
}
