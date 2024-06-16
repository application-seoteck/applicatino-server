pipeline {
  agent any
  stages {
    stage('Source') {
      steps {
        git(url: 'https://github.com/application-seoteck/applicatino-server', branch: 'master')
      }
    }

    stage('Build') {
      steps {
        tool 'gradle'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo "Deploy success"'
      }
    }

  }
}