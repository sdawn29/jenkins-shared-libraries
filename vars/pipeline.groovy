def call() {
    pipeline {
      agent any
      stages {
        stage('Shared Library stage') {
          steps {
            echo "This is called from shared libray"
          }
        }
      }
    }
}