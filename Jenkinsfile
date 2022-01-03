pipeline {
  agent any
  stages {
    stage('Build Source') {
      steps {
        bat 'mvn test -DBROWSER=firefox'
        bat 'mvn test -DBROWSER=chrome'
      }
    }

    stage('Run on Chrome') {
      parallel {
        stage('Run on Chrome') {
          steps {
            bat 'mvn test -DBROWSER=chrome'
          }
        }

        stage('Run on Firefox') {
          steps {
            bat 'mvn test -DBROWSER=firefox'
          }
        }

      }
    }

  }
}