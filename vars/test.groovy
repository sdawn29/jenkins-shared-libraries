#!/usr/bin/env groovy
 
def call(String name, String lname, String Enviornment) {
    pipeline {
     def shsript = """#!/bin/bash
                    NAME=\$51
                    LASTNAME=\$52
                    echo "Hello, \$5NAME \$5LASTNAME"""
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
