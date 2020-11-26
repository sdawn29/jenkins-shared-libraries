#!/usr/bin/env groovy

def call(String name, String lname, String Enviornment) {
    pipeline {
        agent any
        stages {
            stage('Run test') { 
                steps {
                    echo "name: "
                    sh '''#!/bin/bash
                          Str="Learn Linux from LinuxHint"
                          subStr=${Str:6:5}
                          echo $subStr
                    '''
                }
            }
        }
    }
}
