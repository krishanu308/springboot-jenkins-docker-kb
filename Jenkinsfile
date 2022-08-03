pipeline {
	agent any
	environment{
		DOCKER_TAG = getDockerTag()
	}
		stages{
			stage('Build Dcoker Image'){
				steps{
					sh "docker build . -t krishanu/springboot-jenkins-docker-kb:${DOCKER_TAG}"	
				}
			}
		}
}

def getDockerTag(){
 	def tag = sh script: 'git rev-parse HEAD', returnStdout: true
 	return tag
 }