pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn clean'
                }
            }
        }

        stage ('Testing Stage:Firefox') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn verify -Dcontext=firefox -Dwebdriver.driver=firefox'
                }
            }
        }
        
         stage ('Testing Stage: Chrome') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn verify -Dcontext=chrome -Dwebdriver.driver=chrome'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_5_0') {
                    echo 'Deployment...'
                }
            }
        }
        
        stage ('Publish Reports') {
            steps {
               publishHTML([allowMissing: true, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '\\target\\site\\serenity', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
            }
        }
    }
}
