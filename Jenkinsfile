pipeline {
    agent any
    environment {
        gitBranch = "${GIT_BRANCH}"
    }
    stages {
        stage('Verify changes') {
            steps {
                sh "git log -1 | grep Author | awk '{print \$2}' > lastCommitAuthor.txt "
                script {
                    lastCommitAuthor = readFile("lastCommitAuthor.txt").trim()
                    if ( lastCommitAuthor == "jenkins.a" ) {
                        echo "There are no changes since the last release. Aborting"
                        currentBuild.result = 'ABORTED'
                        error('Stopping early…')
                    } else {
                        echo "Changes detected since last release. Last commit made by ${lastCommitAuthor}. Proceeding."
                    }
                }
            }
        }

        stage('Check Docker Image Version in Nexus') {
            steps {
            }
        }

        stage('Build Contianer Image') {
            steps {
            }
        }
        stage('Push Container Image to Nexus') {
            steps {
            }
        }
        stage('Trigger Deployment Job'){
            steps{
                 script {
                 }
            }
        }

	stage('Finish release') {
            steps {
            }
        }
    }
    post {
    	 always {
	  cleanWs() 
	    emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                to: 'rimsopheap@gmail.com,laingphearin@gmail.com',
                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}"
         }
    }

}
