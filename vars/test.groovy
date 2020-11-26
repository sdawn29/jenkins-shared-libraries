#!/usr/bin/env groovy

def call(String name, String lname, String Enviornment) {
    def shsript = '''#!/bin/bash
                    NAME=$1
                    LASTNAME=$2
                    echo "Hello, $NAME $LASTNAME"'''
    pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    echo "script $shscript"
                }
            }
        }
    }
}
